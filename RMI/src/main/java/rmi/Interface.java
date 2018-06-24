package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {

	public String sayHello(String hellorequest) throws RemoteException;

	//public Message sendMessage(Message clientMessage) throws RemoteException;
}