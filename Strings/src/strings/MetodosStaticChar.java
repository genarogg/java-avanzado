package strings;

import java.util.Scanner;

/**
 *
 * @author Genarogg
 */
public class MetodosStaticChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero y oprima intro");
        String entrada = scanner.next();
        char c = entrada.charAt(0);//obtiene el caracter de entrada
        
        //Muestra informacion sobre los caracteres
        System.out.printf("Esta definido: %b%n", Character.isDefined(c));
        System.out.printf("es digito: %b%n", Character.isDigit(c));
        System.out.printf("es el primer caracter en un indentificador de java %b%n", Character.isJavaIdentifierStart(c));
        System.out.printf("es parte de un identificador java %b%n", Character.isJavaIdentifierPart(c));
        System.out.printf("es letra: %b%n", Character.isLetter(c));
        System.out.printf("es letra o digito %b%n", Character.isLetterOrDigit(c));
        System.out.printf("es minuscula: %b%n", Character.isLowerCase(c));
        System.out.printf("es Mayuscula: %b%n", Character.isUpperCase(c));
        System.out.printf("conversion a minuscula: %s%n", Character.toLowerCase(c));
        System.out.printf("conversion a Mayuscula: %s%n", Character.toUpperCase(c));
        
    }
}
