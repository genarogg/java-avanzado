package concurrencia;

import java.security.SecureRandom;

/**
 *
 * @author Genarogg
 */
public class ImpresorDeTareas implements  Runnable{
    
    private static final SecureRandom generador = new SecureRandom();
    private final int SLEEPTIME;
    private final String NOMBRETAREA;

    public ImpresorDeTareas(String NOMBRETAREA) {
        this.NOMBRETAREA = NOMBRETAREA;
        
        SLEEPTIME = generador.nextInt(5000);
    }
    
   
    
}
