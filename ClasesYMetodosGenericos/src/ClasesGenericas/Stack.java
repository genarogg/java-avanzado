package ClasesGenericas;
import java.util.ArrayList;
/**
 *
 * @author Genarogg
 */
public class Stack <T> {
    
    private final ArrayList<T> elementos; //ArrayList que almacena la pila de elementos.
    
    //Construccion que crea una pila de un numero especifico de elementos.
    
    public Stack(int capacidad){
        int capacidadInicial = capacidad > 0 ? capacidad : 10;
        elementos = new ArrayList<T> (capacidadInicial);
    }
    
    public Stack(){
        this(10);
    }
    
    //empujar elementos dentro de la pila
    public void push ( T valorPush){
        elementos.add(valorPush);
    }
    
    //public 
    public T pop(){
        if(elementos.isEmpty()){
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }
    
}
