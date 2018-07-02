package gRPC.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: gRPC.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "gRPC.Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVoidVoidMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.VoidMsg> METHOD_VOID_VOID = getVoidVoidMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.VoidMsg> getVoidVoidMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.VoidMsg> getVoidVoidMethod() {
    return getVoidVoidMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.VoidMsg> getVoidVoidMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.VoidMsg, gRPC.proto.VoidMsg> getVoidVoidMethod;
    if ((getVoidVoidMethod = GreeterGrpc.getVoidVoidMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getVoidVoidMethod = GreeterGrpc.getVoidVoidMethod) == null) {
          GreeterGrpc.getVoidVoidMethod = getVoidVoidMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.VoidMsg, gRPC.proto.VoidMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "VoidVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("VoidVoid"))
                  .build();
          }
        }
     }
     return getVoidVoidMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getIntIntMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.IntMsg,
      gRPC.proto.IntMsg> METHOD_INT_INT = getIntIntMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.IntMsg,
      gRPC.proto.IntMsg> getIntIntMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.IntMsg,
      gRPC.proto.IntMsg> getIntIntMethod() {
    return getIntIntMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.IntMsg,
      gRPC.proto.IntMsg> getIntIntMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.IntMsg, gRPC.proto.IntMsg> getIntIntMethod;
    if ((getIntIntMethod = GreeterGrpc.getIntIntMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getIntIntMethod = GreeterGrpc.getIntIntMethod) == null) {
          GreeterGrpc.getIntIntMethod = getIntIntMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.IntMsg, gRPC.proto.IntMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "IntInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.IntMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.IntMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("IntInt"))
                  .build();
          }
        }
     }
     return getIntIntMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLongLongMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.LongMsg,
      gRPC.proto.LongMsg> METHOD_LONG_LONG = getLongLongMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.LongMsg,
      gRPC.proto.LongMsg> getLongLongMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.LongMsg,
      gRPC.proto.LongMsg> getLongLongMethod() {
    return getLongLongMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.LongMsg,
      gRPC.proto.LongMsg> getLongLongMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.LongMsg, gRPC.proto.LongMsg> getLongLongMethod;
    if ((getLongLongMethod = GreeterGrpc.getLongLongMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getLongLongMethod = GreeterGrpc.getLongLongMethod) == null) {
          GreeterGrpc.getLongLongMethod = getLongLongMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.LongMsg, gRPC.proto.LongMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "LongLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("LongLong"))
                  .build();
          }
        }
     }
     return getLongLongMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStringStringMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.StringMsgSize,
      gRPC.proto.StringMsg> METHOD_STRING_STRING = getStringStringMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.StringMsgSize,
      gRPC.proto.StringMsg> getStringStringMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.StringMsgSize,
      gRPC.proto.StringMsg> getStringStringMethod() {
    return getStringStringMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.StringMsgSize,
      gRPC.proto.StringMsg> getStringStringMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.StringMsgSize, gRPC.proto.StringMsg> getStringStringMethod;
    if ((getStringStringMethod = GreeterGrpc.getStringStringMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getStringStringMethod = GreeterGrpc.getStringStringMethod) == null) {
          GreeterGrpc.getStringStringMethod = getStringStringMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.StringMsgSize, gRPC.proto.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "StringString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsgSize.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("StringString"))
                  .build();
          }
        }
     }
     return getStringStringMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getIntVoidMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.IntMsg,
      gRPC.proto.VoidMsg> METHOD_INT_VOID = getIntVoidMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.IntMsg,
      gRPC.proto.VoidMsg> getIntVoidMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.IntMsg,
      gRPC.proto.VoidMsg> getIntVoidMethod() {
    return getIntVoidMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.IntMsg,
      gRPC.proto.VoidMsg> getIntVoidMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.IntMsg, gRPC.proto.VoidMsg> getIntVoidMethod;
    if ((getIntVoidMethod = GreeterGrpc.getIntVoidMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getIntVoidMethod = GreeterGrpc.getIntVoidMethod) == null) {
          GreeterGrpc.getIntVoidMethod = getIntVoidMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.IntMsg, gRPC.proto.VoidMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "IntVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.IntMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("IntVoid"))
                  .build();
          }
        }
     }
     return getIntVoidMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStringVoidMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.StringMsg,
      gRPC.proto.VoidMsg> METHOD_STRING_VOID = getStringVoidMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.StringMsg,
      gRPC.proto.VoidMsg> getStringVoidMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.StringMsg,
      gRPC.proto.VoidMsg> getStringVoidMethod() {
    return getStringVoidMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.StringMsg,
      gRPC.proto.VoidMsg> getStringVoidMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.StringMsg, gRPC.proto.VoidMsg> getStringVoidMethod;
    if ((getStringVoidMethod = GreeterGrpc.getStringVoidMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getStringVoidMethod = GreeterGrpc.getStringVoidMethod) == null) {
          GreeterGrpc.getStringVoidMethod = getStringVoidMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.StringMsg, gRPC.proto.VoidMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "StringVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("StringVoid"))
                  .build();
          }
        }
     }
     return getStringVoidMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLongVoidMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.LongMsg,
      gRPC.proto.VoidMsg> METHOD_LONG_VOID = getLongVoidMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.LongMsg,
      gRPC.proto.VoidMsg> getLongVoidMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.LongMsg,
      gRPC.proto.VoidMsg> getLongVoidMethod() {
    return getLongVoidMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.LongMsg,
      gRPC.proto.VoidMsg> getLongVoidMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.LongMsg, gRPC.proto.VoidMsg> getLongVoidMethod;
    if ((getLongVoidMethod = GreeterGrpc.getLongVoidMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getLongVoidMethod = GreeterGrpc.getLongVoidMethod) == null) {
          GreeterGrpc.getLongVoidMethod = getLongVoidMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.LongMsg, gRPC.proto.VoidMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "LongVoid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("LongVoid"))
                  .build();
          }
        }
     }
     return getLongVoidMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVoidIntMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.IntMsg> METHOD_VOID_INT = getVoidIntMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.IntMsg> getVoidIntMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.IntMsg> getVoidIntMethod() {
    return getVoidIntMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.IntMsg> getVoidIntMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.VoidMsg, gRPC.proto.IntMsg> getVoidIntMethod;
    if ((getVoidIntMethod = GreeterGrpc.getVoidIntMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getVoidIntMethod = GreeterGrpc.getVoidIntMethod) == null) {
          GreeterGrpc.getVoidIntMethod = getVoidIntMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.VoidMsg, gRPC.proto.IntMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "VoidInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.IntMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("VoidInt"))
                  .build();
          }
        }
     }
     return getVoidIntMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVoidStringMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> METHOD_VOID_STRING = getVoidStringMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidStringMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidStringMethod() {
    return getVoidStringMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidStringMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.VoidMsg, gRPC.proto.StringMsg> getVoidStringMethod;
    if ((getVoidStringMethod = GreeterGrpc.getVoidStringMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getVoidStringMethod = GreeterGrpc.getVoidStringMethod) == null) {
          GreeterGrpc.getVoidStringMethod = getVoidStringMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.VoidMsg, gRPC.proto.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "VoidString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("VoidString"))
                  .build();
          }
        }
     }
     return getVoidStringMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVoidLongMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.LongMsg> METHOD_VOID_LONG = getVoidLongMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.LongMsg> getVoidLongMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.LongMsg> getVoidLongMethod() {
    return getVoidLongMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.LongMsg> getVoidLongMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.VoidMsg, gRPC.proto.LongMsg> getVoidLongMethod;
    if ((getVoidLongMethod = GreeterGrpc.getVoidLongMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getVoidLongMethod = GreeterGrpc.getVoidLongMethod) == null) {
          GreeterGrpc.getVoidLongMethod = getVoidLongMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.VoidMsg, gRPC.proto.LongMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "voidLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("voidLong"))
                  .build();
          }
        }
     }
     return getVoidLongMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVoidBigStringMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> METHOD_VOID_BIG_STRING = getVoidBigStringMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidBigStringMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidBigStringMethod() {
    return getVoidBigStringMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidBigStringMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.VoidMsg, gRPC.proto.StringMsg> getVoidBigStringMethod;
    if ((getVoidBigStringMethod = GreeterGrpc.getVoidBigStringMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getVoidBigStringMethod = GreeterGrpc.getVoidBigStringMethod) == null) {
          GreeterGrpc.getVoidBigStringMethod = getVoidBigStringMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.VoidMsg, gRPC.proto.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "VoidBigString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("VoidBigString"))
                  .build();
          }
        }
     }
     return getVoidBigStringMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVoidSuperStringMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> METHOD_VOID_SUPER_STRING = getVoidSuperStringMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidSuperStringMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidSuperStringMethod() {
    return getVoidSuperStringMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.VoidMsg,
      gRPC.proto.StringMsg> getVoidSuperStringMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.VoidMsg, gRPC.proto.StringMsg> getVoidSuperStringMethod;
    if ((getVoidSuperStringMethod = GreeterGrpc.getVoidSuperStringMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getVoidSuperStringMethod = GreeterGrpc.getVoidSuperStringMethod) == null) {
          GreeterGrpc.getVoidSuperStringMethod = getVoidSuperStringMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.VoidMsg, gRPC.proto.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "VoidSuperString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.VoidMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("VoidSuperString"))
                  .build();
          }
        }
     }
     return getVoidSuperStringMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLongDoisArgMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.Long2x,
      gRPC.proto.LongMsg> METHOD_LONG_DOIS_ARG = getLongDoisArgMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.Long2x,
      gRPC.proto.LongMsg> getLongDoisArgMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.Long2x,
      gRPC.proto.LongMsg> getLongDoisArgMethod() {
    return getLongDoisArgMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.Long2x,
      gRPC.proto.LongMsg> getLongDoisArgMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.Long2x, gRPC.proto.LongMsg> getLongDoisArgMethod;
    if ((getLongDoisArgMethod = GreeterGrpc.getLongDoisArgMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getLongDoisArgMethod = GreeterGrpc.getLongDoisArgMethod) == null) {
          GreeterGrpc.getLongDoisArgMethod = getLongDoisArgMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.Long2x, gRPC.proto.LongMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "longDoisArg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.Long2x.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("longDoisArg"))
                  .build();
          }
        }
     }
     return getLongDoisArgMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLongQuatroArgMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.Long4x,
      gRPC.proto.LongMsg> METHOD_LONG_QUATRO_ARG = getLongQuatroArgMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.Long4x,
      gRPC.proto.LongMsg> getLongQuatroArgMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.Long4x,
      gRPC.proto.LongMsg> getLongQuatroArgMethod() {
    return getLongQuatroArgMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.Long4x,
      gRPC.proto.LongMsg> getLongQuatroArgMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.Long4x, gRPC.proto.LongMsg> getLongQuatroArgMethod;
    if ((getLongQuatroArgMethod = GreeterGrpc.getLongQuatroArgMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getLongQuatroArgMethod = GreeterGrpc.getLongQuatroArgMethod) == null) {
          GreeterGrpc.getLongQuatroArgMethod = getLongQuatroArgMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.Long4x, gRPC.proto.LongMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "longQuatroArg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.Long4x.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("longQuatroArg"))
                  .build();
          }
        }
     }
     return getLongQuatroArgMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLongOitoArgMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.Long8x,
      gRPC.proto.LongMsg> METHOD_LONG_OITO_ARG = getLongOitoArgMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.Long8x,
      gRPC.proto.LongMsg> getLongOitoArgMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.Long8x,
      gRPC.proto.LongMsg> getLongOitoArgMethod() {
    return getLongOitoArgMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.Long8x,
      gRPC.proto.LongMsg> getLongOitoArgMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.Long8x, gRPC.proto.LongMsg> getLongOitoArgMethod;
    if ((getLongOitoArgMethod = GreeterGrpc.getLongOitoArgMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getLongOitoArgMethod = GreeterGrpc.getLongOitoArgMethod) == null) {
          GreeterGrpc.getLongOitoArgMethod = getLongOitoArgMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.Long8x, gRPC.proto.LongMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "longOitoArg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.Long8x.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("longOitoArg"))
                  .build();
          }
        }
     }
     return getLongOitoArgMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLongStringDoisArgMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.LongString,
      gRPC.proto.StringMsg> METHOD_LONG_STRING_DOIS_ARG = getLongStringDoisArgMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.LongString,
      gRPC.proto.StringMsg> getLongStringDoisArgMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.LongString,
      gRPC.proto.StringMsg> getLongStringDoisArgMethod() {
    return getLongStringDoisArgMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.LongString,
      gRPC.proto.StringMsg> getLongStringDoisArgMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.LongString, gRPC.proto.StringMsg> getLongStringDoisArgMethod;
    if ((getLongStringDoisArgMethod = GreeterGrpc.getLongStringDoisArgMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getLongStringDoisArgMethod = GreeterGrpc.getLongStringDoisArgMethod) == null) {
          GreeterGrpc.getLongStringDoisArgMethod = getLongStringDoisArgMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.LongString, gRPC.proto.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "longStringDoisArg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("longStringDoisArg"))
                  .build();
          }
        }
     }
     return getLongStringDoisArgMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLongStringQuatroArgMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.LongStringx2,
      gRPC.proto.StringMsg> METHOD_LONG_STRING_QUATRO_ARG = getLongStringQuatroArgMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.LongStringx2,
      gRPC.proto.StringMsg> getLongStringQuatroArgMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.LongStringx2,
      gRPC.proto.StringMsg> getLongStringQuatroArgMethod() {
    return getLongStringQuatroArgMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.LongStringx2,
      gRPC.proto.StringMsg> getLongStringQuatroArgMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.LongStringx2, gRPC.proto.StringMsg> getLongStringQuatroArgMethod;
    if ((getLongStringQuatroArgMethod = GreeterGrpc.getLongStringQuatroArgMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getLongStringQuatroArgMethod = GreeterGrpc.getLongStringQuatroArgMethod) == null) {
          GreeterGrpc.getLongStringQuatroArgMethod = getLongStringQuatroArgMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.LongStringx2, gRPC.proto.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "longStringQuatroArg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LongStringx2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("longStringQuatroArg"))
                  .build();
          }
        }
     }
     return getLongStringQuatroArgMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateLocalizacaoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.LocMsg,
      gRPC.proto.Localizacao> METHOD_CREATE_LOCALIZACAO = getCreateLocalizacaoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.LocMsg,
      gRPC.proto.Localizacao> getCreateLocalizacaoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.LocMsg,
      gRPC.proto.Localizacao> getCreateLocalizacaoMethod() {
    return getCreateLocalizacaoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.LocMsg,
      gRPC.proto.Localizacao> getCreateLocalizacaoMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.LocMsg, gRPC.proto.Localizacao> getCreateLocalizacaoMethod;
    if ((getCreateLocalizacaoMethod = GreeterGrpc.getCreateLocalizacaoMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getCreateLocalizacaoMethod = GreeterGrpc.getCreateLocalizacaoMethod) == null) {
          GreeterGrpc.getCreateLocalizacaoMethod = getCreateLocalizacaoMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.LocMsg, gRPC.proto.Localizacao>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "createLocalizacao"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.LocMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.Localizacao.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("createLocalizacao"))
                  .build();
          }
        }
     }
     return getCreateLocalizacaoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     */
    public void voidVoid(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getVoidVoidMethodHelper(), responseObserver);
    }

    /**
     */
    public void intInt(gRPC.proto.IntMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.IntMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getIntIntMethodHelper(), responseObserver);
    }

    /**
     */
    public void longLong(gRPC.proto.LongMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getLongLongMethodHelper(), responseObserver);
    }

    /**
     */
    public void stringString(gRPC.proto.StringMsgSize request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getStringStringMethodHelper(), responseObserver);
    }

    /**
     */
    public void intVoid(gRPC.proto.IntMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getIntVoidMethodHelper(), responseObserver);
    }

    /**
     */
    public void stringVoid(gRPC.proto.StringMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getStringVoidMethodHelper(), responseObserver);
    }

    /**
     */
    public void longVoid(gRPC.proto.LongMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getLongVoidMethodHelper(), responseObserver);
    }

    /**
     */
    public void voidInt(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.IntMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getVoidIntMethodHelper(), responseObserver);
    }

    /**
     */
    public void voidString(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getVoidStringMethodHelper(), responseObserver);
    }

    /**
     */
    public void voidLong(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getVoidLongMethodHelper(), responseObserver);
    }

    /**
     */
    public void voidBigString(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getVoidBigStringMethodHelper(), responseObserver);
    }

    /**
     */
    public void voidSuperString(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getVoidSuperStringMethodHelper(), responseObserver);
    }

    /**
     */
    public void longDoisArg(gRPC.proto.Long2x request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getLongDoisArgMethodHelper(), responseObserver);
    }

    /**
     */
    public void longQuatroArg(gRPC.proto.Long4x request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getLongQuatroArgMethodHelper(), responseObserver);
    }

    /**
     */
    public void longOitoArg(gRPC.proto.Long8x request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getLongOitoArgMethodHelper(), responseObserver);
    }

    /**
     */
    public void longStringDoisArg(gRPC.proto.LongString request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getLongStringDoisArgMethodHelper(), responseObserver);
    }

    /**
     */
    public void longStringQuatroArg(gRPC.proto.LongStringx2 request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getLongStringQuatroArgMethodHelper(), responseObserver);
    }

    /**
     */
    public void createLocalizacao(gRPC.proto.LocMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.Localizacao> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateLocalizacaoMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVoidVoidMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.VoidMsg,
                gRPC.proto.VoidMsg>(
                  this, METHODID_VOID_VOID)))
          .addMethod(
            getIntIntMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.IntMsg,
                gRPC.proto.IntMsg>(
                  this, METHODID_INT_INT)))
          .addMethod(
            getLongLongMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.LongMsg,
                gRPC.proto.LongMsg>(
                  this, METHODID_LONG_LONG)))
          .addMethod(
            getStringStringMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.StringMsgSize,
                gRPC.proto.StringMsg>(
                  this, METHODID_STRING_STRING)))
          .addMethod(
            getIntVoidMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.IntMsg,
                gRPC.proto.VoidMsg>(
                  this, METHODID_INT_VOID)))
          .addMethod(
            getStringVoidMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.StringMsg,
                gRPC.proto.VoidMsg>(
                  this, METHODID_STRING_VOID)))
          .addMethod(
            getLongVoidMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.LongMsg,
                gRPC.proto.VoidMsg>(
                  this, METHODID_LONG_VOID)))
          .addMethod(
            getVoidIntMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.VoidMsg,
                gRPC.proto.IntMsg>(
                  this, METHODID_VOID_INT)))
          .addMethod(
            getVoidStringMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.VoidMsg,
                gRPC.proto.StringMsg>(
                  this, METHODID_VOID_STRING)))
          .addMethod(
            getVoidLongMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.VoidMsg,
                gRPC.proto.LongMsg>(
                  this, METHODID_VOID_LONG)))
          .addMethod(
            getVoidBigStringMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.VoidMsg,
                gRPC.proto.StringMsg>(
                  this, METHODID_VOID_BIG_STRING)))
          .addMethod(
            getVoidSuperStringMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.VoidMsg,
                gRPC.proto.StringMsg>(
                  this, METHODID_VOID_SUPER_STRING)))
          .addMethod(
            getLongDoisArgMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.Long2x,
                gRPC.proto.LongMsg>(
                  this, METHODID_LONG_DOIS_ARG)))
          .addMethod(
            getLongQuatroArgMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.Long4x,
                gRPC.proto.LongMsg>(
                  this, METHODID_LONG_QUATRO_ARG)))
          .addMethod(
            getLongOitoArgMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.Long8x,
                gRPC.proto.LongMsg>(
                  this, METHODID_LONG_OITO_ARG)))
          .addMethod(
            getLongStringDoisArgMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.LongString,
                gRPC.proto.StringMsg>(
                  this, METHODID_LONG_STRING_DOIS_ARG)))
          .addMethod(
            getLongStringQuatroArgMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.LongStringx2,
                gRPC.proto.StringMsg>(
                  this, METHODID_LONG_STRING_QUATRO_ARG)))
          .addMethod(
            getCreateLocalizacaoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.LocMsg,
                gRPC.proto.Localizacao>(
                  this, METHODID_CREATE_LOCALIZACAO)))
          .build();
    }
  }

  /**
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     */
    public void voidVoid(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoidVoidMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void intInt(gRPC.proto.IntMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.IntMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntIntMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void longLong(gRPC.proto.LongMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongLongMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stringString(gRPC.proto.StringMsgSize request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStringStringMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void intVoid(gRPC.proto.IntMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIntVoidMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stringVoid(gRPC.proto.StringMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStringVoidMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void longVoid(gRPC.proto.LongMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongVoidMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voidInt(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.IntMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoidIntMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voidString(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoidStringMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voidLong(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoidLongMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voidBigString(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoidBigStringMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voidSuperString(gRPC.proto.VoidMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoidSuperStringMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void longDoisArg(gRPC.proto.Long2x request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongDoisArgMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void longQuatroArg(gRPC.proto.Long4x request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongQuatroArgMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void longOitoArg(gRPC.proto.Long8x request,
        io.grpc.stub.StreamObserver<gRPC.proto.LongMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongOitoArgMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void longStringDoisArg(gRPC.proto.LongString request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongStringDoisArgMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void longStringQuatroArg(gRPC.proto.LongStringx2 request,
        io.grpc.stub.StreamObserver<gRPC.proto.StringMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLongStringQuatroArgMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createLocalizacao(gRPC.proto.LocMsg request,
        io.grpc.stub.StreamObserver<gRPC.proto.Localizacao> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateLocalizacaoMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     */
    public gRPC.proto.VoidMsg voidVoid(gRPC.proto.VoidMsg request) {
      return blockingUnaryCall(
          getChannel(), getVoidVoidMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.IntMsg intInt(gRPC.proto.IntMsg request) {
      return blockingUnaryCall(
          getChannel(), getIntIntMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.LongMsg longLong(gRPC.proto.LongMsg request) {
      return blockingUnaryCall(
          getChannel(), getLongLongMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.StringMsg stringString(gRPC.proto.StringMsgSize request) {
      return blockingUnaryCall(
          getChannel(), getStringStringMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.VoidMsg intVoid(gRPC.proto.IntMsg request) {
      return blockingUnaryCall(
          getChannel(), getIntVoidMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.VoidMsg stringVoid(gRPC.proto.StringMsg request) {
      return blockingUnaryCall(
          getChannel(), getStringVoidMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.VoidMsg longVoid(gRPC.proto.LongMsg request) {
      return blockingUnaryCall(
          getChannel(), getLongVoidMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.IntMsg voidInt(gRPC.proto.VoidMsg request) {
      return blockingUnaryCall(
          getChannel(), getVoidIntMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.StringMsg voidString(gRPC.proto.VoidMsg request) {
      return blockingUnaryCall(
          getChannel(), getVoidStringMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.LongMsg voidLong(gRPC.proto.VoidMsg request) {
      return blockingUnaryCall(
          getChannel(), getVoidLongMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.StringMsg voidBigString(gRPC.proto.VoidMsg request) {
      return blockingUnaryCall(
          getChannel(), getVoidBigStringMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.StringMsg voidSuperString(gRPC.proto.VoidMsg request) {
      return blockingUnaryCall(
          getChannel(), getVoidSuperStringMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.LongMsg longDoisArg(gRPC.proto.Long2x request) {
      return blockingUnaryCall(
          getChannel(), getLongDoisArgMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.LongMsg longQuatroArg(gRPC.proto.Long4x request) {
      return blockingUnaryCall(
          getChannel(), getLongQuatroArgMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.LongMsg longOitoArg(gRPC.proto.Long8x request) {
      return blockingUnaryCall(
          getChannel(), getLongOitoArgMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.StringMsg longStringDoisArg(gRPC.proto.LongString request) {
      return blockingUnaryCall(
          getChannel(), getLongStringDoisArgMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.StringMsg longStringQuatroArg(gRPC.proto.LongStringx2 request) {
      return blockingUnaryCall(
          getChannel(), getLongStringQuatroArgMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public gRPC.proto.Localizacao createLocalizacao(gRPC.proto.LocMsg request) {
      return blockingUnaryCall(
          getChannel(), getCreateLocalizacaoMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.VoidMsg> voidVoid(
        gRPC.proto.VoidMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getVoidVoidMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.IntMsg> intInt(
        gRPC.proto.IntMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getIntIntMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.LongMsg> longLong(
        gRPC.proto.LongMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getLongLongMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.StringMsg> stringString(
        gRPC.proto.StringMsgSize request) {
      return futureUnaryCall(
          getChannel().newCall(getStringStringMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.VoidMsg> intVoid(
        gRPC.proto.IntMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getIntVoidMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.VoidMsg> stringVoid(
        gRPC.proto.StringMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getStringVoidMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.VoidMsg> longVoid(
        gRPC.proto.LongMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getLongVoidMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.IntMsg> voidInt(
        gRPC.proto.VoidMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getVoidIntMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.StringMsg> voidString(
        gRPC.proto.VoidMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getVoidStringMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.LongMsg> voidLong(
        gRPC.proto.VoidMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getVoidLongMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.StringMsg> voidBigString(
        gRPC.proto.VoidMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getVoidBigStringMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.StringMsg> voidSuperString(
        gRPC.proto.VoidMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getVoidSuperStringMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.LongMsg> longDoisArg(
        gRPC.proto.Long2x request) {
      return futureUnaryCall(
          getChannel().newCall(getLongDoisArgMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.LongMsg> longQuatroArg(
        gRPC.proto.Long4x request) {
      return futureUnaryCall(
          getChannel().newCall(getLongQuatroArgMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.LongMsg> longOitoArg(
        gRPC.proto.Long8x request) {
      return futureUnaryCall(
          getChannel().newCall(getLongOitoArgMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.StringMsg> longStringDoisArg(
        gRPC.proto.LongString request) {
      return futureUnaryCall(
          getChannel().newCall(getLongStringDoisArgMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.StringMsg> longStringQuatroArg(
        gRPC.proto.LongStringx2 request) {
      return futureUnaryCall(
          getChannel().newCall(getLongStringQuatroArgMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.Localizacao> createLocalizacao(
        gRPC.proto.LocMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateLocalizacaoMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VOID_VOID = 0;
  private static final int METHODID_INT_INT = 1;
  private static final int METHODID_LONG_LONG = 2;
  private static final int METHODID_STRING_STRING = 3;
  private static final int METHODID_INT_VOID = 4;
  private static final int METHODID_STRING_VOID = 5;
  private static final int METHODID_LONG_VOID = 6;
  private static final int METHODID_VOID_INT = 7;
  private static final int METHODID_VOID_STRING = 8;
  private static final int METHODID_VOID_LONG = 9;
  private static final int METHODID_VOID_BIG_STRING = 10;
  private static final int METHODID_VOID_SUPER_STRING = 11;
  private static final int METHODID_LONG_DOIS_ARG = 12;
  private static final int METHODID_LONG_QUATRO_ARG = 13;
  private static final int METHODID_LONG_OITO_ARG = 14;
  private static final int METHODID_LONG_STRING_DOIS_ARG = 15;
  private static final int METHODID_LONG_STRING_QUATRO_ARG = 16;
  private static final int METHODID_CREATE_LOCALIZACAO = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VOID_VOID:
          serviceImpl.voidVoid((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg>) responseObserver);
          break;
        case METHODID_INT_INT:
          serviceImpl.intInt((gRPC.proto.IntMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.IntMsg>) responseObserver);
          break;
        case METHODID_LONG_LONG:
          serviceImpl.longLong((gRPC.proto.LongMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.LongMsg>) responseObserver);
          break;
        case METHODID_STRING_STRING:
          serviceImpl.stringString((gRPC.proto.StringMsgSize) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
          break;
        case METHODID_INT_VOID:
          serviceImpl.intVoid((gRPC.proto.IntMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg>) responseObserver);
          break;
        case METHODID_STRING_VOID:
          serviceImpl.stringVoid((gRPC.proto.StringMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg>) responseObserver);
          break;
        case METHODID_LONG_VOID:
          serviceImpl.longVoid((gRPC.proto.LongMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg>) responseObserver);
          break;
        case METHODID_VOID_INT:
          serviceImpl.voidInt((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.IntMsg>) responseObserver);
          break;
        case METHODID_VOID_STRING:
          serviceImpl.voidString((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
          break;
        case METHODID_VOID_LONG:
          serviceImpl.voidLong((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.LongMsg>) responseObserver);
          break;
        case METHODID_VOID_BIG_STRING:
          serviceImpl.voidBigString((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
          break;
        case METHODID_VOID_SUPER_STRING:
          serviceImpl.voidSuperString((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
          break;
        case METHODID_LONG_DOIS_ARG:
          serviceImpl.longDoisArg((gRPC.proto.Long2x) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.LongMsg>) responseObserver);
          break;
        case METHODID_LONG_QUATRO_ARG:
          serviceImpl.longQuatroArg((gRPC.proto.Long4x) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.LongMsg>) responseObserver);
          break;
        case METHODID_LONG_OITO_ARG:
          serviceImpl.longOitoArg((gRPC.proto.Long8x) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.LongMsg>) responseObserver);
          break;
        case METHODID_LONG_STRING_DOIS_ARG:
          serviceImpl.longStringDoisArg((gRPC.proto.LongString) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
          break;
        case METHODID_LONG_STRING_QUATRO_ARG:
          serviceImpl.longStringQuatroArg((gRPC.proto.LongStringx2) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
          break;
        case METHODID_CREATE_LOCALIZACAO:
          serviceImpl.createLocalizacao((gRPC.proto.LocMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.Localizacao>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gRPC.proto.MyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getVoidVoidMethodHelper())
              .addMethod(getIntIntMethodHelper())
              .addMethod(getLongLongMethodHelper())
              .addMethod(getStringStringMethodHelper())
              .addMethod(getIntVoidMethodHelper())
              .addMethod(getStringVoidMethodHelper())
              .addMethod(getLongVoidMethodHelper())
              .addMethod(getVoidIntMethodHelper())
              .addMethod(getVoidStringMethodHelper())
              .addMethod(getVoidLongMethodHelper())
              .addMethod(getVoidBigStringMethodHelper())
              .addMethod(getVoidSuperStringMethodHelper())
              .addMethod(getLongDoisArgMethodHelper())
              .addMethod(getLongQuatroArgMethodHelper())
              .addMethod(getLongOitoArgMethodHelper())
              .addMethod(getLongStringDoisArgMethodHelper())
              .addMethod(getLongStringQuatroArgMethodHelper())
              .addMethod(getCreateLocalizacaoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
