// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inter_node_rpc_service.proto

package com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc;

/**
 * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList}
 */
public  final class HotShardSummaryList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList)
    HotShardSummaryListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotShardSummaryList.newBuilder() to construct.
  private HotShardSummaryList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotShardSummaryList() {
    hotShardSummary_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HotShardSummaryList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              hotShardSummary_ = new java.util.ArrayList<com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            hotShardSummary_.add(
                input.readMessage(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        hotShardSummary_ = java.util.Collections.unmodifiableList(hotShardSummary_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_HotShardSummaryList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_HotShardSummaryList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList.Builder.class);
  }

  public static final int HOTSHARDSUMMARY_FIELD_NUMBER = 1;
  private java.util.List<com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage> hotShardSummary_;
  /**
   * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
   */
  public java.util.List<com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage> getHotShardSummaryList() {
    return hotShardSummary_;
  }
  /**
   * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
   */
  public java.util.List<? extends com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessageOrBuilder> 
      getHotShardSummaryOrBuilderList() {
    return hotShardSummary_;
  }
  /**
   * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
   */
  public int getHotShardSummaryCount() {
    return hotShardSummary_.size();
  }
  /**
   * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
   */
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage getHotShardSummary(int index) {
    return hotShardSummary_.get(index);
  }
  /**
   * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
   */
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessageOrBuilder getHotShardSummaryOrBuilder(
      int index) {
    return hotShardSummary_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < hotShardSummary_.size(); i++) {
      output.writeMessage(1, hotShardSummary_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hotShardSummary_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hotShardSummary_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList)) {
      return super.equals(obj);
    }
    com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList other = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList) obj;

    if (!getHotShardSummaryList()
        .equals(other.getHotShardSummaryList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getHotShardSummaryCount() > 0) {
      hash = (37 * hash) + HOTSHARDSUMMARY_FIELD_NUMBER;
      hash = (53 * hash) + getHotShardSummaryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList)
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_HotShardSummaryList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_HotShardSummaryList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList.Builder.class);
    }

    // Construct using com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getHotShardSummaryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (hotShardSummaryBuilder_ == null) {
        hotShardSummary_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hotShardSummaryBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_HotShardSummaryList_descriptor;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList getDefaultInstanceForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList.getDefaultInstance();
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList build() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList buildPartial() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList result = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList(this);
      int from_bitField0_ = bitField0_;
      if (hotShardSummaryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hotShardSummary_ = java.util.Collections.unmodifiableList(hotShardSummary_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hotShardSummary_ = hotShardSummary_;
      } else {
        result.hotShardSummary_ = hotShardSummaryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList) {
        return mergeFrom((com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList other) {
      if (other == com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList.getDefaultInstance()) return this;
      if (hotShardSummaryBuilder_ == null) {
        if (!other.hotShardSummary_.isEmpty()) {
          if (hotShardSummary_.isEmpty()) {
            hotShardSummary_ = other.hotShardSummary_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHotShardSummaryIsMutable();
            hotShardSummary_.addAll(other.hotShardSummary_);
          }
          onChanged();
        }
      } else {
        if (!other.hotShardSummary_.isEmpty()) {
          if (hotShardSummaryBuilder_.isEmpty()) {
            hotShardSummaryBuilder_.dispose();
            hotShardSummaryBuilder_ = null;
            hotShardSummary_ = other.hotShardSummary_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hotShardSummaryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHotShardSummaryFieldBuilder() : null;
          } else {
            hotShardSummaryBuilder_.addAllMessages(other.hotShardSummary_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage> hotShardSummary_ =
      java.util.Collections.emptyList();
    private void ensureHotShardSummaryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hotShardSummary_ = new java.util.ArrayList<com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage>(hotShardSummary_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessageOrBuilder> hotShardSummaryBuilder_;

    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public java.util.List<com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage> getHotShardSummaryList() {
      if (hotShardSummaryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hotShardSummary_);
      } else {
        return hotShardSummaryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public int getHotShardSummaryCount() {
      if (hotShardSummaryBuilder_ == null) {
        return hotShardSummary_.size();
      } else {
        return hotShardSummaryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage getHotShardSummary(int index) {
      if (hotShardSummaryBuilder_ == null) {
        return hotShardSummary_.get(index);
      } else {
        return hotShardSummaryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder setHotShardSummary(
        int index, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage value) {
      if (hotShardSummaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotShardSummaryIsMutable();
        hotShardSummary_.set(index, value);
        onChanged();
      } else {
        hotShardSummaryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder setHotShardSummary(
        int index, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder builderForValue) {
      if (hotShardSummaryBuilder_ == null) {
        ensureHotShardSummaryIsMutable();
        hotShardSummary_.set(index, builderForValue.build());
        onChanged();
      } else {
        hotShardSummaryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder addHotShardSummary(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage value) {
      if (hotShardSummaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotShardSummaryIsMutable();
        hotShardSummary_.add(value);
        onChanged();
      } else {
        hotShardSummaryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder addHotShardSummary(
        int index, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage value) {
      if (hotShardSummaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotShardSummaryIsMutable();
        hotShardSummary_.add(index, value);
        onChanged();
      } else {
        hotShardSummaryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder addHotShardSummary(
        com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder builderForValue) {
      if (hotShardSummaryBuilder_ == null) {
        ensureHotShardSummaryIsMutable();
        hotShardSummary_.add(builderForValue.build());
        onChanged();
      } else {
        hotShardSummaryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder addHotShardSummary(
        int index, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder builderForValue) {
      if (hotShardSummaryBuilder_ == null) {
        ensureHotShardSummaryIsMutable();
        hotShardSummary_.add(index, builderForValue.build());
        onChanged();
      } else {
        hotShardSummaryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder addAllHotShardSummary(
        java.lang.Iterable<? extends com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage> values) {
      if (hotShardSummaryBuilder_ == null) {
        ensureHotShardSummaryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hotShardSummary_);
        onChanged();
      } else {
        hotShardSummaryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder clearHotShardSummary() {
      if (hotShardSummaryBuilder_ == null) {
        hotShardSummary_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hotShardSummaryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public Builder removeHotShardSummary(int index) {
      if (hotShardSummaryBuilder_ == null) {
        ensureHotShardSummaryIsMutable();
        hotShardSummary_.remove(index);
        onChanged();
      } else {
        hotShardSummaryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder getHotShardSummaryBuilder(
        int index) {
      return getHotShardSummaryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessageOrBuilder getHotShardSummaryOrBuilder(
        int index) {
      if (hotShardSummaryBuilder_ == null) {
        return hotShardSummary_.get(index);  } else {
        return hotShardSummaryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public java.util.List<? extends com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessageOrBuilder> 
         getHotShardSummaryOrBuilderList() {
      if (hotShardSummaryBuilder_ != null) {
        return hotShardSummaryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hotShardSummary_);
      }
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder addHotShardSummaryBuilder() {
      return getHotShardSummaryFieldBuilder().addBuilder(
          com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder addHotShardSummaryBuilder(
        int index) {
      return getHotShardSummaryFieldBuilder().addBuilder(
          index, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage hotShardSummary = 1;</code>
     */
    public java.util.List<com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder> 
         getHotShardSummaryBuilderList() {
      return getHotShardSummaryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessageOrBuilder> 
        getHotShardSummaryFieldBuilder() {
      if (hotShardSummaryBuilder_ == null) {
        hotShardSummaryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessage.Builder, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryMessageOrBuilder>(
                hotShardSummary_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hotShardSummary_ = null;
      }
      return hotShardSummaryBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList)
  }

  // @@protoc_insertion_point(class_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList)
  private static final com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList();
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotShardSummaryList>
      PARSER = new com.google.protobuf.AbstractParser<HotShardSummaryList>() {
    @java.lang.Override
    public HotShardSummaryList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HotShardSummaryList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotShardSummaryList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotShardSummaryList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HotShardSummaryList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
