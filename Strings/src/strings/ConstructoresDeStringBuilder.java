package strings;

/**
 *
 * @author Genarogg
 */
public class ConstructoresDeStringBuilder {
    public static void main(String[] args) {
        //El constructor sin argumentos tiene una capacidad inicial de 16 caracteres(valor predeterminado de StringBuilder)
        StringBuilder buffer1 = new StringBuilder();
        
        //El constructor que recibe como argumento un numero entero, crea un StringBuilder que no contiene caracters, y su
        //capacidad inicial es de 10 caracteres en este caso
        StringBuilder buffer2 = new StringBuilder(10);
        
        //Este constructor recibe un argumento String para crear un objeto StringBuilder que contiene los caracteres es el
        //argumento String. la capacidad inicial es el numero de caracteres en el argumento String, mas 16.
        StringBuilder buffer3 = new StringBuilder("hola");
        
        //Impresion con formato, se llama implicitamente el metodo toString de los objetos StringBuilder buffer1, buffer2 y buffer3
        System.out.printf("buffer1 = \"%s\"%n", buffer1);
        System.out.printf("buffer1 = \"%s\"%n", buffer2);
        System.out.printf("buffer1 = \"%s\"%n", buffer3);
    }
}
