public class UsoToArray {
    
}package UsoDeList;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Genarogg
 */
public class UsoToArray {
    public static void main(String[] args) {
        String [] lenguajes = {"java", "c++", "c"};
        LinkedList<String> enlaces = new LinkedList<>(Arrays.asList(lenguajes));
        
        enlaces.addLast("ruby");
        enlaces.add("python");
        enlaces.add(3, "c#");
        enlaces.addFirst("erlang");
        
        //obtiene los elementos de LinkedList como un arreglo
        lenguajes = enlaces.toArray(new String[enlaces.size()]);
        
        System.out.println("lenguajes: ");
        
        for(String lenguaje : lenguajes){
            System.out.println(lenguajes);
        }
    }
}
