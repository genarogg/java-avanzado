
package ClasesGenericas;

/**
 *
 * @author Genarogg
 */
public class EmptyStackException extends RuntimeException {
    
    public EmptyStackException(){
        this("La pila esta vacia");
    }
    
    public EmptyStackException(String mensajeError){
        super(mensajeError);
    }
}
