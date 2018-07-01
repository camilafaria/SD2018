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
                //String user = "world"; 
                //client.greet(user);			


                Long[][] tempos = new Long[11][11];
                String stringSaida = "";
                int media = 0;

                //executa uma vez a mais porque o primeiro tempo vem zuado
                for (int i = 0; i < 11; i++) {
                    tempos[i] = client.run();
                }
                              
                for (int j = 0; j < 11; j++) {
                    switch(j){
                        case (0):stringSaida += "void void \n";break; 
                        case (1):stringSaida += "int int \n";break;
                        case (2):stringSaida += "string string \n";break;
                        case (3):stringSaida += "int void \n";break;
                        case (4):stringSaida += "string void \n";break;
                        case (5):stringSaida += "void int \n";break;
                        case (6):stringSaida += "void string \n";break;
                        case (7):stringSaida += "void / big string \n";break;
                        case (8):stringSaida += "void / super string \n";break;
                        case (9):stringSaida += "big string / void \n";break;
                        case (10):stringSaida += "super string / void \n";break;
                    }
                    //olha so a partir da segunda execucao
                    for (int i = 1; i < 11; i++) {                                
                        media += tempos[i][j];
                        stringSaida += tempos[i][j] + " ";
                    } 
                    stringSaida += "media " + media/10 + "\n";
                    media = 0;
                }
                logger.info(stringSaida);

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
	
        public Long[] run()
        {
            //criar vetor tempos de execucao
            Long[] tempos = new Long[11];
            
            //timestamps
            long start;
            long end;
            
            int respInt;
            String respString;
            
            try {
                Registry registry = LocateRegistry.getRegistry();
                Interface server = (Interface) registry.lookup("Interface");			
                //response = server.sayHello(name);
            
                //envia void recebe void
                start = System.currentTimeMillis();                        
                server.voidVoid();
                end = System.currentTimeMillis();
                logger.info("enviei void recebi void");
                tempos[0] = (end - start);
                
                //envia int recebe int
                start = System.currentTimeMillis();                        
                respInt = server.intInt(123);
                end = System.currentTimeMillis();
                logger.info("enviei int (123) recebi int " + respInt + ")");
                tempos[1] = (end - start);
                
                //envia string recebe string
                start = System.currentTimeMillis();                        
                respString = server.stringString("oi");
                end = System.currentTimeMillis();
                logger.info("enviei string (oi) recebi string " + respString + ")");
                tempos[2] = (end - start);
                
                //envia int recebe void
                start = System.currentTimeMillis();                        
                server.intVoid(123);
                end = System.currentTimeMillis();
                logger.info("enviei int (123) recebi void");
                tempos[3] = (end - start);
                
                //envia string recebe void
                start = System.currentTimeMillis();                        
                server.stringVoid("oi");
                end = System.currentTimeMillis();
                logger.info("enviei string (oi) recebi void");
                tempos[4] = (end - start);
                
                //envia void recebe int
                start = System.currentTimeMillis();                        
                respInt = server.voidInt();
                end = System.currentTimeMillis();
                logger.info("enviei void recebi int (" + respInt + ")");
                tempos[5] = (end - start);
                
                //envia void recebe string
                start = System.currentTimeMillis();                        
                respString = server.voidString();
                end = System.currentTimeMillis();
                logger.info("enviei void recebi string (" + respString + ")");
                tempos[6] = (end - start);
                
                //envia void recebe big string
                start = System.currentTimeMillis();                        
                respString = server.voidBigString();
                end = System.currentTimeMillis();
                logger.info("enviei void recebi big string (1KB)");
                tempos[7] = (end - start);
                
                //envia void recebe super string
                start = System.currentTimeMillis();                        
                respString = server.voidSuperString();
                end = System.currentTimeMillis();
                logger.info("enviei void recebi super string (100KB)");
                tempos[8] = (end - start);
                
                //envia big string recebe void
                String bigString = bigString();
                start = System.currentTimeMillis();                        
                server.stringVoid(bigString);
                end = System.currentTimeMillis();
                logger.info("enviei big string (1KB) recebi void");
                tempos[9] = (end - start);
                
                //envia super string recebe void
                String superString = superString();
                start = System.currentTimeMillis();                        
                server.stringVoid(superString);
                end = System.currentTimeMillis();
                logger.info("enviei super string (100KB) recebi void");
                tempos[10] = (end - start);
                
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
