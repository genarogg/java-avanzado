package coleccionesdegenericos;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Genarogg
 */
public class PruebaList {
    public static void main(String[] args) {
        //agrega elementos de colores a lista1
        String [] colores = {"negro", "amarillo", "verde", "azul", "violeta", "plateado"};
        List<String> lista1 = new LinkedList<>();
        
        for(String color : colores){
            lista1.add(color);
        }
        
        //Agrega elementos de colores2 a lista2
        String [] colores2 = {"dorado", "blanco", "cafe", "azul", "gris", "plateado"};
        List<String> lista2 = new LinkedList<>();
        
        for(String color : colores){
            lista2.add(color);
        }
        
    }
    
    
    
    
 
    
   
    
}
