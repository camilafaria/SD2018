package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {

	public String sayHello(String hellorequest) throws RemoteException;
        public void voidVoid() throws RemoteException;
        public int intInt(int req) throws RemoteException;
        public String stringString(String req) throws RemoteException;
        public void intVoid(int req) throws RemoteException;
        public void stringVoid(String req) throws RemoteException;
        public int voidInt() throws RemoteException;
        public String voidString() throws RemoteException;
        public String voidBigString() throws RemoteException;
        public String voidSuperString() throws RemoteException;

	//public Message sendMessage(Message clientMessage) throws RemoteException;
}