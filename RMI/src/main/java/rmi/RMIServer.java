package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Logger;

import teste.Localizacao;


public class RMIServer implements Interface {

	private static final Logger logger = Logger.getLogger(RMIServer.class.getName());
	private static final Object lock = new Object();

	public static void main(String[] args) {

		try {
			RMIServer server = new RMIServer();			
			String host = (args.length < 1) ? "localhost" : args[0];
			int port = 50051;
			
			server.createStubAndBind(host, port);
			logger.info("Server started, listening on " + port);
			blockUntilShutdown(server);
		} catch (RemoteException e) {
			System.out.println("Exception Occurred" + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("Exception Occurred" + e.getMessage());
		}

	}

	/* Criacao do stub */
	public void createStubAndBind(String host, int port) throws RemoteException {
		Interface stub = (Interface) UnicastRemoteObject.exportObject((Interface) this, 0);
		Registry registry = LocateRegistry.createRegistry(port);	
		registry.rebind("Interface", stub);
	}

	/* Mantem servidor esperando a proxima tarefa */
	private static void blockUntilShutdown(RMIServer server) throws InterruptedException {
		if (server != null) {
			synchronized (lock) {
				lock.wait();
			}
		}
	}
	
	/* ------------------------------------------- */
	/* Metodos que recebem e retornam o mesmo tipo */
	/* ------------------------------------------- */

	// recebe void retorna void
	public void voidVoid() throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b;
	}

	// recebe int retorna int
	public int intInt(int req) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b;

		return req * c; // retorna o dobro da entrada
	}

	// recebe long retorna long
	public long longLong(long req) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b;

		return req * c; // retorna o dobro da entrada
	}

	// recebe string retorna string (de diferentes tamanhos)	
	public String stringString(String str, int tamanho) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b;
		
		String result = "";
		for (int i = 0; i < tamanho; i++) {
			result += "a";
		}
		
		return c + result;
	}

	/* ------------------------------------------- */
	/* Metodos que recebem um tipo e retornam void */
	/* ------------------------------------------- */

	// recebe int retorna void
	public void intVoid(int req) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b + req;
	}

	// recebe string retorna void
	public void stringVoid(String req) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		String c = a / b + req;
	}

	// recebe long retorna void
	public void longVoid(long req) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		long c = a / b + req;
	}

	/* ------------------------------------------- */
	/* Metodos que recebem void e retornam um tipo */
	/* ------------------------------------------- */

	// recebe void retorna int
	public int voidInt() throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b;
		return c; //
	}

	// recebe void retorna string
	public String voidString() throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b;

		return "funcionou " + c;
	}

	// recebe void retorna long
	public long voidLong() throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		long c = a / b;

		return c + 91234567891012L; // soma c a um valor numerico grande, maior que int
	}

	// recebe void retorna big string
	public String voidBigString() throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b;

		return bigString() + c;
	}

	// recebe void retorna super string
	public String voidSuperString() throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		int c = a / b;

		return superString() + c;
	}

	// metodo auxiliar para criacao de bigstring
	private String bigString() throws RemoteException {
		String str = "";
		for (int i = 0; i < 1024; i++) {
			str += "a";
		}
		return str;
	}

	// metodo auxiliar para criacao de superstring
	private String superString() throws RemoteException {
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
	public long longDoisArg(long req1, long req2) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		long c = a / b;

		return c + req1 + req2;
	}

	// recebe quatro argumentos long e retorna um
	public long longQuatroArg(long req1, long req2, long req3, long req4) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		long c = a / b;

		return c + (req1 / req2) + (req3 / req4);
	}

	// recebe oito argumentos long e retorna um
	public long longOitoArg(long req1, long req2, long req3, long req4, long req5, long req6, long req7, long req8) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		long c = a / b;

		return (req1 - req2 + req3 - req4) / (req5 - req6 + req7 - req8) + c;
	}

	// recebe dois argumentos (long, String) e retorna uma String
	public String longStringDoisArg(long req1, String req2) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		long c = a / b;

		return c + req1 + req2;
	}

	// recebe quatro argumentos (long, long, String, String) e retorna uma String
	public String longStringQuatroArg(long req1, long req2, String req3, String req4) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		long c = a / b;

		return c + req1 + req2 + req3 + req4;
	}

	/* ----------------------------------------------- */
	/* Metodos que recebem e retornam um tipo complexo */
	/* ----------------------------------------------- */

	// recebe três argumentos e cria um objeto Localizacao
	public Localizacao createLocalizacao(int lat, int longi, String msg) throws RemoteException {
		int a = 1 + 1;
		int b = 1 * 1;
		long c = a / b;
		
		Localizacao local = new Localizacao(lat, longi, msg+c);
		return local;
	}

}
