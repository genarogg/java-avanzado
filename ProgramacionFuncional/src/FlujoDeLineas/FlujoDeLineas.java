package FlujoDeLineas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author Genarogg
 */
public class FlujoDeLineas {
    public static void main(String[] args) {
        //Expresion regular que coincide con uno o mas caracteres consecutivos
        //de espacio en blanco
        
        Pattern patron = Pattern.compile("\\s+");
        
        //cuenta las ocurrencias de cada palabra en un Stream<String> ordenado
        //por palabra
        
        
        
        try {
            Map<String, Long> cuentaPalabras;
            cuentaPalabras = Files.lines(Paths.get("Parrafo.txt"))
                    .map(line -> line.replaceAll("\\p{P}", ""))
                    .flatMap(line -> patron.splitAsStream(line))
                    .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));
            
            //Muestra las palabreas agrupadas por letas inicial
           
        }
        catch (IOException ex) {
            System.out.println("Fallo la carga del archivo");
        }
   
        
        
    }
}
