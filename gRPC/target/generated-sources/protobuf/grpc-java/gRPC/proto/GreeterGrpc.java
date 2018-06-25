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
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: gRPC.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "gRPC.Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.HelloRequest,
      gRPC.proto.HelloReply> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.HelloRequest,
      gRPC.proto.HelloReply> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.HelloRequest,
      gRPC.proto.HelloReply> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.HelloRequest,
      gRPC.proto.HelloReply> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.HelloRequest, gRPC.proto.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.HelloRequest, gRPC.proto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloAgainMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.HelloRequest,
      gRPC.proto.HelloReply> METHOD_SAY_HELLO_AGAIN = getSayHelloAgainMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.HelloRequest,
      gRPC.proto.HelloReply> getSayHelloAgainMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.HelloRequest,
      gRPC.proto.HelloReply> getSayHelloAgainMethod() {
    return getSayHelloAgainMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.HelloRequest,
      gRPC.proto.HelloReply> getSayHelloAgainMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.HelloRequest, gRPC.proto.HelloReply> getSayHelloAgainMethod;
    if ((getSayHelloAgainMethod = GreeterGrpc.getSayHelloAgainMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloAgainMethod = GreeterGrpc.getSayHelloAgainMethod) == null) {
          GreeterGrpc.getSayHelloAgainMethod = getSayHelloAgainMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.HelloRequest, gRPC.proto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "SayHelloAgain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloAgain"))
                  .build();
          }
        }
     }
     return getSayHelloAgainMethod;
  }
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
  @java.lang.Deprecated // Use {@link #getStringStringMethod()} instead. 
  public static final io.grpc.MethodDescriptor<gRPC.proto.StringMsg,
      gRPC.proto.StringMsg> METHOD_STRING_STRING = getStringStringMethodHelper();

  private static volatile io.grpc.MethodDescriptor<gRPC.proto.StringMsg,
      gRPC.proto.StringMsg> getStringStringMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<gRPC.proto.StringMsg,
      gRPC.proto.StringMsg> getStringStringMethod() {
    return getStringStringMethodHelper();
  }

  private static io.grpc.MethodDescriptor<gRPC.proto.StringMsg,
      gRPC.proto.StringMsg> getStringStringMethodHelper() {
    io.grpc.MethodDescriptor<gRPC.proto.StringMsg, gRPC.proto.StringMsg> getStringStringMethod;
    if ((getStringStringMethod = GreeterGrpc.getStringStringMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getStringStringMethod = GreeterGrpc.getStringStringMethod) == null) {
          GreeterGrpc.getStringStringMethod = getStringStringMethod = 
              io.grpc.MethodDescriptor.<gRPC.proto.StringMsg, gRPC.proto.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC.Greeter", "StringString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC.proto.StringMsg.getDefaultInstance()))
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
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(gRPC.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<gRPC.proto.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(gRPC.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<gRPC.proto.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloAgainMethodHelper(), responseObserver);
    }

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
    public void stringString(gRPC.proto.StringMsg request,
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

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.HelloRequest,
                gRPC.proto.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloAgainMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.HelloRequest,
                gRPC.proto.HelloReply>(
                  this, METHODID_SAY_HELLO_AGAIN)))
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
            getStringStringMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC.proto.StringMsg,
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
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
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
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(gRPC.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<gRPC.proto.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(gRPC.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<gRPC.proto.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloAgainMethodHelper(), getCallOptions()), request, responseObserver);
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
    public void stringString(gRPC.proto.StringMsg request,
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
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
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
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public gRPC.proto.HelloReply sayHello(gRPC.proto.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public gRPC.proto.HelloReply sayHelloAgain(gRPC.proto.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloAgainMethodHelper(), getCallOptions(), request);
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
    public gRPC.proto.StringMsg stringString(gRPC.proto.StringMsg request) {
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
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
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
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.HelloReply> sayHello(
        gRPC.proto.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.HelloReply> sayHelloAgain(
        gRPC.proto.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloAgainMethodHelper(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<gRPC.proto.StringMsg> stringString(
        gRPC.proto.StringMsg request) {
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
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_AGAIN = 1;
  private static final int METHODID_VOID_VOID = 2;
  private static final int METHODID_INT_INT = 3;
  private static final int METHODID_STRING_STRING = 4;
  private static final int METHODID_INT_VOID = 5;
  private static final int METHODID_STRING_VOID = 6;
  private static final int METHODID_VOID_INT = 7;
  private static final int METHODID_VOID_STRING = 8;
  private static final int METHODID_VOID_BIG_STRING = 9;
  private static final int METHODID_VOID_SUPER_STRING = 10;

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
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((gRPC.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((gRPC.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.HelloReply>) responseObserver);
          break;
        case METHODID_VOID_VOID:
          serviceImpl.voidVoid((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.VoidMsg>) responseObserver);
          break;
        case METHODID_INT_INT:
          serviceImpl.intInt((gRPC.proto.IntMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.IntMsg>) responseObserver);
          break;
        case METHODID_STRING_STRING:
          serviceImpl.stringString((gRPC.proto.StringMsg) request,
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
        case METHODID_VOID_INT:
          serviceImpl.voidInt((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.IntMsg>) responseObserver);
          break;
        case METHODID_VOID_STRING:
          serviceImpl.voidString((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
          break;
        case METHODID_VOID_BIG_STRING:
          serviceImpl.voidBigString((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
          break;
        case METHODID_VOID_SUPER_STRING:
          serviceImpl.voidSuperString((gRPC.proto.VoidMsg) request,
              (io.grpc.stub.StreamObserver<gRPC.proto.StringMsg>) responseObserver);
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
              .addMethod(getSayHelloMethodHelper())
              .addMethod(getSayHelloAgainMethodHelper())
              .addMethod(getVoidVoidMethodHelper())
              .addMethod(getIntIntMethodHelper())
              .addMethod(getStringStringMethodHelper())
              .addMethod(getIntVoidMethodHelper())
              .addMethod(getStringVoidMethodHelper())
              .addMethod(getVoidIntMethodHelper())
              .addMethod(getVoidStringMethodHelper())
              .addMethod(getVoidBigStringMethodHelper())
              .addMethod(getVoidSuperStringMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
