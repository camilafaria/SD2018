// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package gRPC.proto;

/**
 * Protobuf type {@code gRPC.Long8x}
 */
public  final class Long8x extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gRPC.Long8x)
    Long8xOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Long8x.newBuilder() to construct.
  private Long8x(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Long8x() {
    value1_ = 0L;
    value2_ = 0L;
    value3_ = 0L;
    value4_ = 0L;
    value5_ = 0L;
    value6_ = 0L;
    value7_ = 0L;
    value8_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Long8x(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            value1_ = input.readInt64();
            break;
          }
          case 16: {

            value2_ = input.readInt64();
            break;
          }
          case 24: {

            value3_ = input.readInt64();
            break;
          }
          case 32: {

            value4_ = input.readInt64();
            break;
          }
          case 40: {

            value5_ = input.readInt64();
            break;
          }
          case 48: {

            value6_ = input.readInt64();
            break;
          }
          case 56: {

            value7_ = input.readInt64();
            break;
          }
          case 64: {

            value8_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gRPC.proto.MyProto.internal_static_gRPC_Long8x_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gRPC.proto.MyProto.internal_static_gRPC_Long8x_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gRPC.proto.Long8x.class, gRPC.proto.Long8x.Builder.class);
  }

  public static final int VALUE1_FIELD_NUMBER = 1;
  private long value1_;
  /**
   * <code>int64 value1 = 1;</code>
   */
  public long getValue1() {
    return value1_;
  }

  public static final int VALUE2_FIELD_NUMBER = 2;
  private long value2_;
  /**
   * <code>int64 value2 = 2;</code>
   */
  public long getValue2() {
    return value2_;
  }

  public static final int VALUE3_FIELD_NUMBER = 3;
  private long value3_;
  /**
   * <code>int64 value3 = 3;</code>
   */
  public long getValue3() {
    return value3_;
  }

  public static final int VALUE4_FIELD_NUMBER = 4;
  private long value4_;
  /**
   * <code>int64 value4 = 4;</code>
   */
  public long getValue4() {
    return value4_;
  }

  public static final int VALUE5_FIELD_NUMBER = 5;
  private long value5_;
  /**
   * <code>int64 value5 = 5;</code>
   */
  public long getValue5() {
    return value5_;
  }

  public static final int VALUE6_FIELD_NUMBER = 6;
  private long value6_;
  /**
   * <code>int64 value6 = 6;</code>
   */
  public long getValue6() {
    return value6_;
  }

  public static final int VALUE7_FIELD_NUMBER = 7;
  private long value7_;
  /**
   * <code>int64 value7 = 7;</code>
   */
  public long getValue7() {
    return value7_;
  }

  public static final int VALUE8_FIELD_NUMBER = 8;
  private long value8_;
  /**
   * <code>int64 value8 = 8;</code>
   */
  public long getValue8() {
    return value8_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (value1_ != 0L) {
      output.writeInt64(1, value1_);
    }
    if (value2_ != 0L) {
      output.writeInt64(2, value2_);
    }
    if (value3_ != 0L) {
      output.writeInt64(3, value3_);
    }
    if (value4_ != 0L) {
      output.writeInt64(4, value4_);
    }
    if (value5_ != 0L) {
      output.writeInt64(5, value5_);
    }
    if (value6_ != 0L) {
      output.writeInt64(6, value6_);
    }
    if (value7_ != 0L) {
      output.writeInt64(7, value7_);
    }
    if (value8_ != 0L) {
      output.writeInt64(8, value8_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value1_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, value1_);
    }
    if (value2_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, value2_);
    }
    if (value3_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, value3_);
    }
    if (value4_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, value4_);
    }
    if (value5_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, value5_);
    }
    if (value6_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, value6_);
    }
    if (value7_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, value7_);
    }
    if (value8_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, value8_);
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
    if (!(obj instanceof gRPC.proto.Long8x)) {
      return super.equals(obj);
    }
    gRPC.proto.Long8x other = (gRPC.proto.Long8x) obj;

    boolean result = true;
    result = result && (getValue1()
        == other.getValue1());
    result = result && (getValue2()
        == other.getValue2());
    result = result && (getValue3()
        == other.getValue3());
    result = result && (getValue4()
        == other.getValue4());
    result = result && (getValue5()
        == other.getValue5());
    result = result && (getValue6()
        == other.getValue6());
    result = result && (getValue7()
        == other.getValue7());
    result = result && (getValue8()
        == other.getValue8());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALUE1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue1());
    hash = (37 * hash) + VALUE2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue2());
    hash = (37 * hash) + VALUE3_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue3());
    hash = (37 * hash) + VALUE4_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue4());
    hash = (37 * hash) + VALUE5_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue5());
    hash = (37 * hash) + VALUE6_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue6());
    hash = (37 * hash) + VALUE7_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue7());
    hash = (37 * hash) + VALUE8_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue8());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gRPC.proto.Long8x parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gRPC.proto.Long8x parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gRPC.proto.Long8x parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gRPC.proto.Long8x parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gRPC.proto.Long8x parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gRPC.proto.Long8x parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gRPC.proto.Long8x parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gRPC.proto.Long8x parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gRPC.proto.Long8x parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gRPC.proto.Long8x parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gRPC.proto.Long8x parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gRPC.proto.Long8x parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(gRPC.proto.Long8x prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code gRPC.Long8x}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gRPC.Long8x)
      gRPC.proto.Long8xOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gRPC.proto.MyProto.internal_static_gRPC_Long8x_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gRPC.proto.MyProto.internal_static_gRPC_Long8x_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gRPC.proto.Long8x.class, gRPC.proto.Long8x.Builder.class);
    }

    // Construct using gRPC.proto.Long8x.newBuilder()
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
    public Builder clear() {
      super.clear();
      value1_ = 0L;

      value2_ = 0L;

      value3_ = 0L;

      value4_ = 0L;

      value5_ = 0L;

      value6_ = 0L;

      value7_ = 0L;

      value8_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gRPC.proto.MyProto.internal_static_gRPC_Long8x_descriptor;
    }

    public gRPC.proto.Long8x getDefaultInstanceForType() {
      return gRPC.proto.Long8x.getDefaultInstance();
    }

    public gRPC.proto.Long8x build() {
      gRPC.proto.Long8x result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public gRPC.proto.Long8x buildPartial() {
      gRPC.proto.Long8x result = new gRPC.proto.Long8x(this);
      result.value1_ = value1_;
      result.value2_ = value2_;
      result.value3_ = value3_;
      result.value4_ = value4_;
      result.value5_ = value5_;
      result.value6_ = value6_;
      result.value7_ = value7_;
      result.value8_ = value8_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof gRPC.proto.Long8x) {
        return mergeFrom((gRPC.proto.Long8x)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gRPC.proto.Long8x other) {
      if (other == gRPC.proto.Long8x.getDefaultInstance()) return this;
      if (other.getValue1() != 0L) {
        setValue1(other.getValue1());
      }
      if (other.getValue2() != 0L) {
        setValue2(other.getValue2());
      }
      if (other.getValue3() != 0L) {
        setValue3(other.getValue3());
      }
      if (other.getValue4() != 0L) {
        setValue4(other.getValue4());
      }
      if (other.getValue5() != 0L) {
        setValue5(other.getValue5());
      }
      if (other.getValue6() != 0L) {
        setValue6(other.getValue6());
      }
      if (other.getValue7() != 0L) {
        setValue7(other.getValue7());
      }
      if (other.getValue8() != 0L) {
        setValue8(other.getValue8());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      gRPC.proto.Long8x parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (gRPC.proto.Long8x) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long value1_ ;
    /**
     * <code>int64 value1 = 1;</code>
     */
    public long getValue1() {
      return value1_;
    }
    /**
     * <code>int64 value1 = 1;</code>
     */
    public Builder setValue1(long value) {
      
      value1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value1 = 1;</code>
     */
    public Builder clearValue1() {
      
      value1_ = 0L;
      onChanged();
      return this;
    }

    private long value2_ ;
    /**
     * <code>int64 value2 = 2;</code>
     */
    public long getValue2() {
      return value2_;
    }
    /**
     * <code>int64 value2 = 2;</code>
     */
    public Builder setValue2(long value) {
      
      value2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value2 = 2;</code>
     */
    public Builder clearValue2() {
      
      value2_ = 0L;
      onChanged();
      return this;
    }

    private long value3_ ;
    /**
     * <code>int64 value3 = 3;</code>
     */
    public long getValue3() {
      return value3_;
    }
    /**
     * <code>int64 value3 = 3;</code>
     */
    public Builder setValue3(long value) {
      
      value3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value3 = 3;</code>
     */
    public Builder clearValue3() {
      
      value3_ = 0L;
      onChanged();
      return this;
    }

    private long value4_ ;
    /**
     * <code>int64 value4 = 4;</code>
     */
    public long getValue4() {
      return value4_;
    }
    /**
     * <code>int64 value4 = 4;</code>
     */
    public Builder setValue4(long value) {
      
      value4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value4 = 4;</code>
     */
    public Builder clearValue4() {
      
      value4_ = 0L;
      onChanged();
      return this;
    }

    private long value5_ ;
    /**
     * <code>int64 value5 = 5;</code>
     */
    public long getValue5() {
      return value5_;
    }
    /**
     * <code>int64 value5 = 5;</code>
     */
    public Builder setValue5(long value) {
      
      value5_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value5 = 5;</code>
     */
    public Builder clearValue5() {
      
      value5_ = 0L;
      onChanged();
      return this;
    }

    private long value6_ ;
    /**
     * <code>int64 value6 = 6;</code>
     */
    public long getValue6() {
      return value6_;
    }
    /**
     * <code>int64 value6 = 6;</code>
     */
    public Builder setValue6(long value) {
      
      value6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value6 = 6;</code>
     */
    public Builder clearValue6() {
      
      value6_ = 0L;
      onChanged();
      return this;
    }

    private long value7_ ;
    /**
     * <code>int64 value7 = 7;</code>
     */
    public long getValue7() {
      return value7_;
    }
    /**
     * <code>int64 value7 = 7;</code>
     */
    public Builder setValue7(long value) {
      
      value7_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value7 = 7;</code>
     */
    public Builder clearValue7() {
      
      value7_ = 0L;
      onChanged();
      return this;
    }

    private long value8_ ;
    /**
     * <code>int64 value8 = 8;</code>
     */
    public long getValue8() {
      return value8_;
    }
    /**
     * <code>int64 value8 = 8;</code>
     */
    public Builder setValue8(long value) {
      
      value8_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 value8 = 8;</code>
     */
    public Builder clearValue8() {
      
      value8_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:gRPC.Long8x)
  }

  // @@protoc_insertion_point(class_scope:gRPC.Long8x)
  private static final gRPC.proto.Long8x DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gRPC.proto.Long8x();
  }

  public static gRPC.proto.Long8x getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Long8x>
      PARSER = new com.google.protobuf.AbstractParser<Long8x>() {
    public Long8x parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Long8x(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Long8x> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Long8x> getParserForType() {
    return PARSER;
  }

  public gRPC.proto.Long8x getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

