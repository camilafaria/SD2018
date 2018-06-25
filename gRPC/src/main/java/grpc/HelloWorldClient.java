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
                
                public void run(){
                    //criar requests
                    VoidMsg voidReq = VoidMsg.newBuilder().build();
                    IntMsg intReq = IntMsg.newBuilder().setMessage(123).build();
                    StringMsg stringReq = StringMsg.newBuilder().setMessage("stringReq").build();

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
                        return;
                    }
                    logger.info("enviei void recebi void");
                    logger.info("levou " + (end - start) + " milisegundos");

                    //envia int recebe int
                    try{
                        start = System.currentTimeMillis();
                        intResp = blockingStub.intInt(intReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei int (" + intReq.getMessage() + ") recebi int (" + intResp.getMessage() + ")");
                    logger.info("levou " + (end - start) + " milisegundos");

                    //envia string recebe string
                    try{
                        start = System.currentTimeMillis();
                        stringResp = blockingStub.stringString(stringReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei string (" + stringReq.getMessage() + ") recebi string(" + stringResp.getMessage() + ")");
                    logger.info("levou " + (end - start) + " milisegundos");

                    //envia int recebe void
                    try{
                        start = System.currentTimeMillis();
                        voidResp = blockingStub.intVoid(intReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei int (" + intReq.getMessage() + ") recebi void");
                    logger.info("levou " + (end - start) + " milisegundos");
                    
                    //envia string recebe void
                    try{
                        start = System.currentTimeMillis();
                        voidResp = blockingStub.stringVoid(stringReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei string (" + stringReq.getMessage() + ") recebi void");
                    logger.info("levou " + (end - start) + " milisegundos");
                    
                    //envia void recebe int
                    try{
                        start = System.currentTimeMillis();
                        intResp = blockingStub.voidInt(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei void recebi int (" + intResp.getMessage() + ")");
                    logger.info("levou " + (end - start) + " milisegundos");
                    
                    //envia void recebe string
                    try{
                        start = System.currentTimeMillis();
                        stringResp = blockingStub.voidString(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei void recebi string (" + stringResp.getMessage() + ")");
                    logger.info("levou " + (end - start) + " milisegundos");
                    
                    //envia void recebe big string
                    try{
                        start = System.currentTimeMillis();
                        stringResp = blockingStub.voidBigString(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei void recebi big string (1KB)");
                    logger.info("levou " + (end - start) + " milisegundos");
                    
                    //envia void recebe super string
                    try{
                        start = System.currentTimeMillis();
                        stringResp = blockingStub.voidSuperString(voidReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei void recebi super string (1MB)");
                    logger.info("levou " + (end - start) + " milisegundos");
                    
                    //envia big string recebe void
                    stringReq = StringMsg.newBuilder().setMessage(bigString()).build();
                    try{
                        start = System.currentTimeMillis();
                        voidResp = blockingStub.stringVoid(stringReq);
                        end = System.currentTimeMillis();
                    } catch (StatusRuntimeException e) {
                        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                        return;
                    }
                    logger.info("enviei big string (1KB) recebi void");
                    logger.info("levou " + (end - start) + " milisegundos");
                    
                     //envia super string recebe void
                    stringReq = StringMsg.newBuilder().setMessage(superString()).build();
                    //try{
                    //    start = System.currentTimeMillis();
                    //    voidResp = blockingStub.stringVoid(stringReq);
                    //    end = System.currentTimeMillis();
                    //} catch (StatusRuntimeException e) {
                    //    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                    //    return;
                    //}
                    //logger.info("enviei super string (1MB) recebi void");
                    //logger.info("levou " + (end - start) + " milisegundos");
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
                            
                            for (int i = 0; i < 10; i++) {
                                client.run();
                            }
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
                    for (int i = 0; i < 1048576; i++) {
                        str += "a";
                    }
                    return str;
                }
	}