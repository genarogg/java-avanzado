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
    
    
    
  
    
}
