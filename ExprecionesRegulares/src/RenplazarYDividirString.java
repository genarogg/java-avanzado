package ExprecionesRegulares;

import java.util.Arrays;

/**
 *
 * @author Genarogg
 */
public class RenplazarYDividirString {
    public static void main(String[] args) {
        String primeraCadena = "Este enunciado termina con 5 estrellas ******";
        String segundaCadena = "1, 2, 3, 4, 5, 6, 7, 8";
        
        System.out.printf("Cadena 1 original: %s%n", primeraCadena);
        
        //sustituye '*' con '^'
        primeraCadena = primeraCadena.replaceAll("\\*", "^");
        
        System.out.printf("^ sustituye a *: %s%n", primeraCadena);
        
        //sustituye estrellas con intercaladores
        primeraCadena = primeraCadena.replaceAll("estrellas", "intercaladoras");
        
        System.out.printf("Cada palabra se sustituye por \"palabra\": %s%n%n"
                            ,primeraCadena.replaceAll("\\w", "palabra"));
        
        System.out.printf("Cadena 2 original: %s%n", segundaCadena);
        
        //Sustituye las palabras con 'palabra'
        for(int i = 0; i < 3;i++){
            segundaCadena = segundaCadena.replaceFirst("\\d", "digito");
        }
        
        System.out.printf("Los primeros tres digitos se sustituyeron por \"digito\": %s%n",
                            segundaCadena);
        
        System.out.print("Cadena dividida es comas: ");
        
        String[] resultados = segundaCadena.split(",\\s*");
        System.out.println(Arrays.toString(resultados));
    }
}
