package grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import gRPC.proto.*;

public class HelloWorldClient {
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

	public Long[] run() {
		// criar vetor tempos de execucao
		Long[] tempos = new Long[30];

		// criar requests
		VoidMsg voidReq = VoidMsg.newBuilder().build();
		IntMsg intReq;
		StringMsg stringReq;
		LongMsg longReq;
		StringMsgSize strSize;
		Long2x long2x;
		Long4x long4x;
		Long8x long8x;
		LongString longString;
		LongStringx2 longStringx2;
		LocMsg msgLocalizacao;		

		// criar responses
		VoidMsg respVoid;
		IntMsg respInt;
		StringMsg respString;
		LongMsg respLong;
		Localizacao local;

		// timestamps
		long start;
		long end;

		try {
			
			/* ----------------------------------------------------- */
			/* Teste com metodos que recebem e retornam o mesmo tipo */
			/* ----------------------------------------------------- */

			// envia void recebe void
			start = System.currentTimeMillis();
			respVoid = blockingStub.voidVoid(voidReq);
			end = System.currentTimeMillis();
			logger.info("enviei void recebi void");
			tempos[0] = (end - start);
		
			// envia int recebe int
			intReq = IntMsg.newBuilder().setValue(12345).build();
			start = System.currentTimeMillis();
			respInt = blockingStub.intInt(intReq);
			end = System.currentTimeMillis();
			logger.info("enviei int (" + intReq.getValue() + ") recebi int (" + respInt.getValue() + ")");
			tempos[1] = (end - start);
			
			// envia long recebe long
			longReq = LongMsg.newBuilder().setValue(91234567891L).build();
			start = System.currentTimeMillis();
			respLong = blockingStub.longLong(longReq);
			end = System.currentTimeMillis();
			logger.info("enviei long (" + longReq.getValue() + ") recebi long (" + respLong.getValue() + ")");
			tempos[2] = (end - start);
		
			// envia string recebe string
			int[] tamanhos = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
			for (int i = 0; i < tamanhos.length; i++) {
				strSize = StringMsgSize.newBuilder().setMessage("Ola").setSize(tamanhos[i]).build();
				start = System.currentTimeMillis();
				respString = blockingStub.stringString(strSize);
				end = System.currentTimeMillis();
				logger.info("enviei string Ola e recebi uma string " + respString);
				tempos[3 + i] = (end - start);
			}
	
			/* ----------------------------------------------------- */
			/* Teste com metodos que recebem um tipo e retornam void */
			/* ----------------------------------------------------- */

			// envia int recebe void
			intReq = IntMsg.newBuilder().setValue(12345).build();
			start = System.currentTimeMillis();
			respVoid = blockingStub.intVoid(intReq);
			end = System.currentTimeMillis();
			logger.info("enviei int (" + intReq.getValue() + ") recebi void");
			tempos[14] = (end - start);
		
			// envia string recebe void		
			stringReq = StringMsg.newBuilder().setMessage("Hello World!").build();
			start = System.currentTimeMillis();
			respVoid = blockingStub.stringVoid(stringReq);
			end = System.currentTimeMillis();
			logger.info("enviei string (" + stringReq.getMessage() + ") recebi void");
			tempos[15] = (end - start);
		
			// envia long recebe void		
			longReq = LongMsg.newBuilder().setValue(91234567891L).build();
			start = System.currentTimeMillis();
			respVoid = blockingStub.longVoid(longReq);
			end = System.currentTimeMillis();
			logger.info("enviei long (" + longReq.getValue() + ") recebi void");
			tempos[16] = (end - start);
		
			// envia big string recebe void		
			stringReq = StringMsg.newBuilder().setMessage(bigString()).build();
			start = System.currentTimeMillis();
			respVoid = blockingStub.stringVoid(stringReq);
			end = System.currentTimeMillis();
			logger.info("enviei big string (1KB) recebi void");
			tempos[17] = (end - start);
		
			// envia super string recebe void
			stringReq = StringMsg.newBuilder().setMessage(superString()).build();
			start = System.currentTimeMillis();
			respVoid = blockingStub.stringVoid(stringReq);
			end = System.currentTimeMillis();
			logger.info("enviei super string (100KB) recebi void");
			tempos[18] = (end - start);
				
			/* ----------------------------------------------------- */
			/* Teste com metodos que recebem void e retornam um tipo */
			/* ----------------------------------------------------- */
			
			// envia void recebe int		
			start = System.currentTimeMillis();
			respInt = blockingStub.voidInt(voidReq);
			end = System.currentTimeMillis();
			logger.info("enviei void recebi int (" + respInt.getValue() + ")");
			tempos[19] = (end - start);

			// envia void recebe string		
			start = System.currentTimeMillis();
			respString = blockingStub.voidString(voidReq);
			end = System.currentTimeMillis();
			logger.info("enviei void recebi string (" + respString.getMessage() + ")");
			tempos[20] = (end - start);
			
			// envia void recebe long		
			start = System.currentTimeMillis();
			respLong = blockingStub.voidLong(voidReq);
			end = System.currentTimeMillis();
			logger.info("enviei void recebi long (" + respLong.getValue() + ")");
			tempos[21] = (end - start);

			// envia void recebe big string			
			start = System.currentTimeMillis();
			respString = blockingStub.voidBigString(voidReq);
			end = System.currentTimeMillis();
			logger.info("enviei void recebi big string (1KB)");
			tempos[22] = (end - start);

			// envia void recebe super string		
			start = System.currentTimeMillis();
			respString = blockingStub.voidSuperString(voidReq);
			end = System.currentTimeMillis();
			logger.info("enviei void recebi super string (100KB)");
			tempos[23] = (end - start);
			
			/* --------------------------------------------------------------------- */
			/* Teste com metodos que recebem mais de um argumento e retornam um tipo */
			/* --------------------------------------------------------------------- */
			
			// envia dois longs recebe long
			long2x = Long2x.newBuilder().setValue1(91234567891L).setValue2(91234567891L).build();
			start = System.currentTimeMillis();
			respLong = blockingStub.longDoisArg(long2x);
			end = System.currentTimeMillis();
			logger.info("enviei dois longs (91234567891, 91234567891) recebi" + respLong);
			tempos[24] = (end - start);

			// envia quatro longs recebe long
			long4x = Long4x.newBuilder().setValue1(91234567891291L).setValue2(9123456719021L)
					.setValue3(912345678911112L).setValue4(91234567891221L).build();			
			start = System.currentTimeMillis();
			respLong = blockingStub.longQuatroArg(long4x);
			end = System.currentTimeMillis();
			logger.info("enviei quatro longs (91234567891291, 9123456719021, 912345678911112, 91234567891221) recebi"
					+ respLong);
			tempos[25] = (end - start);
			
			// envia oito longs recebe long
			long8x = Long8x.newBuilder().setValue1(91234567891291L).setValue2(91234567891291L)
					.setValue3(91234567891221L).setValue4(91234567891221L)
					.setValue5(9123456789456L).setValue6(912345678995019L)
					.setValue7(91234567891211L).setValue8(912345678912L).build();			
			start = System.currentTimeMillis();
			respLong = blockingStub.longOitoArg(long8x);
			end = System.currentTimeMillis();
			logger.info("enviei oito longs (91234567891291L,91234567891291L, 91234567891221L, 91234567891221L, 9123456789456L, 912345678995019L, 91234567891211L, 912345678912L) recebi"
							+ respLong);
			tempos[26] = (end - start);
			
			
			// envia um long e uma string, e recebe string
			longString = LongString.newBuilder().setValue(91234567891291L).setMessage("Hello World!").build();
			start = System.currentTimeMillis();
			respString = blockingStub.longStringDoisArg(longString);
			end = System.currentTimeMillis();
			logger.info("enviei dois argumentos (91234567891291, Hello World!) recebi" + respString);
			tempos[27] = (end - start);
			
			// envia dois long e duas string, e recebe string
			longStringx2 = LongStringx2.newBuilder().setValue1(91234567891291L).setValue2(91234567891291L)
					.setMessage1("Hello World!").setMessage2("My name is Siri!").build();
			start = System.currentTimeMillis();
			respString = blockingStub.longStringQuatroArg(longStringx2);
			end = System.currentTimeMillis();
			logger.info(
					"enviei quatro argumentos (91234567891291L, 91234567891291L, Hello World!, My name is Siri) recebi"
							+ respString);
			tempos[28] = (end - start);
			
			/* ----------------------------------------------- */
			/* Metodos que recebem e retornam um tipo complexo */
			/* ----------------------------------------------- */
			
			// envia coordenadas e recebe localização
			msgLocalizacao = LocMsg.newBuilder().setLat(1234).setLongi(4567).setMsg("Casa").build();
			start = System.currentTimeMillis();
			local = blockingStub.createLocalizacao(msgLocalizacao);
			end = System.currentTimeMillis();
			logger.info("enviei double, double e string recebi uma Localizacao");
			tempos[29] = (end - start);
		
		} catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }
			
		return tempos;
	}

	public static void main(String[] args) throws Exception {
		//HelloWorldClient client = new HelloWorldClient("192.168.1.102", 50051);
		HelloWorldClient client = new HelloWorldClient("localhost", 50051);
		try {
			Long[][] tempos = new Long[11][30];
			String stringSaida = "";
			double media = 0;

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