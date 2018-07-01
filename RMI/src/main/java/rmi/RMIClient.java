package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Logger;

import teste.Localizacao;

public class RMIClient {

	private static final Logger logger = Logger.getLogger(RMIClient.class.getName());

	public static void main(String[] args) throws Exception {
		try {
			RMIClient client = new RMIClient();

			Long[][] tempos = new Long[11][30];
			String stringSaida = "";
			double media = 0.0;

			// invoca 10x os metodos a serem executados remotamente
			for (int i = 0; i < tempos.length; i++) {
				tempos[i] = client.run();
			}

			// estabelece a ordem das execucoes
			for (int j = 0; j < 30; j++) {
				switch (j) {
				case (0):
					stringSaida += "void void \n";
					break;
				case (1):
					stringSaida += "int int \n";
					break;
				case (2):
					stringSaida += "long long \n";
					break;
				case (3):
					stringSaida += "string string1 \n";
					break;
				case (4):
					stringSaida += "string string2 \n";
					break;
				case (5):
					stringSaida += "string string4 \n";
					break;
				case (6):
					stringSaida += "string string8 \n";
					break;
				case (7):
					stringSaida += "string string16 \n";
					break;
				case (8):
					stringSaida += "string string32 \n";
					break;
				case (9):
					stringSaida += "string string64 \n";
					break;
				case (10):
					stringSaida += "string string128 \n";
					break;
				case (11):
					stringSaida += "string string256 \n";
					break;
				case (12):
					stringSaida += "string string512 \n";
					break;
				case (13):
					stringSaida += "string stringpot1024 \n";
					break;
				case (14):
					stringSaida += "int void \n";
					break;
				case (15):
					stringSaida += "string void \n";
					break;
				case (16):
					stringSaida += "long void \n";
					break;
				case (17):
					stringSaida += "big string / void \n";
					break;
				case (18):
					stringSaida += "super string / void \n";
					break;	
				case (19):
					stringSaida += "void int \n";
					break;
				case (20):
					stringSaida += "void string \n";
					break;
				case (21):
					stringSaida += "void long \n";
					break;
				case (22):
					stringSaida += "void / big string \n";
					break;
				case (23):
					stringSaida += "void / super string \n";
					break;
				case (24):
					stringSaida += "2xlong long \n";
					break;
				case (25):
					stringSaida += "4xlong long \n";
					break;
				case (26):
					stringSaida += "8xlong long \n";
					break;
				case (27):
					stringSaida += "long,string string \n";
					break;
				case (28):
					stringSaida += "long,long,string,string string \n";
					break;
				case (29):
					stringSaida += "double,double,string localizacao \n";
					break;
				}

				// olha so a partir da segunda execucao
				for (int i = 1; i < 11; i++) {
					media += tempos[i][j];
					stringSaida += tempos[i][j] + "|";
				}
				stringSaida += "media " + media / 10 + "\n";
				media = 0;
			}
			logger.info(stringSaida);

		} finally {
			//
		}
	}

