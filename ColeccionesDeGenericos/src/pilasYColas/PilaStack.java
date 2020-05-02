package pilasYColas;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author Genarogg
 */
public class PilaStack {
    public static void main(String[] args) {
        Stack<Number> pila = new Stack<>();
        
        //usa el metodo push
        pila.push(12L);
        System.out.println("Se metio 12L");
        imprimirPila(pila);
        
        pila.push(34567);
        System.out.println("Se metio 34567");
        imprimirPila(pila);
        
        pila.push(1.0F);
        System.out.println("Se metio 1.0F");
        imprimirPila(pila);
        
        pila.push(1234.5678);
        System.out.println("Se metio 1234.5678");
        imprimirPila(pila);
        
        //Elimina los elementos de la pila
        try{
            Number objetoEliminado = null;
            
            //saca elementos de la pila
            while(true){
            objetoEliminado = pila.pop();
            System.out.printf("Se saco %s%n", objetoEliminado);
            imprimirPila(pila);
            }
        }
        catch(EmptyStackException e){
            e.printStackTrace();
        }
    }
    
}
