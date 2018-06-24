package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Logger;

public class HelloWorldClient {
	
	private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());
	
	public static void main(String[] args) throws Exception {
		try {
			HelloWorldClient client = new HelloWorldClient();
			String user = "world"; 
			client.greet(user);			
		} finally {
			//
		}
	}
	
	public void greet(String name) {
		logger.info("Will try to greet " + name + " ...");
		String response = "";
		try {
			Registry registry = LocateRegistry.getRegistry();
			Interface server = (Interface) registry.lookup("Interface");			
			response = server.sayHello(name);
		} catch (RemoteException e) {
			System.out.println("Exception Occurred");
		} catch (NotBoundException e) {
			System.out.println("Exception Occurred");
		}
		logger.info("Greeting: " + response);		
	}
	
	
}
