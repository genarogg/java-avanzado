package Predicado.Predicados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Genarogg
 */
public class PruebaPredicados {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        Persona p1 = new Persona ("pepe", "perez", 20);
        Persona p2 = new Persona ("angel", "sanchez", 30);
        Persona p3= new Persona ("pepe", "blanco", 40);
        
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        
        //recorremos la lista por medio de un Stream
        listaPersonas.stream().forEach(p -> System.out.println(p.getNombre()));
        
        System.out.println();
       
    }   
}
