package LR_CA.FitnessTrackersService;

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
    comments = "Source: FitnessTrackersService.proto")
public final class FitnessTrackersServiceGrpc {

  private FitnessTrackersServiceGrpc() {}

  public static final String SERVICE_NAME = "service2.FitnessTrackersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<LR_CA.FitnessTrackersService.StepsRequest,
      LR_CA.FitnessTrackersService.StepsResponse> getNumberOfStepsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "numberOfSteps",
      requestType = LR_CA.FitnessTrackersService.StepsRequest.class,
      responseType = LR_CA.FitnessTrackersService.StepsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<LR_CA.FitnessTrackersService.StepsRequest,
      LR_CA.FitnessTrackersService.StepsResponse> getNumberOfStepsMethod() {
    io.grpc.MethodDescriptor<LR_CA.FitnessTrackersService.StepsRequest, LR_CA.FitnessTrackersService.StepsResponse> getNumberOfStepsMethod;
    if ((getNumberOfStepsMethod = FitnessTrackersServiceGrpc.getNumberOfStepsMethod) == null) {
      synchronized (FitnessTrackersServiceGrpc.class) {
        if ((getNumberOfStepsMethod = FitnessTrackersServiceGrpc.getNumberOfStepsMethod) == null) {
          FitnessTrackersServiceGrpc.getNumberOfStepsMethod = getNumberOfStepsMethod = 
              io.grpc.MethodDescriptor.<LR_CA.FitnessTrackersService.StepsRequest, LR_CA.FitnessTrackersService.StepsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.FitnessTrackersService", "numberOfSteps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.FitnessTrackersService.StepsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.FitnessTrackersService.StepsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FitnessTrackersServiceMethodDescriptorSupplier("numberOfSteps"))
                  .build();
          }
        }
     }
     return getNumberOfStepsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LR_CA.FitnessTrackersService.MonitorRequest,
      LR_CA.FitnessTrackersService.MonitorResponse> getHeartRateMonitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heartRateMonitor",
      requestType = LR_CA.FitnessTrackersService.MonitorRequest.class,
      responseType = LR_CA.FitnessTrackersService.MonitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<LR_CA.FitnessTrackersService.MonitorRequest,
      LR_CA.FitnessTrackersService.MonitorResponse> getHeartRateMonitorMethod() {
    io.grpc.MethodDescriptor<LR_CA.FitnessTrackersService.MonitorRequest, LR_CA.FitnessTrackersService.MonitorResponse> getHeartRateMonitorMethod;
    if ((getHeartRateMonitorMethod = FitnessTrackersServiceGrpc.getHeartRateMonitorMethod) == null) {
      synchronized (FitnessTrackersServiceGrpc.class) {
        if ((getHeartRateMonitorMethod = FitnessTrackersServiceGrpc.getHeartRateMonitorMethod) == null) {
          FitnessTrackersServiceGrpc.getHeartRateMonitorMethod = getHeartRateMonitorMethod = 
              io.grpc.MethodDescriptor.<LR_CA.FitnessTrackersService.MonitorRequest, LR_CA.FitnessTrackersService.MonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.FitnessTrackersService", "heartRateMonitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.FitnessTrackersService.MonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.FitnessTrackersService.MonitorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FitnessTrackersServiceMethodDescriptorSupplier("heartRateMonitor"))
                  .build();
          }
        }
     }
     return getHeartRateMonitorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FitnessTrackersServiceStub newStub(io.grpc.Channel channel) {
    return new FitnessTrackersServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FitnessTrackersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FitnessTrackersServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FitnessTrackersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FitnessTrackersServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class FitnessTrackersServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for CLIENT STREAMING calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.StepsRequest> numberOfSteps(
        io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.StepsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getNumberOfStepsMethod(), responseObserver);
    }

    /**
     * <pre>
     * This is a bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.MonitorRequest> heartRateMonitor(
        io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.MonitorResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getHeartRateMonitorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNumberOfStepsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                LR_CA.FitnessTrackersService.StepsRequest,
                LR_CA.FitnessTrackersService.StepsResponse>(
                  this, METHODID_NUMBER_OF_STEPS)))
          .addMethod(
            getHeartRateMonitorMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                LR_CA.FitnessTrackersService.MonitorRequest,
                LR_CA.FitnessTrackersService.MonitorResponse>(
                  this, METHODID_HEART_RATE_MONITOR)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class FitnessTrackersServiceStub extends io.grpc.stub.AbstractStub<FitnessTrackersServiceStub> {
    private FitnessTrackersServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FitnessTrackersServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FitnessTrackersServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FitnessTrackersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for CLIENT STREAMING calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.StepsRequest> numberOfSteps(
        io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.StepsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getNumberOfStepsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * This is a bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.MonitorRequest> heartRateMonitor(
        io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.MonitorResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHeartRateMonitorMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class FitnessTrackersServiceBlockingStub extends io.grpc.stub.AbstractStub<FitnessTrackersServiceBlockingStub> {
    private FitnessTrackersServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FitnessTrackersServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FitnessTrackersServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FitnessTrackersServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class FitnessTrackersServiceFutureStub extends io.grpc.stub.AbstractStub<FitnessTrackersServiceFutureStub> {
    private FitnessTrackersServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FitnessTrackersServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FitnessTrackersServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FitnessTrackersServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_NUMBER_OF_STEPS = 0;
  private static final int METHODID_HEART_RATE_MONITOR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FitnessTrackersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FitnessTrackersServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_NUMBER_OF_STEPS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.numberOfSteps(
              (io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.StepsResponse>) responseObserver);
        case METHODID_HEART_RATE_MONITOR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.heartRateMonitor(
              (io.grpc.stub.StreamObserver<LR_CA.FitnessTrackersService.MonitorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FitnessTrackersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FitnessTrackersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return LR_CA.FitnessTrackersService.FitnessTrackersServicelmpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FitnessTrackersService");
    }
  }

  private static final class FitnessTrackersServiceFileDescriptorSupplier
      extends FitnessTrackersServiceBaseDescriptorSupplier {
    FitnessTrackersServiceFileDescriptorSupplier() {}
  }

  private static final class FitnessTrackersServiceMethodDescriptorSupplier
      extends FitnessTrackersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FitnessTrackersServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FitnessTrackersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FitnessTrackersServiceFileDescriptorSupplier())
              .addMethod(getNumberOfStepsMethod())
              .addMethod(getHeartRateMonitorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
