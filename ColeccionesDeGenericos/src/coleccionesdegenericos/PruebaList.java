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
        
        lista1.addAll(lista2); //concatena las listas
        lista2 = null; //libera los recursos
        imprimirLista(lista1); //imprime los elementos de lista1
        
        convertirCadenasAMayusculas(lista1);//convierte la cadena a mayusculas
        imprimirLista(lista1);//Imprime nuevamente la lista1
        
        System.out.printf("%nEliminando elementos 4 a 6...");
        eliminarElementos(lista1, 4, 7); //Elimina los elementos 4 a 6 de la lista
        imprimirLista(lista1);
        imprimirListaInversa(lista1);
    }
    
    //Imprime el objeto del objeto list
    private static void imprimirLista(List<String> lista){
        System.out.printf("%nlista:%n");
        
        for(String color : lista){
            System.out.printf("%s ", color);
        }
    }
    //localiza los objetos String y los convierte en mayusculas 
    
    private static void convertirCadenasAMayusculas(List<String> lista){
        ListIterator<String> iterador  = lista.listIterator();
        
        while(iterador.hasNext()){
            String color = iterador.next();//obtiene elementos de las iteracion actual
            iterador.set(color.toUpperCase());//Convierte todo a Mayusculas
        }
    }
    
 
    
   
    
}
