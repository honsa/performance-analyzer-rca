// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inter_node_rpc_service.proto

package com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc;

/**
 * Protobuf enum {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceEnum}
 */
public enum ResourceEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * JVM
   * </pre>
   *
   * <code>OLD_GEN = 0 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  OLD_GEN(0),
  /**
   * <code>YOUNG_GEN = 1 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  YOUNG_GEN(1),
  /**
   * <pre>
   * hardware
   * </pre>
   *
   * <code>CPU = 2 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  CPU(2),
  /**
   * <code>IO = 3 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  IO(3),
  /**
   * <pre>
   * threadpool
   * </pre>
   *
   * <code>WRITE_THREADPOOL = 4 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  WRITE_THREADPOOL(4),
  /**
   * <code>SEARCH_THREADPOOL = 5 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  SEARCH_THREADPOOL(5),
  /**
   * <pre>
   * Cache
   * </pre>
   *
   * <code>FIELD_DATA_CACHE = 10 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  FIELD_DATA_CACHE(10),
  /**
   * <code>SHARD_REQUEST_CACHE = 11 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  SHARD_REQUEST_CACHE(11),
  /**
   * <code>NODE_QUERY_CACHE = 12 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  NODE_QUERY_CACHE(12),
  /**
   * <pre>
   * Heap
   * </pre>
   *
   * <code>HEAP = 20 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  HEAP(20),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * JVM
   * </pre>
   *
   * <code>OLD_GEN = 0 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int OLD_GEN_VALUE = 0;
  /**
   * <code>YOUNG_GEN = 1 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int YOUNG_GEN_VALUE = 1;
  /**
   * <pre>
   * hardware
   * </pre>
   *
   * <code>CPU = 2 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int CPU_VALUE = 2;
  /**
   * <code>IO = 3 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int IO_VALUE = 3;
  /**
   * <pre>
   * threadpool
   * </pre>
   *
   * <code>WRITE_THREADPOOL = 4 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int WRITE_THREADPOOL_VALUE = 4;
  /**
   * <code>SEARCH_THREADPOOL = 5 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int SEARCH_THREADPOOL_VALUE = 5;
  /**
   * <pre>
   * Cache
   * </pre>
   *
   * <code>FIELD_DATA_CACHE = 10 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int FIELD_DATA_CACHE_VALUE = 10;
  /**
   * <code>SHARD_REQUEST_CACHE = 11 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int SHARD_REQUEST_CACHE_VALUE = 11;
  /**
   * <code>NODE_QUERY_CACHE = 12 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int NODE_QUERY_CACHE_VALUE = 12;
  /**
   * <pre>
   * Heap
   * </pre>
   *
   * <code>HEAP = 20 [(.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.additional_fields) = { ... }</code>
   */
  public static final int HEAP_VALUE = 20;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ResourceEnum valueOf(int value) {
    return forNumber(value);
  }

  public static ResourceEnum forNumber(int value) {
    switch (value) {
      case 0: return OLD_GEN;
      case 1: return YOUNG_GEN;
      case 2: return CPU;
      case 3: return IO;
      case 4: return WRITE_THREADPOOL;
      case 5: return SEARCH_THREADPOOL;
      case 10: return FIELD_DATA_CACHE;
      case 11: return SHARD_REQUEST_CACHE;
      case 12: return NODE_QUERY_CACHE;
      case 20: return HEAP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResourceEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResourceEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResourceEnum>() {
          public ResourceEnum findValueByNumber(int number) {
            return ResourceEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResourceEnum[] VALUES = values();

  public static ResourceEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResourceEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceEnum)
}

