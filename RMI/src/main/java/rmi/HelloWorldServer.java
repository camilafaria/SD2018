package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Logger;

public class HelloWorldServer implements Interface {
	
	private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());
	private static final Object lock = new Object();
	
	public static void main (String[] args) {
		
		try {			
			HelloWorldServer server = new HelloWorldServer();
			int port = 50051;
			server.createStubAndBind();
			logger.info("Server started, listening on " + port);
			blockUntilShutdown(server);
		} catch (RemoteException e) {
			System.out.println("Exception Occurred" + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("Exception Occurred" + e.getMessage());
		}
		
	}
	
	public void createStubAndBind() throws RemoteException {
		
		Interface stub = (Interface) UnicastRemoteObject.exportObject((Interface) this, 50051);
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind("Interface", stub);
	}
	
	private static void blockUntilShutdown(HelloWorldServer server) throws InterruptedException {
		
		if (server != null) {
			synchronized (lock) {			      
				lock.wait();
			}
		}		
	}
	
	public String sayHello (String hellorequest) {	
		
		String helloreply = "Hello " + hellorequest;
		return helloreply;	
	}
        
        //recebe void retorna void
        public void voidVoid() {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
        }
        
        //recebe int retorna int
        public int intInt(int req) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            
            return req*c; //retorna o dobro da entrada
        }
        
        //recebe string retorna string
        public String stringString(String req) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            
            return c + req;
        }
                
        //recebe int retorna void
        public void intVoid(int req) {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b + req;
        }
        
        //recebe string retorna void
        public void stringVoid(String req) {
            int a = 1 + 1;
            int b = 1 * 1;
            String c = a/b + req;            
        }
        
        //recebe void retorna int
        public int voidInt() {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            return c; //retorna 2
        }
        
        //recebe void retorna string
        public String voidString() {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            
            return "funcionou " + c;
        }
        //recebe void retorna big string
        public String voidBigString() {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            
            return bigString() + c;
        }
        //recebe void retorna super string
        public String voidSuperString() {
            int a = 1 + 1;
            int b = 1 * 1;
            int c = a/b;
            
            return superString() + c;
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
