package ExprecionesRegulares.PatternYMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Genarogg
 */
public class ConcondanciasRedex {
    public static void main(String[] args) {
        //crea una expresion regular
        Pattern  expresion = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        
        String cadenal = "Jane nacio el 05-12-75\n" +
                         "Dave nacio el 11-04-28\n" +
                         "John nacio el 04-28-73\n" +
                         "Joe nacio el 12-17-77";
        
        //compara la expresion regular con la cadena e imprime las cocordancias
        Matcher matcher = expresion.matcher(cadenal);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
 