	/* Invoca os metodos a serem executados remotamente pelo servidor */
	public Long[] run() {
		// cria vetor tempos de execucao
		Long[] tempos = new Long[30];

		// timestamps
		long start;
		long end;

		// respostas recebidas
		int respInt;
		String respString;
		long respLong;
		Localizacao local = null;

		try {
			// cria stub
			//Registry registry = LocateRegistry.getRegistry("192.168.1.111",1099);
			Registry registry = LocateRegistry.getRegistry();
			Interface stub = (Interface) registry.lookup("Interface");

			/* ----------------------------------------------------- */
			/* Teste com metodos que recebem e retornam o mesmo tipo */
			/* ----------------------------------------------------- */

			// envia void recebe void
			start = System.currentTimeMillis();
			stub.voidVoid();
			end = System.currentTimeMillis();
			logger.info("enviei void recebi void");
			tempos[0] = (end - start);

			// envia int recebe int
			start = System.currentTimeMillis();
			respInt = stub.intInt(12345);
			end = System.currentTimeMillis();
			logger.info("enviei int (12345) recebi int " + respInt + ")");
			tempos[1] = (end - start);

			// envia long recebe long
			start = System.currentTimeMillis();
			respLong = stub.longLong(91234567891L);
			end = System.currentTimeMillis();
			logger.info("enviei long (91234567891) recebi long " + respLong + ")");
			tempos[2] = (end - start);

			// envia string recebe string potencializada
			int[] tamanhos = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
			for (int i = 0; i < tamanhos.length; i++) {
				start = System.currentTimeMillis();
				respString = stub.stringString("Ola", tamanhos[i]);
				end = System.currentTimeMillis();
				logger.info("enviei string Ola e recebi uma string " + respString);
				tempos[3 + i] = (end - start);
			}

			/* ----------------------------------------------------- */
			/* Teste com metodos que recebem um tipo e retornam void */
			/* ----------------------------------------------------- */

			// envia int recebe void
			start = System.currentTimeMillis();
			stub.intVoid(123);
			end = System.currentTimeMillis();
			logger.info("enviei int (12345) recebi void");
			tempos[14] = (end - start);

			// envia string recebe void
			start = System.currentTimeMillis();
			stub.stringVoid("Hello World!");
			end = System.currentTimeMillis();
			logger.info("enviei string (Hello world!) recebi void");
			tempos[15] = (end - start);

			// envia long recebe void
			start = System.currentTimeMillis();
			stub.longVoid(91234567891L);
			end = System.currentTimeMillis();
			logger.info("enviei long (91234567891) recebi void");
			tempos[16] = (end - start);

			// envia big string recebe void
			String bigString = bigString();
			start = System.currentTimeMillis();
			stub.stringVoid(bigString);
			end = System.currentTimeMillis();
			logger.info("enviei big string (1KB) recebi void");
			tempos[17] = (end - start);

			// envia super string recebe void
			String superString = superString();
			start = System.currentTimeMillis();
			stub.stringVoid(superString);
			end = System.currentTimeMillis();
			logger.info("enviei super string (100KB) recebi void");
			tempos[18] = (end - start);

			/* ----------------------------------------------------- */
			/* Teste com metodos que recebem void e retornam um tipo */
			/* ----------------------------------------------------- */

			// envia void recebe int
			start = System.currentTimeMillis();
			respInt = stub.voidInt();
			end = System.currentTimeMillis();
			logger.info("enviei void recebi int (" + respInt + ")");
			tempos[19] = (end - start);

			// envia void recebe string
			start = System.currentTimeMillis();
			respString = stub.voidString();
			end = System.currentTimeMillis();
			logger.info("enviei void recebi string (" + respString + ")");
			tempos[20] = (end - start);

			// envia void recebe long
			start = System.currentTimeMillis();
			respLong = stub.voidLong();
			end = System.currentTimeMillis();
			logger.info("enviei void recebi long (" + respLong + ")");
			tempos[21] = (end - start);

			// envia void recebe big string
			start = System.currentTimeMillis();
			respString = stub.voidBigString();
			end = System.currentTimeMillis();
			logger.info("enviei void recebi big string (1KB)");
			tempos[22] = (end - start);

			// envia void recebe super string
			start = System.currentTimeMillis();
			respString = stub.voidSuperString();
			end = System.currentTimeMillis();
			logger.info("enviei void recebi super string (100KB)");
			tempos[23] = (end - start);

			/* --------------------------------------------------------------------- */
			/* Teste com metodos que recebem mais de um argumento e retornam um tipo */
			/* --------------------------------------------------------------------- */

			// envia dois longs recebe long
			start = System.currentTimeMillis();
			respLong = stub.longDoisArg(91234567891L, 91234567891L);
			end = System.currentTimeMillis();
			logger.info("enviei dois longs (91234567891, 91234567891) recebi" + respLong);
			tempos[24] = (end - start);

			// envia quatro longs recebe long
			start = System.currentTimeMillis();
			respLong = stub.longQuatroArg(91234567891291L, 9123456719021L, 912345678911112L, 91234567891221L);
			end = System.currentTimeMillis();
			logger.info("enviei quatro longs (91234567891291, 9123456719021, 912345678911112, 91234567891221) recebi"
					+ respLong);
			tempos[25] = (end - start);

			// envia oito longs recebe long
			start = System.currentTimeMillis();
			respLong = stub.longOitoArg(91234567891291L, 91234567891291L, 91234567891221L, 91234567891221L,
					9123456789456L, 912345678995019L, 91234567891211L, 912345678912L);
			end = System.currentTimeMillis();
			logger.info(
					"enviei oito longs (91234567891291L,91234567891291L, 91234567891221L, 91234567891221L, 9123456789456L, 912345678995019L, 91234567891211L, 912345678912L) recebi"
							+ respLong);
			tempos[26] = (end - start);

			// envia um long e uma string, e recebe string
			start = System.currentTimeMillis();
			respString = stub.longStringDoisArg(91234567891291L, "Hello World!");
			end = System.currentTimeMillis();
			logger.info("enviei dois argumentos (91234567891291, Hello World!) recebi" + respString);
			tempos[27] = (end - start);

			// envia dois long e duas string, e recebe string
			start = System.currentTimeMillis();
			respString = stub.longStringQuatroArg(91234567891291L, 91234567891291L, "Hello World!", "My name is Siri!");
			end = System.currentTimeMillis();
			logger.info(
					"enviei quatro argumentos (91234567891291L, 91234567891291L, Hello World!, My name is Siri) recebi"
							+ respString);
			tempos[28] = (end - start);

			/* ----------------------------------------------- */
			/* Metodos que recebem e retornam um tipo complexo */
			/* ----------------------------------------------- */

			// envia coordenadas e recebe localização
			start = System.currentTimeMillis();
			local = stub.createLocalizacao(1234, 4567, "Casa");
			end = System.currentTimeMillis();
			logger.info("enviei double, double e string recebi uma Localizacao");
			tempos[29] = (end - start);

		} catch (RemoteException e) {
			System.out.println("Exception Occurred");
		} catch (NotBoundException e) {
			System.out.println("Exception Occurred");
		}

		return tempos;
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