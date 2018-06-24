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
			System.out.println("Exception Occurred");
		} catch (InterruptedException e) {
			System.out.println("Exception Occurred");
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

}
