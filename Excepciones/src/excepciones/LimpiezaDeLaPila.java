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
       
}
