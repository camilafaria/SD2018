package grpc;

import gRPC.proto.GoodbyeRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import gRPC.proto.GreeterGrpc;
import gRPC.proto.HelloReply;
import gRPC.proto.HelloRequest;
import gRPC.proto.*;

public class HelloWorldClient {
	/**
	 * A simple client that requests a greeting from the {@link HelloWorldServer}.
	 */
		private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());

		private final ManagedChannel channel;
		private final GreeterGrpc.GreeterBlockingStub blockingStub;

		/** Construct client connecting to HelloWorld server at {@code host:port}. */
		public HelloWorldClient(String host, int port) {
			this(ManagedChannelBuilder.forAddress(host, port)
					// Channels are secure by default (via SSL/TLS). For the example we disable TLS
					// to avoid
					// needing certificates.
					.usePlaintext(true).build());
		}

		/**
		 * Construct client for accessing RouteGuide server using the existing channel.
		 */
		HelloWorldClient(ManagedChannel channel) {
			this.channel = channel;
			blockingStub = GreeterGrpc.newBlockingStub(channel);
		}

		public void shutdown() throws InterruptedException {
			channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		}
                
                public Long[] run(){
                    //criar vetor tempos de execucao
                    Long[] tempos = new Long[11];
                    
                    //criar requests
                    VoidMsg voidReq = VoidMsg.newBuilder().build();
                    IntMsg intReq = IntMsg.newBuilder().setMessage(123).build();
                    StringMsg stringReq = StringMsg.newBuilder().setMessage("oi").build();

                    //criar responses
                    VoidMsg voidResp;
                    IntMsg intResp;
                    StringMsg stringResp;
                    
                    //timestamps
                    long start;
                    long end;

                    //envia void recebe void
                    try {
                        start = System.currentTimeMillis();
                        voidResp = blockingStub.voidVoid(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei void recebi void");
                    tempos[0] = (end - start);

                    //envia int recebe int
                    try{
                        start = System.currentTimeMillis();
                        intResp = blockingStub.intInt(intReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei int (" + intReq.getMessage() + ") recebi int (" + intResp.getMessage() + ")");
                    tempos[1] = (end - start);

                    //envia string recebe string
                    try{
                        start = System.currentTimeMillis();
                        stringResp = blockingStub.stringString(stringReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei string (" + stringReq.getMessage() + ") recebi string(" + stringResp.getMessage() + ")");
                    tempos[2] = (end - start);

                    //envia int recebe void
                    try{
                        start = System.currentTimeMillis();
                        voidResp = blockingStub.intVoid(intReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei int (" + intReq.getMessage() + ") recebi void");
                    tempos[3] = (end - start);
                    
                    //envia string recebe void
                    try{
                        start = System.currentTimeMillis();
                        voidResp = blockingStub.stringVoid(stringReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei string (" + stringReq.getMessage() + ") recebi void");
                    tempos[4] = (end - start);
                    
                    //envia void recebe int
                    try{
                        start = System.currentTimeMillis();
                        intResp = blockingStub.voidInt(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei void recebi int (" + intResp.getMessage() + ")");
                    tempos[5] = (end - start);
                    
                    //envia void recebe string
                    try{
                        start = System.currentTimeMillis();
                        stringResp = blockingStub.voidString(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei void recebi string (" + stringResp.getMessage() + ")");
                    tempos[6] = (end - start);
                    
                    //envia void recebe big string
                    try{
                        start = System.currentTimeMillis();
                        stringResp = blockingStub.voidBigString(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei void recebi big string (1KB)");
                    tempos[7] = (end - start);
                    
                    //envia void recebe super string
                    try{
                        start = System.currentTimeMillis();
                        stringResp = blockingStub.voidSuperString(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei void recebi super string (100KB)");
                    tempos[8] = (end - start);
                    
                    //envia big string recebe void
                    stringReq = StringMsg.newBuilder().setMessage(bigString()).build();
                    try{
                        start = System.currentTimeMillis();
                        voidResp = blockingStub.stringVoid(stringReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei big string (1KB) recebi void");
                    tempos[9] = (end - start);
                    
                    //envia super string recebe void
                    stringReq = StringMsg.newBuilder().setMessage(superString()).build();
                    try{
                        start = System.currentTimeMillis();
                        voidResp = blockingStub.stringVoid(stringReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return null;
                    }
                    logger.info("enviei super string (100KB) recebi void");
                    tempos[10] = (end - start);
                    
                    return tempos;
                }

		/** Say hello to server. */
		public void greet(String name) {
                    logger.info("Will try to greet " + name + " ...");
                    HelloRequest request = HelloRequest.newBuilder().setName(name).build();
                    HelloReply response;
                    try {
                            response = blockingStub.sayHello(request);
                    } catch (StatusRuntimeException e) {
                            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                            return;
                    }
                    logger.info("Greeting: " + response.getMessage());
                    try {
                            response = blockingStub.sayHelloAgain(request);
                    } catch (StatusRuntimeException e) {
                            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                            return;
                    }
                    logger.info("Greeting: " + response.getMessage());                  
		}

		/**
		 * Greet server. If provided, the first element of {@code args} is the name to
		 * use in the greeting.
		 */
		public static void main(String[] args) throws Exception {
			HelloWorldClient client = new HelloWorldClient("localhost", 50051);
			try {
				/* Access a service running on the local machine on port 50051 */
				//String user = "world";
				//if (args.length > 0) {
				//	user = args[0]; /* Use the arg as the name to greet if provided */
				//}
				//client.greet(user);
                            Long[][] tempos = new Long[12][12];
                            
                            //executa uma vez a mais porque o primeiro tempo vem zuado
                            for (int i = 0; i < 11; i++) {
                                tempos[i] = client.run();
                            }
                            String stringSaida = "";
                            
                            int media = 0;
                            
                            for (int j = 0; j < 11; j++) {
                                switch(j){
                                    case (0):stringSaida += "void void \n";break; 
                                    case (1):stringSaida += "int int \n";break;
                                    case (2):stringSaida += "string string \n";break;
                                    case (3):stringSaida += "int void \n";break;
                                    case (4):stringSaida += "string void \n";break;
                                    case (5):stringSaida += "void int \n";break;
                                    case (6):stringSaida += "void string \n";break;
                                    case (7):stringSaida += "void / big string \n";break;
                                    case (8):stringSaida += "void / super string \n";break;
                                    case (9):stringSaida += "big string / void \n";break;
                                    case (10):stringSaida += "super string / void \n";break;
                                }
                                //olha so a partir da segunda execucao
                                for (int i = 1; i < 11; i++) {                                
                                    media += tempos[i][j];
                                    stringSaida += tempos[i][j] + " ";
                                } 
                                stringSaida += "media " + media/10 + "\n";
                                media = 0;
                            }
                            logger.info(stringSaida);
			} finally {   
                            client.shutdown();
			}
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