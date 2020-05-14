package IntStreamClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Genarogg
 */
public class ArreglosUFlujo {
    public static void main(String[] args) {
        Integer[] valores = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
        
        //Muestra los valores originales
        System.out.printf("Valores originales: %s%n", Arrays.asList(valores));
        
        //ordena los valores en forma ascendente con flujos
        System.out.printf("valores ordenados: %s%n",
                        Arrays.stream(valores) //Devuelve un Stream del tipo apropiado, en este caso Stream<Integer>(Stream
                        .sorted()//Devuelve un Stream<Integer> con los valores en orden ascendente
                        .collect(Collectors.toList())//Se crea una nueva coleccion con los resultados
        );
        
        //valores mayores que 4
        List<Integer> mayorQue4 = Arrays.stream(valores)
                                    .filter(value -> value > 4)
                                    .collect(Collectors.toList());
        System.out.printf("Valores mayores que 4: %s%n", mayorQue4);
   
        System.out.printf("Valores ordenados mayores que 4: %s%n",
                Arrays.stream(valores)
                    .filter(value -> value > 4)
                    .sorted()
                    .collect(Collectors.toList()));
        
        
}
