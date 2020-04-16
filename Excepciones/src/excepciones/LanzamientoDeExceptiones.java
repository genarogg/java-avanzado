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
    
    public static void noLanzaException(){
        try {
            System.err.println("Metodo noLanzaException");
        }
        catch (Exception e) {
            System.err.println("se ejecuto Finally en noLanzaException");
        }
        finally{
            System.out.println("se ejecuto el bloque finally en noLanzaException");
        }
        
        System.out.println("Fin del metodo noLanzaException");
    }
}
