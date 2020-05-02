package metodosDeCollectiones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author Genarogg
 */
public class Copy_Fill_Max_Min {
    public static void main(String[] args) {
        //Crea y muestra un objeto List<Character>
        Character[] letras = {'p', 'C', 'M'};
        List<Character> listaLetras = Arrays.asList(letras); //obtiene el objeto List
        System.out.println("Lista contiene:");
        imprimir(listaLetras);
        
        //invierte y muestra el objeto List<Character>
        Collections.reverse(listaLetras);
        System.out.println("Despues de llamar a reverse, lista contiene:");
        imprimir(listaLetras);
        
        //Crea copiaLista a partir de un arreglo
        Character[] letrasCopia = new Character[3];
        List<Character> copiaLista = Arrays.asList(letrasCopia);
        
        Collections.copy(copiaLista, listaLetras);
        System.out.println("Despues de copiar, copiaLista contiene: ");
        imprimir(copiaLista);
        
        
    }
    
   
}
