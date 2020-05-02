package coleccionesdegenericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Genarogg
 */
public class PruebaCollection {
    /**
    * Eliminar de coleccion1 los colores especificos en coleccion2. el metodo acepta cuarquier objeto
    * contengan objetos String como argumentos.
    * @params coleccion1 es la coleccion que contiene los elementos a eliminar
    * @params coleccion2 contiene los elementos que se van a eliminar de coleccion1
    */
   private static void eliminarColores(Collection <String> coleccion1, Collection <String> coleccion2){
       //obtiene el iterator de coleccion1
       Iterator<String> iteradorColeccion1 = coleccion1.iterator();

       //iteramientras la coleccion tenga elementos mediante el metodo hasNext() de Iterator
       while(iteradorColeccion1.hasNext()){
           //llama al metodo next de Iterator para obtener una referencia al siguiente elemento.
           //Despues se utiliza contains de coleccion2 para determinar si contiene el elemento devuelto por iterator
           if(coleccion2.contains(iteradorColeccion1.next())){
               //se llama al metodo remove de Iterator para eliminar el elemento del objeto coleccion1
               iteradorColeccion1.remove();
           }
       }
   } 
    public static void main(String[] args) {
        //Agrega los elementos en el arreglo colores a la lista
        String [] colores = {"MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};
        
        //Se crea objeto a la referencia lista. ArrayList es una clase generica
        //por lo que podemos especifiacar un "argumento tipo" mediante los diamantes <> para indicar el tipo
        //que contendra la coleccion
        //Este objeto ArrayList contendra los mismos elementos que arreglo colores
        List <String> lista = new ArrayList <String>();
        
        //Este ciclo for llena "lista" con los Strings del arreglo colores
        for(String color : colores){
            //el metodo add de list agrega elementos a la lista final de esta
            lista.add(color);
        }
        
    }   
}
