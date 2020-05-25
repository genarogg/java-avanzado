public class Producer {
    
}package BlockingQueue;

import java.security.SecureRandom;

/**
 *
 * @author Genarogg
 */
public class Producer implements Runnable{
    
    private static final SecureRandom generador = new SecureRandom();
    private final Buffer SHAREDlOCATION;

    public Producer(Buffer SHAREDlOCATION) {
        this.SHAREDlOCATION = SHAREDlOCATION;
    }

   
    
    //almacina valores del 1 al 10 en el buffer sharedLocation
    @Override
    public void run() {
        int sum = 0;
        
        for(int count = 1; count <= 10; count++){
            try {
                Thread.sleep(generador.nextInt(3000));
                SHAREDlOCATION.blockingPut(count);
                sum += count;
                System.out.printf("\t%2d%n", sum);
                
            }
            catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("el productor realizo la produccion %n Terminando Productor%n ");
        
    }
    
}
