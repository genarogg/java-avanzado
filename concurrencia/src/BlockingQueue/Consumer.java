package BlockingQueue;

import java.security.SecureRandom;

/**
 *
 * @author Genarogg
 */
public class Consumer implements Runnable {
    private static final SecureRandom generador = new SecureRandom();
    private final Buffer SHAREDLOCATION;

    public Consumer(Buffer SHAREDLOCATION) {
        this.SHAREDLOCATION = SHAREDLOCATION;
    }
    
    
    
    @Override
    public void run() {
        int sum = 0;
        
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(generador.nextInt(3000));
                sum += SHAREDLOCATION.blockingGet();
                System.out.printf("\t\t\t%2d%n", sum);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.printf("%n%s %d%n%s%n", "El consumer ha leido todos los valores", sum, "Consumer terminado");
    }
    
}
