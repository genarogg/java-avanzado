package excepciones;

/**
 *
 * @author Genarogg
 */
public class LanzamientoDeExceptiones {
    public static void main(String [] args){
        try {
            lanzaException();
        }
        catch (Exception e) {
            System.err.println("La excepcion se manejo en el main");
        }
        
        noLanzaException();
    }
    
   
  
}
