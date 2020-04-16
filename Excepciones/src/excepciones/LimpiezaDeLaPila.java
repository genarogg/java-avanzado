package excepciones;

/**
 *
 * @author Genarogg
 */
public class LimpiezaDeLaPila {
    public static void metodo1()throws Exception{
        metodo2();
    }
    
    public static void metodo2()throws Exception{
        metodo3();
    }
    
    public static void metodo3()throws Exception{
        throw new Exception("La exception se lanzo en el metodo 3");
    }
    
    public static void main(String[] args) {
        try {
            metodo1();
        }
        catch (Exception e) {
            System.err.printf("%s%n%n", e.getMessage());
            
            e.printStackTrace();
            
            StackTraceElement[] elemntosRastreo = e.getStackTrace();
            
            //se obtiene la informacion de rastreo de la pila
            System.out.println("\nRastreo de la pila de getStackTrace:\n");
            System.out.println("Clase \t\tArchivo\t\tLinea\tMetodo");
            
            
         
        }
        
    }
}
