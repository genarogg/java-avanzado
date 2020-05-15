package MetodosReferenciadosStaticos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author Genarogg
 */
public class Numero {
    /**
     * metodo estatico que nos devuelve true si la suma de ambos numeros es mayor que cincuenta
     */
    
    public static boolean esMayorQueCincuenta(int n1, int n2){
        return (n1 + n2) < 50;
    }
    
    public static List<Integer> encontrarNumeros(List<Integer> l,BiPredicate <Integer, Integer> p){
        //Creamos un objeto ArrayList
        List<Integer> nuevaLista = new ArrayList<>();
        for(Integer i : l){
            //Realizar el testeo en base a la implementacion de test del objeto BiPredicate pasado como un argumento
            if(p.test(i, i + 10)){
                nuevaLista.add(i);
            }
        }
        return nuevaLista;
    }
    
    List<Integer> list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);
    
    //Mediante una Clase anonima
    List<Integer> numerosEncontrados1 = encontrarNumeros(list, new BiPredicate<Integer, Integer>(){
        @Override
        public boolean test(Integer int1, Integer int2) {
            return Numero.esMayorQueCincuenta(int1, int2);
        }
        
    });
    
    List<Integer> numerosEncontrados2 = encontrarNumeros(list,(int1, int2) -> Numero.esMayorQueCincuenta(int1, int2));
    
    List<Integer> numerosEncontrados3 = encontrarNumeros(list, Numero::esMayorQueCincuenta);
    
    public static void main(String[] args) {
        Numero n = new Numero();
        
        for(Integer integer : n.numerosEncontrados1){
            System.out.print(integer + " ");
        }
        System.out.println("");
        
        for(Integer integer : n.numerosEncontrados2){
            System.out.print(integer + " ");
        }
        System.out.println("");
        
        for(Integer integer : n.numerosEncontrados3){
            System.out.print(integer + " ");
        }
        System.out.println("");
    }
}
