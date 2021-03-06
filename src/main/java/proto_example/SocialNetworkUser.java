

	package proto_example;

	public final class SocialNetworkUser {
	  private SocialNetworkUser() {}
	  public static void registerAllExtensions(
	      com.google.protobuf.ExtensionRegistry registry) {
	  }
	  public interface UserOrBuilder
	      extends com.google.protobuf.MessageOrBuilder {
	    
	    // required string name = 1;
	    boolean hasName();
	    String getName();
	    
	    // optional int32 num_likes = 2;
	    boolean hasNumLikes();
	    int getNumLikes();
	    
	    // optional int32 num_photos = 3;
	    boolean hasNumPhotos();
	    int getNumPhotos();
	    
	    // optional int32 num_groups = 4;
	    boolean hasNumGroups();
	    int getNumGroups();
	  }
	  public static final class User extends
	      com.google.protobuf.GeneratedMessage
	      implements UserOrBuilder {
	    // Use User.newBuilder() to construct.
	    private User(Builder builder) {
	      super(builder);
	    }
	    private User(boolean noInit) {}
	    
	    private static final User defaultInstance;
	    public static User getDefaultInstance() {
	      return defaultInstance;
	    }
	    
	    public User getDefaultInstanceForType() {
	      return defaultInstance;
	    }
	    
	    public static final com.google.protobuf.Descriptors.Descriptor
	        getDescriptor() {
	      return proto_example.SocialNetworkUser.internal_static_proto_example_User_descriptor;
	    }
	    
	    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
	        internalGetFieldAccessorTable() {
	      return proto_example.SocialNetworkUser.internal_static_proto_example_User_fieldAccessorTable;
	    }
	    
	    private int bitField0_;
	    // required string name = 1;
	    public static final int NAME_FIELD_NUMBER = 1;
	    private Object name_;
	    public boolean hasName() {
	      return ((bitField0_ & 0x00000001) == 0x00000001);
	    }
	    public String getName() {
	      Object ref = name_;
	      if (ref instanceof String) {
	        return (String) ref;
	      } else {
	        com.google.protobuf.ByteString bs = 
	            (com.google.protobuf.ByteString) ref;
	        String s = bs.toStringUtf8();
	        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
	          name_ = s;
	        }
	        return s;
	      }
	    }
	    private com.google.protobuf.ByteString getNameBytes() {
	      Object ref = name_;
	      if (ref instanceof String) {
	        com.google.protobuf.ByteString b = 
	            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
	        name_ = b;
	        return b;
	      } else {
	        return (com.google.protobuf.ByteString) ref;
	      }
	    }
	    
	    // optional int32 num_likes = 2;
	    public static final int NUM_LIKES_FIELD_NUMBER = 2;
	    private int numLikes_;
	    public boolean hasNumLikes() {
	      return ((bitField0_ & 0x00000002) == 0x00000002);
	    }
	    public int getNumLikes() {
	      return numLikes_;
	    }
	    
	    // optional int32 num_photos = 3;
	    public static final int NUM_PHOTOS_FIELD_NUMBER = 3;
	    private int numPhotos_;
	    public boolean hasNumPhotos() {
	      return ((bitField0_ & 0x00000004) == 0x00000004);
	    }
	    public int getNumPhotos() {
	      return numPhotos_;
	    }
	    
	    // optional int32 num_groups = 4;
	    public static final int NUM_GROUPS_FIELD_NUMBER = 4;
	    private int numGroups_;
	    public boolean hasNumGroups() {
	      return ((bitField0_ & 0x00000008) == 0x00000008);
	    }
	    public int getNumGroups() {
	      return numGroups_;
	    }
	    
	    private void initFields() {
	      name_ = "";
	      numLikes_ = 0;
	      numPhotos_ = 0;
	      numGroups_ = 0;
	    }
	    private byte memoizedIsInitialized = -1;
	    public final boolean isInitialized() {
	      byte isInitialized = memoizedIsInitialized;
	      if (isInitialized != -1) return isInitialized == 1;
	      
	      if (!hasName()) {
	        memoizedIsInitialized = 0;
	        return false;
	      }
	      memoizedIsInitialized = 1;
	      return true;
	    }
	    
	    public void writeTo(com.google.protobuf.CodedOutputStream output)
	                        throws java.io.IOException {
	      getSerializedSize();
	      if (((bitField0_ & 0x00000001) == 0x00000001)) {
	        output.writeBytes(1, getNameBytes());
	      }
	      if (((bitField0_ & 0x00000002) == 0x00000002)) {
	        output.writeInt32(2, numLikes_);
	      }
	      if (((bitField0_ & 0x00000004) == 0x00000004)) {
	        output.writeInt32(3, numPhotos_);
	      }
	      if (((bitField0_ & 0x00000008) == 0x00000008)) {
	        output.writeInt32(4, numGroups_);
	      }
	      getUnknownFields().writeTo(output);
	    }
	    
	    private int memoizedSerializedSize = -1;
	    public int getSerializedSize() {
	      int size = memoizedSerializedSize;
	      if (size != -1) return size;
	    
	      size = 0;
	      if (((bitField0_ & 0x00000001) == 0x00000001)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeBytesSize(1, getNameBytes());
	      }
	      if (((bitField0_ & 0x00000002) == 0x00000002)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeInt32Size(2, numLikes_);
	      }
	      if (((bitField0_ & 0x00000004) == 0x00000004)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeInt32Size(3, numPhotos_);
	      }
	      if (((bitField0_ & 0x00000008) == 0x00000008)) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeInt32Size(4, numGroups_);
	      }
	      size += getUnknownFields().getSerializedSize();
	      memoizedSerializedSize = size;
	      return size;
	    }
	    
	    @java.lang.Override
	    protected Object writeReplace() throws java.io.ObjectStreamException {
	      return super.writeReplace();
	    }
	    
	    public static proto_example.SocialNetworkUser.User parseFrom(
	        com.google.protobuf.ByteString data)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data).buildParsed();
	    }
	    public static proto_example.SocialNetworkUser.User parseFrom(
	        com.google.protobuf.ByteString data,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data, extensionRegistry)
	               .buildParsed();
	    }
	    public static proto_example.SocialNetworkUser.User parseFrom(byte[] data)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data).buildParsed();
	    }
	    public static proto_example.SocialNetworkUser.User parseFrom(
	        byte[] data,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return newBuilder().mergeFrom(data, extensionRegistry)
	               .buildParsed();
	    }
	    public static proto_example.SocialNetworkUser.User parseFrom(java.io.InputStream input)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input).buildParsed();
	    }
	    public static proto_example.SocialNetworkUser.User parseFrom(
	        java.io.InputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input, extensionRegistry)
	               .buildParsed();
	    }
	    public static proto_example.SocialNetworkUser.User parseDelimitedFrom(java.io.InputStream input)
	        throws java.io.IOException {
	      Builder builder = newBuilder();
	      if (builder.mergeDelimitedFrom(input)) {
	        return builder.buildParsed();
	      } else {
	        return null;
	      }
	    }
	    public static proto_example.SocialNetworkUser.User parseDelimitedFrom(
	        java.io.InputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      Builder builder = newBuilder();
	      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
	        return builder.buildParsed();
	      } else {
	        return null;
	      }
	    }
	    public static proto_example.SocialNetworkUser.User parseFrom(
	        com.google.protobuf.CodedInputStream input)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input).buildParsed();
	    }
	    public static proto_example.SocialNetworkUser.User parseFrom(
	        com.google.protobuf.CodedInputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      return newBuilder().mergeFrom(input, extensionRegistry)
	               .buildParsed();
	    }
	    
	    public static Builder newBuilder() { return Builder.create(); }
	    public Builder newBuilderForType() { return newBuilder(); }
	    public static Builder newBuilder(proto_example.SocialNetworkUser.User prototype) {
	      return newBuilder().mergeFrom(prototype);
	    }
	    public Builder toBuilder() { return newBuilder(this); }
	    
	    @java.lang.Override
	    protected Builder newBuilderForType(
	        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
	      Builder builder = new Builder(parent);
	      return builder;
	    }
	    public static final class Builder extends
	        com.google.protobuf.GeneratedMessage.Builder<Builder>
	       implements proto_example.SocialNetworkUser.UserOrBuilder {
	      public static final com.google.protobuf.Descriptors.Descriptor
	          getDescriptor() {
	        return proto_example.SocialNetworkUser.internal_static_proto_example_User_descriptor;
	      }
	      
	      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
	          internalGetFieldAccessorTable() {
	        return proto_example.SocialNetworkUser.internal_static_proto_example_User_fieldAccessorTable;
	      }
	      
	      // Construct using proto_example.SocialNetworkUser.User.newBuilder()
	      private Builder() {
	        maybeForceBuilderInitialization();
	      }
	      
	      private Builder(BuilderParent parent) {
	        super(parent);
	        maybeForceBuilderInitialization();
	      }
	      private void maybeForceBuilderInitialization() {
	        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
	        }
	      }
	      private static Builder create() {
	        return new Builder();
	      }
	      
	      public Builder clear() {
	        super.clear();
	        name_ = "";
	        bitField0_ = (bitField0_ & ~0x00000001);
	        numLikes_ = 0;
	        bitField0_ = (bitField0_ & ~0x00000002);
	        numPhotos_ = 0;
	        bitField0_ = (bitField0_ & ~0x00000004);
	        numGroups_ = 0;
	        bitField0_ = (bitField0_ & ~0x00000008);
	        return this;
	      }
	      
	      public Builder clone() {
	        return create().mergeFrom(buildPartial());
	      }
	      
	      public com.google.protobuf.Descriptors.Descriptor
	          getDescriptorForType() {
	        return proto_example.SocialNetworkUser.User.getDescriptor();
	      }
	      
	      public proto_example.SocialNetworkUser.User getDefaultInstanceForType() {
	        return proto_example.SocialNetworkUser.User.getDefaultInstance();
	      }
	      
	      public proto_example.SocialNetworkUser.User build() {
	        proto_example.SocialNetworkUser.User result = buildPartial();
	        if (!result.isInitialized()) {
	          throw newUninitializedMessageException(result);
	        }
	        return result;
	      }
	      
	      private proto_example.SocialNetworkUser.User buildParsed()
	          throws com.google.protobuf.InvalidProtocolBufferException {
	        proto_example.SocialNetworkUser.User result = buildPartial();
	        if (!result.isInitialized()) {
	          throw newUninitializedMessageException(
	            result).asInvalidProtocolBufferException();
	        }
	        return result;
	      }
	      
	      public proto_example.SocialNetworkUser.User buildPartial() {
	        proto_example.SocialNetworkUser.User result = new proto_example.SocialNetworkUser.User(this);
	        int from_bitField0_ = bitField0_;
	        int to_bitField0_ = 0;
	        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
	          to_bitField0_ |= 0x00000001;
	        }
	        result.name_ = name_;
	        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
	          to_bitField0_ |= 0x00000002;
	        }
	        result.numLikes_ = numLikes_;
	        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
	          to_bitField0_ |= 0x00000004;
	        }
	        result.numPhotos_ = numPhotos_;
	        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
	          to_bitField0_ |= 0x00000008;
	        }
	        result.numGroups_ = numGroups_;
	        result.bitField0_ = to_bitField0_;
	        onBuilt();
	        return result;
	      }
	      
	      public Builder mergeFrom(com.google.protobuf.Message other) {
	        if (other instanceof proto_example.SocialNetworkUser.User) {
	          return mergeFrom((proto_example.SocialNetworkUser.User)other);
	        } else {
	          super.mergeFrom(other);
	          return this;
	        }
	      }
	      
	      public Builder mergeFrom(proto_example.SocialNetworkUser.User other) {
	        if (other == proto_example.SocialNetworkUser.User.getDefaultInstance()) return this;
	        if (other.hasName()) {
	          setName(other.getName());
	        }
	        if (other.hasNumLikes()) {
	          setNumLikes(other.getNumLikes());
	        }
	        if (other.hasNumPhotos()) {
	          setNumPhotos(other.getNumPhotos());
	        }
	        if (other.hasNumGroups()) {
	          setNumGroups(other.getNumGroups());
	        }
	        this.mergeUnknownFields(other.getUnknownFields());
	        return this;
	      }
	      
	      public final boolean isInitialized() {
	        if (!hasName()) {
	          
	          return false;
	        }
	        return true;
	      }
	      
	      public Builder mergeFrom(
	          com.google.protobuf.CodedInputStream input,
	          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	          throws java.io.IOException {
	        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
	          com.google.protobuf.UnknownFieldSet.newBuilder(
	            this.getUnknownFields());
	        while (true) {
	          int tag = input.readTag();
	          switch (tag) {
	            case 0:
	              this.setUnknownFields(unknownFields.build());
	              onChanged();
	              return this;
	            default: {
	              if (!parseUnknownField(input, unknownFields,
	                                     extensionRegistry, tag)) {
	                this.setUnknownFields(unknownFields.build());
	                onChanged();
	                return this;
	              }
	              break;
	            }
	            case 10: {
	              bitField0_ |= 0x00000001;
	              name_ = input.readBytes();
	              break;
	            }
	            case 16: {
	              bitField0_ |= 0x00000002;
	              numLikes_ = input.readInt32();
	              break;
	            }
	            case 24: {
	              bitField0_ |= 0x00000004;
	              numPhotos_ = input.readInt32();
	              break;
	            }
	            case 32: {
	              bitField0_ |= 0x00000008;
	              numGroups_ = input.readInt32();
	              break;
	            }
	          }
	        }
	      }
	      
	      private int bitField0_;
	      
	      // required string name = 1;
	      private Object name_ = "";
	      public boolean hasName() {
	        return ((bitField0_ & 0x00000001) == 0x00000001);
	      }
	      public String getName() {
	        Object ref = name_;
	        if (!(ref instanceof String)) {
	          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
	          name_ = s;
	          return s;
	        } else {
	          return (String) ref;
	        }
	      }
	      public Builder setName(String value) {
	        if (value == null) {
	    throw new NullPointerException();
	  }
	  bitField0_ |= 0x00000001;
	        name_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearName() {
	        bitField0_ = (bitField0_ & ~0x00000001);
	        name_ = getDefaultInstance().getName();
	        onChanged();
	        return this;
	      }
	      void setName(com.google.protobuf.ByteString value) {
	        bitField0_ |= 0x00000001;
	        name_ = value;
	        onChanged();
	      }
	      
	      // optional int32 num_likes = 2;
	      private int numLikes_ ;
	      public boolean hasNumLikes() {
	        return ((bitField0_ & 0x00000002) == 0x00000002);
	      }
	      public int getNumLikes() {
	        return numLikes_;
	      }
	      public Builder setNumLikes(int value) {
	        bitField0_ |= 0x00000002;
	        numLikes_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearNumLikes() {
	        bitField0_ = (bitField0_ & ~0x00000002);
	        numLikes_ = 0;
	        onChanged();
	        return this;
	      }
	      
	      // optional int32 num_photos = 3;
	      private int numPhotos_ ;
	      public boolean hasNumPhotos() {
	        return ((bitField0_ & 0x00000004) == 0x00000004);
	      }
	      public int getNumPhotos() {
	        return numPhotos_;
	      }
	      public Builder setNumPhotos(int value) {
	        bitField0_ |= 0x00000004;
	        numPhotos_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearNumPhotos() {
	        bitField0_ = (bitField0_ & ~0x00000004);
	        numPhotos_ = 0;
	        onChanged();
	        return this;
	      }
	      
	      // optional int32 num_groups = 4;
	      private int numGroups_ ;
	      public boolean hasNumGroups() {
	        return ((bitField0_ & 0x00000008) == 0x00000008);
	      }
	      public int getNumGroups() {
	        return numGroups_;
	      }
	      public Builder setNumGroups(int value) {
	        bitField0_ |= 0x00000008;
	        numGroups_ = value;
	        onChanged();
	        return this;
	      }
	      public Builder clearNumGroups() {
	        bitField0_ = (bitField0_ & ~0x00000008);
	        numGroups_ = 0;
	        onChanged();
	        return this;
	      }
	      
	      // @@protoc_insertion_point(builder_scope:proto_example.User)
	    }
	    
	    static {
	      defaultInstance = new User(true);
	      defaultInstance.initFields();
	    }
	    
	    // @@protoc_insertion_point(class_scope:proto_example.User)
	  }
	  
	  private static com.google.protobuf.Descriptors.Descriptor
	    internal_static_proto_example_User_descriptor;
	  private static
	    com.google.protobuf.GeneratedMessage.FieldAccessorTable
	      internal_static_proto_example_User_fieldAccessorTable;
	  
	  public static com.google.protobuf.Descriptors.FileDescriptor
	      getDescriptor() {
	    return descriptor;
	  }
	  private static com.google.protobuf.Descriptors.FileDescriptor
	      descriptor;
	  static {
	    java.lang.String[] descriptorData = {
	      "\n\031social_network_user.proto\022\rproto_examp" +
	      "le\"O\n\004User\022\014\n\004name\030\001 \002(\t\022\021\n\tnum_likes\030\002 " +
	      "\001(\005\022\022\n\nnum_photos\030\003 \001(\005\022\022\n\nnum_groups\030\004 " +
	      "\001(\005B\023B\021SocialNetworkUser"
	    };
	    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
	      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
	        public com.google.protobuf.ExtensionRegistry assignDescriptors(
	            com.google.protobuf.Descriptors.FileDescriptor root) {
	          descriptor = root;
	          internal_static_proto_example_User_descriptor =
	            getDescriptor().getMessageTypes().get(0);
	          internal_static_proto_example_User_fieldAccessorTable = new
	            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
	              internal_static_proto_example_User_descriptor,
	              new java.lang.String[] { "Name", "NumLikes", "NumPhotos", "NumGroups", },
	              proto_example.SocialNetworkUser.User.class,
	              proto_example.SocialNetworkUser.User.Builder.class);
	          return null;
	        }
	      };
	    com.google.protobuf.Descriptors.FileDescriptor
	      .internalBuildGeneratedFileFrom(descriptorData,
	        new com.google.protobuf.Descriptors.FileDescriptor[] {
	        }, assigner);
	  }
	  
	  // @@protoc_insertion_point(outer_class_scope)
	}
