package LR_CA.SmartClothesService;

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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: SmartClothesService.proto")
public final class SmartClothesServiceGrpc {

  private SmartClothesServiceGrpc() {}

  public static final String SERVICE_NAME = "service2.SmartClothesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<LR_CA.SmartClothesService.ControlRequest,
      LR_CA.SmartClothesService.ControlResponse> getBodyTempControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bodyTempControl",
      requestType = LR_CA.SmartClothesService.ControlRequest.class,
      responseType = LR_CA.SmartClothesService.ControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<LR_CA.SmartClothesService.ControlRequest,
      LR_CA.SmartClothesService.ControlResponse> getBodyTempControlMethod() {
    io.grpc.MethodDescriptor<LR_CA.SmartClothesService.ControlRequest, LR_CA.SmartClothesService.ControlResponse> getBodyTempControlMethod;
    if ((getBodyTempControlMethod = SmartClothesServiceGrpc.getBodyTempControlMethod) == null) {
      synchronized (SmartClothesServiceGrpc.class) {
        if ((getBodyTempControlMethod = SmartClothesServiceGrpc.getBodyTempControlMethod) == null) {
          SmartClothesServiceGrpc.getBodyTempControlMethod = getBodyTempControlMethod = 
              io.grpc.MethodDescriptor.<LR_CA.SmartClothesService.ControlRequest, LR_CA.SmartClothesService.ControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.SmartClothesService", "bodyTempControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.SmartClothesService.ControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.SmartClothesService.ControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartClothesServiceMethodDescriptorSupplier("bodyTempControl"))
                  .build();
          }
        }
     }
     return getBodyTempControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LR_CA.SmartClothesService.StretchingRequest,
      LR_CA.SmartClothesService.StretchingResponse> getMusclesStretchingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "musclesStretching",
      requestType = LR_CA.SmartClothesService.StretchingRequest.class,
      responseType = LR_CA.SmartClothesService.StretchingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<LR_CA.SmartClothesService.StretchingRequest,
      LR_CA.SmartClothesService.StretchingResponse> getMusclesStretchingMethod() {
    io.grpc.MethodDescriptor<LR_CA.SmartClothesService.StretchingRequest, LR_CA.SmartClothesService.StretchingResponse> getMusclesStretchingMethod;
    if ((getMusclesStretchingMethod = SmartClothesServiceGrpc.getMusclesStretchingMethod) == null) {
      synchronized (SmartClothesServiceGrpc.class) {
        if ((getMusclesStretchingMethod = SmartClothesServiceGrpc.getMusclesStretchingMethod) == null) {
          SmartClothesServiceGrpc.getMusclesStretchingMethod = getMusclesStretchingMethod = 
              io.grpc.MethodDescriptor.<LR_CA.SmartClothesService.StretchingRequest, LR_CA.SmartClothesService.StretchingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.SmartClothesService", "musclesStretching"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.SmartClothesService.StretchingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.SmartClothesService.StretchingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartClothesServiceMethodDescriptorSupplier("musclesStretching"))
                  .build();
          }
        }
     }
     return getMusclesStretchingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartClothesServiceStub newStub(io.grpc.Channel channel) {
    return new SmartClothesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartClothesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartClothesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartClothesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartClothesServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class SmartClothesServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for CLIENT STREAMING calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.ControlRequest> bodyTempControl(
        io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.ControlResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBodyTempControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * This is a bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.StretchingRequest> musclesStretching(
        io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.StretchingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMusclesStretchingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBodyTempControlMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                LR_CA.SmartClothesService.ControlRequest,
                LR_CA.SmartClothesService.ControlResponse>(
                  this, METHODID_BODY_TEMP_CONTROL)))
          .addMethod(
            getMusclesStretchingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                LR_CA.SmartClothesService.StretchingRequest,
                LR_CA.SmartClothesService.StretchingResponse>(
                  this, METHODID_MUSCLES_STRETCHING)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SmartClothesServiceStub extends io.grpc.stub.AbstractStub<SmartClothesServiceStub> {
    private SmartClothesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartClothesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartClothesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartClothesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for CLIENT STREAMING calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.ControlRequest> bodyTempControl(
        io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.ControlResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBodyTempControlMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * This is a bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.StretchingRequest> musclesStretching(
        io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.StretchingResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMusclesStretchingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SmartClothesServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartClothesServiceBlockingStub> {
    private SmartClothesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartClothesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartClothesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartClothesServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SmartClothesServiceFutureStub extends io.grpc.stub.AbstractStub<SmartClothesServiceFutureStub> {
    private SmartClothesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartClothesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartClothesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartClothesServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BODY_TEMP_CONTROL = 0;
  private static final int METHODID_MUSCLES_STRETCHING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartClothesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartClothesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BODY_TEMP_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bodyTempControl(
              (io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.ControlResponse>) responseObserver);
        case METHODID_MUSCLES_STRETCHING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.musclesStretching(
              (io.grpc.stub.StreamObserver<LR_CA.SmartClothesService.StretchingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartClothesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartClothesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return LR_CA.SmartClothesService.SmartClothesServicelmpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartClothesService");
    }
  }

  private static final class SmartClothesServiceFileDescriptorSupplier
      extends SmartClothesServiceBaseDescriptorSupplier {
    SmartClothesServiceFileDescriptorSupplier() {}
  }

  private static final class SmartClothesServiceMethodDescriptorSupplier
      extends SmartClothesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartClothesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartClothesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartClothesServiceFileDescriptorSupplier())
              .addMethod(getBodyTempControlMethod())
              .addMethod(getMusclesStretchingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
