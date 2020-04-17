package strings;

/**
 *
 * @author Genarogg
 */
public class Apuntadores {
    public static void main(String[] args) {
        String hola = "hola";
        
        String hola1 = hola;
        
        hola = "adios";
        
        System.out.println("el contenido de la variable hola es " + hola);
        
        System.out.println("el contenido de la variable hola1 es " + hola1);
        
        hola1 = hola;
        
        System.out.println("ahora el contenido de la variable hola1 es " + hola1);
    }
    
}
