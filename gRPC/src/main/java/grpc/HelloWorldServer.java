package grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

import gRPC.proto.*;

public class HelloWorldServer {
    private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

    private Server server;

    public static void main(String[] args) throws IOException, InterruptedException {
        final HelloWorldServer server = new HelloWorldServer();
        server.start();
        server.blockUntilShutdown();
    }
    
    private void start() throws IOException {
        /* Porta do servidor */
        int port = 50051;
        server = ServerBuilder.forPort(port).addService(new GreeterImpl()).build().start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {                
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

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    static class GreeterImpl extends gRPC.proto.GreeterGrpc.GreeterImplBase {
    	
        /* ------------------------------------------- */
    	/* Metodos que recebem e retornam o mesmo tipo */
    	/* ------------------------------------------- */
        
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
            IntMsg reply = IntMsg.newBuilder().setValue(req.getValue()*c).build(); //retorna o dobro da entrada
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        //recebe long retorna long
        public void longLong(LongMsg req, StreamObserver<LongMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            LongMsg reply = LongMsg.newBuilder().setValue(req.getValue()*c).build(); //retorna o dobro da entrada
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        //recebe string retorna string
        public void stringString(StringMsgSize req, StreamObserver<StringMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            
            String result = "";
    		for (int i = 0; i < req.getSize(); i++) {
    			result += "a";
    		}
            
    		StringMsg reply = StringMsg.newBuilder().setMessage(c + result).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        /* ------------------------------------------- */
    	/* Metodos que recebem um tipo e retornam void */
    	/* ------------------------------------------- */
        
        //recebe int retorna void
        public void intVoid(IntMsg req, StreamObserver<VoidMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b + req.getValue();
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
        
        //recebe long retorna void
        public void longVoid(LongMsg req, StreamObserver<VoidMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            long c = a/b + req.getValue();
            VoidMsg reply = VoidMsg.newBuilder().build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        /* ------------------------------------------- */
    	/* Metodos que recebem void e retornam um tipo */
    	/* ------------------------------------------- */
        
        //recebe void retorna int
        public void voidInt(VoidMsg req, StreamObserver<IntMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            IntMsg reply = IntMsg.newBuilder().setValue(c).build();
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
        
        //recebe void retorna int
        public void voidLong(VoidMsg req, StreamObserver<LongMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            LongMsg reply = LongMsg.newBuilder().setValue(c + 91234567891012L).build();
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
        
        // metodo auxiliar para criacao de bigstring
        private String bigString() {
            String str = "";
            for (int i = 0; i < 1024; i++) {
                str += "a";
            }
            return str;
        }
        
        // metodo auxiliar para criacao de superstring
        private String superString() {
            String str = "";
            for (int i = 0; i < 102400; i++) {
                str += "a";
            }
            return str;
        }
        
        /* ----------------------------------------------------------- */
    	/* Metodos que recebem mais de um argumento e retornam um tipo */
    	/* ----------------------------------------------------------- */

        // recebe dois argumentos long e retorna um
        public void longDoisArg(Long2x req, StreamObserver<LongMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            LongMsg reply = LongMsg.newBuilder().setValue(c + req.getValue1() + req.getValue2()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        // recebe quatro argumentos long e retorna um
        public void longQuatroArg(Long4x req, StreamObserver<LongMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            LongMsg reply = LongMsg.newBuilder().setValue(c + (req.getValue1() / req.getValue2()) + (req.getValue3() / req.getValue4())).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        // recebe oito argumentos long e retorna um
        public void longOitoArg(Long8x req, StreamObserver<LongMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            LongMsg reply = LongMsg.newBuilder().setValue(
            		(req.getValue1() - req.getValue2() + req.getValue3() - req.getValue4()) /
            		(req.getValue5() - req.getValue6() + req.getValue7() - req.getValue8()) + c).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        // recebe dois argumentos (long, String) e retorna uma String
        public void longStringDoisArg(LongString req, StreamObserver<StringMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            StringMsg reply = StringMsg.newBuilder().setMessage(c + req.getValue() + req.getMessage()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
        
        // recebe quatro argumentos (long, long, String, String) e retorna uma String
        public void longStringQuatroArg(LongStringx2 req, StreamObserver<StringMsg> responseObserver) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            StringMsg reply = StringMsg.newBuilder().setMessage(c + req.getValue1() +
            		req.getValue2() + req.getMessage1() + req.getMessage2()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }        
      
        /* ----------------------------------------------- */
    	/* Metodos que recebem e retornam um tipo complexo */
    	/* ----------------------------------------------- */
        
        // recebe três argumentos e cria um objeto Localizacao
        public void createLocalizacao(LocMsg req, StreamObserver<Localizacao> responseObserver) {
        	Localizacao reply = Localizacao.newBuilder()
        			.setLatitude(req.getLat())
        			.setLongitude(req.getLongi())
        			.setMensagem(req.getMsg())
        			.build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }        
    }
}