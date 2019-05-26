// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: channelpackage.proto

package com.ua.mytrinity.tv_client.proto;

public final class Channelpackage {
  private Channelpackage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelPackageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ChannelPackage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>required string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>repeated int32 channels = 3;</code>
     */
    java.util.List<java.lang.Integer> getChannelsList();
    /**
     * <code>repeated int32 channels = 3;</code>
     */
    int getChannelsCount();
    /**
     * <code>repeated int32 channels = 3;</code>
     */
    int getChannels(int index);
  }
  /**
   * Protobuf type {@code proto.ChannelPackage}
   */
  public  static final class ChannelPackage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.ChannelPackage)
      ChannelPackageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelPackage.newBuilder() to construct.
    private ChannelPackage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelPackage() {
      name_ = "";
      channels_ = emptyIntList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelPackage(
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
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                channels_ = newIntList();
                mutable_bitField0_ |= 0x00000004;
              }
              channels_.addInt(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
                channels_ = newIntList();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                channels_.addInt(input.readInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000004) != 0)) {
          channels_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ua.mytrinity.tv_client.proto.Channelpackage.internal_static_proto_ChannelPackage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ua.mytrinity.tv_client.proto.Channelpackage.internal_static_proto_ChannelPackage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage.class, com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>required string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CHANNELS_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList channels_;
    /**
     * <code>repeated int32 channels = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getChannelsList() {
      return channels_;
    }
    /**
     * <code>repeated int32 channels = 3;</code>
     */
    public int getChannelsCount() {
      return channels_.size();
    }
    /**
     * <code>repeated int32 channels = 3;</code>
     */
    public int getChannels(int index) {
      return channels_.getInt(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      for (int i = 0; i < channels_.size(); i++) {
        output.writeInt32(3, channels_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < channels_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(channels_.getInt(i));
        }
        size += dataSize;
        size += 1 * getChannelsList().size();
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
      if (!(obj instanceof com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage)) {
        return super.equals(obj);
      }
      com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage other = (com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (!getChannelsList()
          .equals(other.getChannelsList())) return false;
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
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (getChannelsCount() > 0) {
        hash = (37 * hash) + CHANNELS_FIELD_NUMBER;
        hash = (53 * hash) + getChannelsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parseFrom(
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
    public static Builder newBuilder(com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage prototype) {
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
     * Protobuf type {@code proto.ChannelPackage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ChannelPackage)
        com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ua.mytrinity.tv_client.proto.Channelpackage.internal_static_proto_ChannelPackage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ua.mytrinity.tv_client.proto.Channelpackage.internal_static_proto_ChannelPackage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage.class, com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage.Builder.class);
      }

      // Construct using com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        channels_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ua.mytrinity.tv_client.proto.Channelpackage.internal_static_proto_ChannelPackage_descriptor;
      }

      @java.lang.Override
      public com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage getDefaultInstanceForType() {
        return com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage.getDefaultInstance();
      }

      @java.lang.Override
      public com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage build() {
        com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage buildPartial() {
        com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage result = new com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((bitField0_ & 0x00000004) != 0)) {
          channels_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.channels_ = channels_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage) {
          return mergeFrom((com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage other) {
        if (other == com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (!other.channels_.isEmpty()) {
          if (channels_.isEmpty()) {
            channels_ = other.channels_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureChannelsIsMutable();
            channels_.addAll(other.channels_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        if (!hasName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList channels_ = emptyIntList();
      private void ensureChannelsIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          channels_ = mutableCopy(channels_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated int32 channels = 3;</code>
       */
      public java.util.List<java.lang.Integer>
          getChannelsList() {
        return ((bitField0_ & 0x00000004) != 0) ?
                 java.util.Collections.unmodifiableList(channels_) : channels_;
      }
      /**
       * <code>repeated int32 channels = 3;</code>
       */
      public int getChannelsCount() {
        return channels_.size();
      }
      /**
       * <code>repeated int32 channels = 3;</code>
       */
      public int getChannels(int index) {
        return channels_.getInt(index);
      }
      /**
       * <code>repeated int32 channels = 3;</code>
       */
      public Builder setChannels(
          int index, int value) {
        ensureChannelsIsMutable();
        channels_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 channels = 3;</code>
       */
      public Builder addChannels(int value) {
        ensureChannelsIsMutable();
        channels_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 channels = 3;</code>
       */
      public Builder addAllChannels(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureChannelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, channels_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 channels = 3;</code>
       */
      public Builder clearChannels() {
        channels_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:proto.ChannelPackage)
    }

    // @@protoc_insertion_point(class_scope:proto.ChannelPackage)
    private static final com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage();
    }

    public static com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ChannelPackage>
        PARSER = new com.google.protobuf.AbstractParser<ChannelPackage>() {
      @java.lang.Override
      public ChannelPackage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelPackage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelPackage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelPackage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ua.mytrinity.tv_client.proto.Channelpackage.ChannelPackage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ChannelPackage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ChannelPackage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024channelpackage.proto\022\005proto\"<\n\016Channel" +
      "Package\022\n\n\002id\030\001 \002(\005\022\014\n\004name\030\002 \002(\t\022\020\n\010cha" +
      "nnels\030\003 \003(\005B\"\n com.ua.mytrinity.tv_clien" +
      "t.proto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_ChannelPackage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_ChannelPackage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ChannelPackage_descriptor,
        new java.lang.String[] { "Id", "Name", "Channels", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}