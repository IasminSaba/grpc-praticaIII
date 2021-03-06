// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package proto;

/**
 * Protobuf type {@code proto.GetAllResponse}
 */
public  final class GetAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GetAllResponse)
    GetAllResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAllResponse.newBuilder() to construct.
  private GetAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllResponse() {
    cars_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAllResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              cars_ = new java.util.ArrayList<proto.Car>();
              mutable_bitField0_ |= 0x00000001;
            }
            cars_.add(
                input.readMessage(proto.Car.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        cars_ = java.util.Collections.unmodifiableList(cars_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.CarOuterClass.internal_static_proto_GetAllResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.CarOuterClass.internal_static_proto_GetAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.GetAllResponse.class, proto.GetAllResponse.Builder.class);
  }

  public static final int CARS_FIELD_NUMBER = 1;
  private java.util.List<proto.Car> cars_;
  /**
   * <code>repeated .proto.Car cars = 1;</code>
   */
  public java.util.List<proto.Car> getCarsList() {
    return cars_;
  }
  /**
   * <code>repeated .proto.Car cars = 1;</code>
   */
  public java.util.List<? extends proto.CarOrBuilder> 
      getCarsOrBuilderList() {
    return cars_;
  }
  /**
   * <code>repeated .proto.Car cars = 1;</code>
   */
  public int getCarsCount() {
    return cars_.size();
  }
  /**
   * <code>repeated .proto.Car cars = 1;</code>
   */
  public proto.Car getCars(int index) {
    return cars_.get(index);
  }
  /**
   * <code>repeated .proto.Car cars = 1;</code>
   */
  public proto.CarOrBuilder getCarsOrBuilder(
      int index) {
    return cars_.get(index);
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
    for (int i = 0; i < cars_.size(); i++) {
      output.writeMessage(1, cars_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cars_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cars_.get(i));
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
    if (!(obj instanceof proto.GetAllResponse)) {
      return super.equals(obj);
    }
    proto.GetAllResponse other = (proto.GetAllResponse) obj;

    boolean result = true;
    result = result && getCarsList()
        .equals(other.getCarsList());
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
    if (getCarsCount() > 0) {
      hash = (37 * hash) + CARS_FIELD_NUMBER;
      hash = (53 * hash) + getCarsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.GetAllResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GetAllResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GetAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GetAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GetAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GetAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GetAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GetAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GetAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.GetAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GetAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GetAllResponse parseFrom(
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
  public static Builder newBuilder(proto.GetAllResponse prototype) {
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
   * Protobuf type {@code proto.GetAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GetAllResponse)
      proto.GetAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.CarOuterClass.internal_static_proto_GetAllResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.CarOuterClass.internal_static_proto_GetAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.GetAllResponse.class, proto.GetAllResponse.Builder.class);
    }

    // Construct using proto.GetAllResponse.newBuilder()
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
        getCarsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (carsBuilder_ == null) {
        cars_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        carsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.CarOuterClass.internal_static_proto_GetAllResponse_descriptor;
    }

    @java.lang.Override
    public proto.GetAllResponse getDefaultInstanceForType() {
      return proto.GetAllResponse.getDefaultInstance();
    }

    @java.lang.Override
    public proto.GetAllResponse build() {
      proto.GetAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.GetAllResponse buildPartial() {
      proto.GetAllResponse result = new proto.GetAllResponse(this);
      int from_bitField0_ = bitField0_;
      if (carsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          cars_ = java.util.Collections.unmodifiableList(cars_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cars_ = cars_;
      } else {
        result.cars_ = carsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.GetAllResponse) {
        return mergeFrom((proto.GetAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.GetAllResponse other) {
      if (other == proto.GetAllResponse.getDefaultInstance()) return this;
      if (carsBuilder_ == null) {
        if (!other.cars_.isEmpty()) {
          if (cars_.isEmpty()) {
            cars_ = other.cars_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCarsIsMutable();
            cars_.addAll(other.cars_);
          }
          onChanged();
        }
      } else {
        if (!other.cars_.isEmpty()) {
          if (carsBuilder_.isEmpty()) {
            carsBuilder_.dispose();
            carsBuilder_ = null;
            cars_ = other.cars_;
            bitField0_ = (bitField0_ & ~0x00000001);
            carsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCarsFieldBuilder() : null;
          } else {
            carsBuilder_.addAllMessages(other.cars_);
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
      proto.GetAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.GetAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.Car> cars_ =
      java.util.Collections.emptyList();
    private void ensureCarsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        cars_ = new java.util.ArrayList<proto.Car>(cars_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Car, proto.Car.Builder, proto.CarOrBuilder> carsBuilder_;

    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public java.util.List<proto.Car> getCarsList() {
      if (carsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cars_);
      } else {
        return carsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public int getCarsCount() {
      if (carsBuilder_ == null) {
        return cars_.size();
      } else {
        return carsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public proto.Car getCars(int index) {
      if (carsBuilder_ == null) {
        return cars_.get(index);
      } else {
        return carsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder setCars(
        int index, proto.Car value) {
      if (carsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarsIsMutable();
        cars_.set(index, value);
        onChanged();
      } else {
        carsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder setCars(
        int index, proto.Car.Builder builderForValue) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        cars_.set(index, builderForValue.build());
        onChanged();
      } else {
        carsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder addCars(proto.Car value) {
      if (carsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarsIsMutable();
        cars_.add(value);
        onChanged();
      } else {
        carsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder addCars(
        int index, proto.Car value) {
      if (carsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarsIsMutable();
        cars_.add(index, value);
        onChanged();
      } else {
        carsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder addCars(
        proto.Car.Builder builderForValue) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        cars_.add(builderForValue.build());
        onChanged();
      } else {
        carsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder addCars(
        int index, proto.Car.Builder builderForValue) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        cars_.add(index, builderForValue.build());
        onChanged();
      } else {
        carsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder addAllCars(
        java.lang.Iterable<? extends proto.Car> values) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cars_);
        onChanged();
      } else {
        carsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder clearCars() {
      if (carsBuilder_ == null) {
        cars_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        carsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public Builder removeCars(int index) {
      if (carsBuilder_ == null) {
        ensureCarsIsMutable();
        cars_.remove(index);
        onChanged();
      } else {
        carsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public proto.Car.Builder getCarsBuilder(
        int index) {
      return getCarsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public proto.CarOrBuilder getCarsOrBuilder(
        int index) {
      if (carsBuilder_ == null) {
        return cars_.get(index);  } else {
        return carsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public java.util.List<? extends proto.CarOrBuilder> 
         getCarsOrBuilderList() {
      if (carsBuilder_ != null) {
        return carsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cars_);
      }
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public proto.Car.Builder addCarsBuilder() {
      return getCarsFieldBuilder().addBuilder(
          proto.Car.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public proto.Car.Builder addCarsBuilder(
        int index) {
      return getCarsFieldBuilder().addBuilder(
          index, proto.Car.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Car cars = 1;</code>
     */
    public java.util.List<proto.Car.Builder> 
         getCarsBuilderList() {
      return getCarsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Car, proto.Car.Builder, proto.CarOrBuilder> 
        getCarsFieldBuilder() {
      if (carsBuilder_ == null) {
        carsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Car, proto.Car.Builder, proto.CarOrBuilder>(
                cars_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        cars_ = null;
      }
      return carsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.GetAllResponse)
  }

  // @@protoc_insertion_point(class_scope:proto.GetAllResponse)
  private static final proto.GetAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.GetAllResponse();
  }

  public static proto.GetAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAllResponse>() {
    @java.lang.Override
    public GetAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.GetAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

