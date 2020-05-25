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

   
    
   
    
}
