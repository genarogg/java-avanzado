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
    
    @Override
    public void run() {
        try {
            System.out.printf("%s se fue a dormir %d milisegundos%n%n", this.NOMBRETAREA, SLEEPTIME);
            Thread.sleep(SLEEPTIME);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
    
}
