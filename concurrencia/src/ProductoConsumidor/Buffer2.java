package ProductoConsumidor;

/**
 *
 * @author Genarogg
 */
public class Buffer2 {
    private char contenido;
    private boolean disponible = false;
    
    public synchronized char recoger(){
        while(disponible == false){
            try {
                wait();
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        disponible = false;
        notify();
        return contenido;
    }
    
    public synchronized void poner(char c){
        while(disponible){
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        contenido = c;
        disponible = true;
        notify();
    }
}
