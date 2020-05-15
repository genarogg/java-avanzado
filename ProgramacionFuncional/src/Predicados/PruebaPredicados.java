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
        //Creamos un predicado que se encargue de definir una condicion que permite filtrar la lista
        Predicate<Persona> predicadoNombre = p -> p.getNombre().equals("pepe");
        
        listaPersonas.stream()
                        .filter(predicadoNombre)
                            .forEach(p -> System.out.println(p.getApellidos()));
    
        //metodo default and
        Predicate<Persona> predicado1 = p -> p.getEdad() > 18;
        Predicate<Persona> predicado2 = p -> p.getEdad() < 30;
        Predicate<Persona> predicado3 = predicado1.and(predicado2);
        
    
    }   
}
