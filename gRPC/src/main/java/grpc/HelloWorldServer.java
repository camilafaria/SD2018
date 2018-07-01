package grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.logging.Logger;

import gRPC.proto.HelloReply;
import gRPC.proto.HelloRequest;
import gRPC.proto.*;

public class HelloWorldServer {
    /**
     * Server that manages startup/shutdown of a {@code Greeter} server.
     */
    private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50051;
        server = ServerBuilder.forPort(port).addService(new GreeterImpl()).build().start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown
                // hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                HelloWorldServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon
     * threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final HelloWorldServer server = new HelloWorldServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class GreeterImpl extends gRPC.proto.GreeterGrpc.GreeterImplBase {

        @Override
        public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
            HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        @Override
        public void sayHelloAgain(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
            HelloReply reply = HelloReply.newBuilder().setMessage("Hello again " + req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        //recebe void retorna void
        public void voidVoid(VoidMsg req, StreamObserver<VoidMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            VoidMsg reply = VoidMsg.newBuilder().build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        //recebe int retorna int
        public void intInt(IntMsg req, StreamObserver<IntMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            IntMsg reply = IntMsg.newBuilder().setMessage(req.getMessage()*c).build(); //retorna o dobro da entrada
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        //recebe string retorna string
        public void stringString(StringMsg req, StreamObserver<StringMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            StringMsg reply = StringMsg.newBuilder().setMessage("funcionou " + c + req.getMessage()).build(); //retorna funcionou 2 (entrada)
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        //recebe int retorna void
        public void intVoid(IntMsg req, StreamObserver<VoidMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b + req.getMessage();
            VoidMsg reply = VoidMsg.newBuilder().build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        //recebe string retorna void
        public void stringVoid(StringMsg req, StreamObserver<VoidMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            String c = a/b + req.getMessage();
            VoidMsg reply = VoidMsg.newBuilder().build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        //recebe void retorna int
        public void voidInt(VoidMsg req, StreamObserver<IntMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            IntMsg reply = IntMsg.newBuilder().setMessage(c).build(); //retorna 2
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        //recebe void retorna string
        public void voidString(VoidMsg req, StreamObserver<StringMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            StringMsg reply = StringMsg.newBuilder().setMessage("funcionou " + c).build(); //retorna funcionou 2
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        //recebe void retorna big string
        public void voidBigString(VoidMsg req, StreamObserver<StringMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            StringMsg reply = StringMsg.newBuilder().setMessage(bigString() + c).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        //recebe void retorna super string
        public void voidSuperString(VoidMsg req, StreamObserver<StringMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            StringMsg reply = StringMsg.newBuilder().setMessage(superString() + c).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        private String bigString() {
            String str = "";
            for (int i = 0; i < 1024; i++) {
                str += "a";
            }
            return str;
        }
        private String superString() {
            String str = "";
            for (int i = 0; i < 102400; i++) {
                str += "a";
            }
            return str;
        }
    }
}