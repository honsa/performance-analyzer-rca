/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package com.amazon.opendistro.elasticsearch.performanceanalyzer.decisionmaker.deciders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazon.opendistro.elasticsearch.performanceanalyzer.decisionmaker.actions.Action;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceEnum;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.metrics.AllMetrics.NodeRole;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.RcaTestHelper;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.Resources;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.summaries.HotNodeSummary;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.summaries.ResourceUtil;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.store.rca.cluster.QueueRejectionClusterRca;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.reader.ClusterDetailsEventProcessorTestHelper;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class QueueHealthDeciderTest {

  @Before
  public void setupCluster() throws SQLException, ClassNotFoundException {
    ClusterDetailsEventProcessorTestHelper clusterDetailsEventProcessorTestHelper = new ClusterDetailsEventProcessorTestHelper();
    clusterDetailsEventProcessorTestHelper.addNodeDetails("node1", "127.0.0.1", false);
    clusterDetailsEventProcessorTestHelper.addNodeDetails("node2", "127.0.0.2", false);
    clusterDetailsEventProcessorTestHelper.addNodeDetails("node3", "127.0.0.3", false);
    clusterDetailsEventProcessorTestHelper.addNodeDetails("node4", "127.0.0.4", false);
    clusterDetailsEventProcessorTestHelper.addNodeDetails("master", "127.0.0.9", NodeRole.ELECTED_MASTER, true);
    clusterDetailsEventProcessorTestHelper.generateClusterDetailsEvent();
  }

  @Test
  public void testHighRejectionRemediation() {
    RcaTestHelper<HotNodeSummary> nodeRca = new RcaTestHelper<>("QueueRejectionNodeRca");
    // node1: Both write and search queues unhealthy
    // node2: Only write unhealthy
    // node3: Only search unhealthy
    // node4: all queues healthy
    nodeRca.mockFlowUnit(
        RcaTestHelper.generateFlowUnit("node1", "127.0.0.1", Resources.State.UNHEALTHY,
            ResourceUtil.WRITE_QUEUE_REJECTION, ResourceUtil.SEARCH_QUEUE_REJECTION),
        RcaTestHelper.generateFlowUnit("node2", "127.0.0.2", Resources.State.UNHEALTHY, ResourceUtil.WRITE_QUEUE_REJECTION),
        RcaTestHelper.generateFlowUnit("node3", "127.0.0.3", Resources.State.UNHEALTHY, ResourceUtil.SEARCH_QUEUE_REJECTION),
        RcaTestHelper.generateFlowUnit("node4", "127.0.0.4", Resources.State.HEALTHY)
    );

    QueueRejectionClusterRca queueClusterRca = new QueueRejectionClusterRca(1, nodeRca);
    queueClusterRca.generateFlowUnitListFromLocal(null);
    QueueHealthDecider decider = new QueueHealthDecider(5, 12, queueClusterRca);

    // Since deciderFrequency is 12, the first 11 invocations return empty decision
    for (int i = 0; i < 11; i++) {
      Decision decision = decider.operate();
      assertTrue(decision.isEmpty());
    }

    Decision decision = decider.operate();
    assertEquals(4, decision.getActions().size());

    Map<String, Map<ResourceEnum, Integer>> nodeActionCounter = new HashMap<>();
    for (Action action: decision.getActions()) {
      assertEquals(1, action.impactedNodes().size());
      String nodeId = action.impactedNodes().get(0).getNodeId();
      String summary = action.summary();
      if (summary.contains(ResourceEnum.WRITE_THREADPOOL.toString())) {
        nodeActionCounter.computeIfAbsent(nodeId, k -> new HashMap<>()).merge(ResourceEnum.WRITE_THREADPOOL, 1, Integer::sum);
      }
      if (summary.contains(ResourceEnum.SEARCH_THREADPOOL.toString())) {
        nodeActionCounter.computeIfAbsent(nodeId, k -> new HashMap<>()).merge(ResourceEnum.SEARCH_THREADPOOL, 1, Integer::sum);
      }
    }

    assertEquals(2, nodeActionCounter.get("node1").size());
    assertEquals(1, (int) nodeActionCounter.get("node1").get(ResourceEnum.WRITE_THREADPOOL));
    assertEquals(1, (int) nodeActionCounter.get("node1").get(ResourceEnum.SEARCH_THREADPOOL));
    assertEquals(1, nodeActionCounter.get("node2").size());
    assertEquals(1, (int) nodeActionCounter.get("node2").get(ResourceEnum.WRITE_THREADPOOL));
    assertEquals(1, nodeActionCounter.get("node3").size());
    assertEquals(1, (int) nodeActionCounter.get("node3").get(ResourceEnum.SEARCH_THREADPOOL));
    assertFalse(nodeActionCounter.containsKey("node4"));
  }
}
