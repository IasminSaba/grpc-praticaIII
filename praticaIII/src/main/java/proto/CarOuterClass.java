// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package proto;

public final class CarOuterClass {
  private CarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Car_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Car_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_CreateCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_CreateCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_CreateCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_CreateCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_UpdateCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_UpdateCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_UpdateCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_UpdateCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_DeleteCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_DeleteCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_DeleteCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_DeleteCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetAllRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetAllRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetAllResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetAllResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tcar.proto\022\005proto\"g\n\003Car\022\n\n\002id\030\001 \001(\005\022\014\n" +
      "\004nome\030\002 \001(\t\022\r\n\005marca\030\003 \001(\t\022\025\n\ranoFabrica" +
      "cao\030\004 \001(\005\022\021\n\tanoModelo\030\005 \001(\005\022\r\n\005preco\030\006 " +
      "\001(\001\"h\n\020CreateCarRequest\022\014\n\004nome\030\001 \001(\t\022\r\n" +
      "\005marca\030\002 \001(\t\022\025\n\ranoFabricacao\030\003 \001(\005\022\021\n\ta" +
      "noModelo\030\004 \001(\005\022\r\n\005preco\030\005 \001(\001\",\n\021CreateC" +
      "arResponse\022\027\n\003car\030\001 \001(\0132\n.proto.Car\"+\n\020U" +
      "pdateCarRequest\022\027\n\003car\030\001 \001(\0132\n.proto.Car" +
      "\",\n\021UpdateCarResponse\022\027\n\003car\030\001 \001(\0132\n.pro" +
      "to.Car\"!\n\020DeleteCarRequest\022\r\n\005carId\030\001 \001(" +
      "\005\"\"\n\021DeleteCarResponse\022\r\n\005carId\030\001 \001(\005\"\036\n" +
      "\rGetCarRequest\022\r\n\005carId\030\001 \001(\005\")\n\016GetCarR" +
      "esponse\022\027\n\003car\030\001 \001(\0132\n.proto.Car\"\017\n\rGetA" +
      "llRequest\"*\n\016GetAllResponse\022\030\n\004cars\030\001 \003(" +
      "\0132\n.proto.Car2\272\002\n\nCarService\022>\n\tCreateCa" +
      "r\022\027.proto.CreateCarRequest\032\030.proto.Creat" +
      "eCarResponse\022>\n\tUpdateCar\022\027.proto.Update" +
      "CarRequest\032\030.proto.UpdateCarResponse\022>\n\t" +
      "DeleteCar\022\027.proto.DeleteCarRequest\032\030.pro" +
      "to.DeleteCarResponse\0225\n\006GetCar\022\024.proto.G" +
      "etCarRequest\032\025.proto.GetCarResponse\0225\n\006G" +
      "etAll\022\024.proto.GetAllRequest\032\025.proto.GetA" +
      "llResponseB\002P\001b\006proto3"
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
    internal_static_proto_Car_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_Car_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Car_descriptor,
        new java.lang.String[] { "Id", "Nome", "Marca", "AnoFabricacao", "AnoModelo", "Preco", });
    internal_static_proto_CreateCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_CreateCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_CreateCarRequest_descriptor,
        new java.lang.String[] { "Nome", "Marca", "AnoFabricacao", "AnoModelo", "Preco", });
    internal_static_proto_CreateCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_CreateCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_CreateCarResponse_descriptor,
        new java.lang.String[] { "Car", });
    internal_static_proto_UpdateCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_UpdateCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_UpdateCarRequest_descriptor,
        new java.lang.String[] { "Car", });
    internal_static_proto_UpdateCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_proto_UpdateCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_UpdateCarResponse_descriptor,
        new java.lang.String[] { "Car", });
    internal_static_proto_DeleteCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_proto_DeleteCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_DeleteCarRequest_descriptor,
        new java.lang.String[] { "CarId", });
    internal_static_proto_DeleteCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_proto_DeleteCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_DeleteCarResponse_descriptor,
        new java.lang.String[] { "CarId", });
    internal_static_proto_GetCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_proto_GetCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetCarRequest_descriptor,
        new java.lang.String[] { "CarId", });
    internal_static_proto_GetCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_proto_GetCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetCarResponse_descriptor,
        new java.lang.String[] { "Car", });
    internal_static_proto_GetAllRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_proto_GetAllRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetAllRequest_descriptor,
        new java.lang.String[] { });
    internal_static_proto_GetAllResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_proto_GetAllResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetAllResponse_descriptor,
        new java.lang.String[] { "Cars", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
