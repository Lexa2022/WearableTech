package LR_CA.RingMouseControlService;

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
    comments = "Source: RingMouseControlService.proto")
public final class RingMouseControlServiceGrpc {

  private RingMouseControlServiceGrpc() {}

  public static final String SERVICE_NAME = "service1.RingMouseControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.MoveRequest,
      LR_CA.RingMouseControlService.MoveResponse> getMoveCursorToRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "moveCursorToRight",
      requestType = LR_CA.RingMouseControlService.MoveRequest.class,
      responseType = LR_CA.RingMouseControlService.MoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.MoveRequest,
      LR_CA.RingMouseControlService.MoveResponse> getMoveCursorToRightMethod() {
    io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.MoveRequest, LR_CA.RingMouseControlService.MoveResponse> getMoveCursorToRightMethod;
    if ((getMoveCursorToRightMethod = RingMouseControlServiceGrpc.getMoveCursorToRightMethod) == null) {
      synchronized (RingMouseControlServiceGrpc.class) {
        if ((getMoveCursorToRightMethod = RingMouseControlServiceGrpc.getMoveCursorToRightMethod) == null) {
          RingMouseControlServiceGrpc.getMoveCursorToRightMethod = getMoveCursorToRightMethod = 
              io.grpc.MethodDescriptor.<LR_CA.RingMouseControlService.MoveRequest, LR_CA.RingMouseControlService.MoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.RingMouseControlService", "moveCursorToRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.RingMouseControlService.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.RingMouseControlService.MoveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RingMouseControlServiceMethodDescriptorSupplier("moveCursorToRight"))
                  .build();
          }
        }
     }
     return getMoveCursorToRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.MoveRequest,
      LR_CA.RingMouseControlService.MoveResponse> getMoveCursorToLeftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "moveCursorToLeft",
      requestType = LR_CA.RingMouseControlService.MoveRequest.class,
      responseType = LR_CA.RingMouseControlService.MoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.MoveRequest,
      LR_CA.RingMouseControlService.MoveResponse> getMoveCursorToLeftMethod() {
    io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.MoveRequest, LR_CA.RingMouseControlService.MoveResponse> getMoveCursorToLeftMethod;
    if ((getMoveCursorToLeftMethod = RingMouseControlServiceGrpc.getMoveCursorToLeftMethod) == null) {
      synchronized (RingMouseControlServiceGrpc.class) {
        if ((getMoveCursorToLeftMethod = RingMouseControlServiceGrpc.getMoveCursorToLeftMethod) == null) {
          RingMouseControlServiceGrpc.getMoveCursorToLeftMethod = getMoveCursorToLeftMethod = 
              io.grpc.MethodDescriptor.<LR_CA.RingMouseControlService.MoveRequest, LR_CA.RingMouseControlService.MoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.RingMouseControlService", "moveCursorToLeft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.RingMouseControlService.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.RingMouseControlService.MoveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RingMouseControlServiceMethodDescriptorSupplier("moveCursorToLeft"))
                  .build();
          }
        }
     }
     return getMoveCursorToLeftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.Message,
      LR_CA.RingMouseControlService.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = LR_CA.RingMouseControlService.Message.class,
      responseType = LR_CA.RingMouseControlService.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.Message,
      LR_CA.RingMouseControlService.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.Message, LR_CA.RingMouseControlService.Empty> getEmptyMethod;
    if ((getEmptyMethod = RingMouseControlServiceGrpc.getEmptyMethod) == null) {
      synchronized (RingMouseControlServiceGrpc.class) {
        if ((getEmptyMethod = RingMouseControlServiceGrpc.getEmptyMethod) == null) {
          RingMouseControlServiceGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<LR_CA.RingMouseControlService.Message, LR_CA.RingMouseControlService.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.RingMouseControlService", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.RingMouseControlService.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.RingMouseControlService.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RingMouseControlServiceMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.SelectObjectRequest,
      LR_CA.RingMouseControlService.SelectObjectResponse> getSelectObjectTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelectObjectText",
      requestType = LR_CA.RingMouseControlService.SelectObjectRequest.class,
      responseType = LR_CA.RingMouseControlService.SelectObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.SelectObjectRequest,
      LR_CA.RingMouseControlService.SelectObjectResponse> getSelectObjectTextMethod() {
    io.grpc.MethodDescriptor<LR_CA.RingMouseControlService.SelectObjectRequest, LR_CA.RingMouseControlService.SelectObjectResponse> getSelectObjectTextMethod;
    if ((getSelectObjectTextMethod = RingMouseControlServiceGrpc.getSelectObjectTextMethod) == null) {
      synchronized (RingMouseControlServiceGrpc.class) {
        if ((getSelectObjectTextMethod = RingMouseControlServiceGrpc.getSelectObjectTextMethod) == null) {
          RingMouseControlServiceGrpc.getSelectObjectTextMethod = getSelectObjectTextMethod = 
              io.grpc.MethodDescriptor.<LR_CA.RingMouseControlService.SelectObjectRequest, LR_CA.RingMouseControlService.SelectObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.RingMouseControlService", "SelectObjectText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.RingMouseControlService.SelectObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LR_CA.RingMouseControlService.SelectObjectResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RingMouseControlServiceMethodDescriptorSupplier("SelectObjectText"))
                  .build();
          }
        }
     }
     return getSelectObjectTextMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RingMouseControlServiceStub newStub(io.grpc.Channel channel) {
    return new RingMouseControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RingMouseControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RingMouseControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RingMouseControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RingMouseControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class RingMouseControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void moveCursorToRight(LR_CA.RingMouseControlService.MoveRequest request,
        io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.MoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveCursorToRightMethod(), responseObserver);
    }

    /**
     */
    public void moveCursorToLeft(LR_CA.RingMouseControlService.MoveRequest request,
        io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.MoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveCursorToLeftMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public void empty(LR_CA.RingMouseControlService.Message request,
        io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc method for server streaming calls
     * </pre>
     */
    public void selectObjectText(LR_CA.RingMouseControlService.SelectObjectRequest request,
        io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.SelectObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSelectObjectTextMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMoveCursorToRightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                LR_CA.RingMouseControlService.MoveRequest,
                LR_CA.RingMouseControlService.MoveResponse>(
                  this, METHODID_MOVE_CURSOR_TO_RIGHT)))
          .addMethod(
            getMoveCursorToLeftMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                LR_CA.RingMouseControlService.MoveRequest,
                LR_CA.RingMouseControlService.MoveResponse>(
                  this, METHODID_MOVE_CURSOR_TO_LEFT)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                LR_CA.RingMouseControlService.Message,
                LR_CA.RingMouseControlService.Empty>(
                  this, METHODID_EMPTY)))
          .addMethod(
            getSelectObjectTextMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                LR_CA.RingMouseControlService.SelectObjectRequest,
                LR_CA.RingMouseControlService.SelectObjectResponse>(
                  this, METHODID_SELECT_OBJECT_TEXT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RingMouseControlServiceStub extends io.grpc.stub.AbstractStub<RingMouseControlServiceStub> {
    private RingMouseControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RingMouseControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RingMouseControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RingMouseControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void moveCursorToRight(LR_CA.RingMouseControlService.MoveRequest request,
        io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.MoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveCursorToRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void moveCursorToLeft(LR_CA.RingMouseControlService.MoveRequest request,
        io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.MoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveCursorToLeftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public void empty(LR_CA.RingMouseControlService.Message request,
        io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc method for server streaming calls
     * </pre>
     */
    public void selectObjectText(LR_CA.RingMouseControlService.SelectObjectRequest request,
        io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.SelectObjectResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSelectObjectTextMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RingMouseControlServiceBlockingStub extends io.grpc.stub.AbstractStub<RingMouseControlServiceBlockingStub> {
    private RingMouseControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RingMouseControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RingMouseControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RingMouseControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public LR_CA.RingMouseControlService.MoveResponse moveCursorToRight(LR_CA.RingMouseControlService.MoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveCursorToRightMethod(), getCallOptions(), request);
    }

    /**
     */
    public LR_CA.RingMouseControlService.MoveResponse moveCursorToLeft(LR_CA.RingMouseControlService.MoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveCursorToLeftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public LR_CA.RingMouseControlService.Empty empty(LR_CA.RingMouseControlService.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc method for server streaming calls
     * </pre>
     */
    public java.util.Iterator<LR_CA.RingMouseControlService.SelectObjectResponse> selectObjectText(
        LR_CA.RingMouseControlService.SelectObjectRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSelectObjectTextMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class RingMouseControlServiceFutureStub extends io.grpc.stub.AbstractStub<RingMouseControlServiceFutureStub> {
    private RingMouseControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RingMouseControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RingMouseControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RingMouseControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<LR_CA.RingMouseControlService.MoveResponse> moveCursorToRight(
        LR_CA.RingMouseControlService.MoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveCursorToRightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LR_CA.RingMouseControlService.MoveResponse> moveCursorToLeft(
        LR_CA.RingMouseControlService.MoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveCursorToLeftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<LR_CA.RingMouseControlService.Empty> empty(
        LR_CA.RingMouseControlService.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOVE_CURSOR_TO_RIGHT = 0;
  private static final int METHODID_MOVE_CURSOR_TO_LEFT = 1;
  private static final int METHODID_EMPTY = 2;
  private static final int METHODID_SELECT_OBJECT_TEXT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RingMouseControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RingMouseControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOVE_CURSOR_TO_RIGHT:
          serviceImpl.moveCursorToRight((LR_CA.RingMouseControlService.MoveRequest) request,
              (io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.MoveResponse>) responseObserver);
          break;
        case METHODID_MOVE_CURSOR_TO_LEFT:
          serviceImpl.moveCursorToLeft((LR_CA.RingMouseControlService.MoveRequest) request,
              (io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.MoveResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((LR_CA.RingMouseControlService.Message) request,
              (io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.Empty>) responseObserver);
          break;
        case METHODID_SELECT_OBJECT_TEXT:
          serviceImpl.selectObjectText((LR_CA.RingMouseControlService.SelectObjectRequest) request,
              (io.grpc.stub.StreamObserver<LR_CA.RingMouseControlService.SelectObjectResponse>) responseObserver);
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

  private static abstract class RingMouseControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RingMouseControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return LR_CA.RingMouseControlService.RingMouseControlServicelmpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RingMouseControlService");
    }
  }

  private static final class RingMouseControlServiceFileDescriptorSupplier
      extends RingMouseControlServiceBaseDescriptorSupplier {
    RingMouseControlServiceFileDescriptorSupplier() {}
  }

  private static final class RingMouseControlServiceMethodDescriptorSupplier
      extends RingMouseControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RingMouseControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RingMouseControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RingMouseControlServiceFileDescriptorSupplier())
              .addMethod(getMoveCursorToRightMethod())
              .addMethod(getMoveCursorToLeftMethod())
              .addMethod(getEmptyMethod())
              .addMethod(getSelectObjectTextMethod())
              .build();
        }
      }
    }
    return result;
  }
}
