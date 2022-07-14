package ru.inie;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class GrpcMessageService extends MessageServiceGrpc.MessageServiceImplBase {
    @Override
    public void getMessage(Empty request, StreamObserver<MessageServiceOuterClass.Message> responseObserver) {
        responseObserver.onNext(MessageServiceOuterClass.Message.newBuilder()
                .setText("Hello")
                .build()
        );
        responseObserver.onCompleted();
    }
}
