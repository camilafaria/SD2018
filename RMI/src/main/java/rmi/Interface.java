package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import teste.Localizacao;

public interface Interface extends Remote {

	public void voidVoid() throws RemoteException;

	public int intInt(int req) throws RemoteException;
	
	public long longLong(long req) throws RemoteException;

	public String stringString(String req, int tamanho) throws RemoteException;	

	public void intVoid(int req) throws RemoteException;

	public void stringVoid(String req) throws RemoteException;
	
	public void longVoid(long req) throws RemoteException;

	public int voidInt() throws RemoteException;
	
	public String voidString() throws RemoteException;
	
	public long voidLong() throws RemoteException;

	public String voidBigString() throws RemoteException;

	public String voidSuperString() throws RemoteException;
	
	public long longDoisArg (long req1, long req2) throws RemoteException;
	
	public long longQuatroArg (long req1, long req2, long req3, long req4) throws RemoteException;
	
	public long longOitoArg (long req1, long req2, long req3, long req4, long req5, long req6, long req7, long req8) throws RemoteException;
	
	public String longStringDoisArg(long req1, String req2) throws RemoteException;
	
	public String longStringQuatroArg(long req1, long req2, String req3, String req4) throws RemoteException;
	
	public Localizacao createLocalizacao(int lat, int longi, String msg) throws RemoteException;
}