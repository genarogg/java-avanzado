package excepciones;

/**
 *
 * @author Genarogg
 */
public class DemoDeLimpiezaDePila {
    
    public void metodo1(){
        try {
            metodo5();
        }
        catch (Exception e) {
            System.out.println("Fin de la pila de Exception");
            System.err.println(e.getMessage() +": la excepcion se trato en el metodo 1");
        }
    }
    
    public void metodo2() throws Exception{
        try {
            throw new Exception("Excepcion generada en el metodo 2");
        }
        catch (Exception e) {
            System.err.println("la excepcion se trato en el metodo 2");
            throw e;
        }
    }
    
    public void metodo3() throws Exception{
        metodo2();
    }
    
    public void metodo4() throws Exception{
        metodo3();
    }
    
    public void metodo5() throws Exception{
        metodo4();
    }
    
    public static void main(String[] args) {
        new DemoDeLimpiezaDePila().metodo1();
    }
            
}
