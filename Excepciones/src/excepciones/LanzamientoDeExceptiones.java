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
    
    public static void lanzaException()throws Exception{
        try{
            System.out.println("Metodo lanzaExcepcion");
            throw new Exception();
        }
        catch(Exception e){
            System.err.println("La exception se manejo en el metodo lanzaException");
            throw e;
        }
    }
  
}
