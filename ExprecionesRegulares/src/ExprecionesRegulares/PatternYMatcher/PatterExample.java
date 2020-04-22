package ExprecionesRegulares.PatternYMatcher;

import java.util.regex.Pattern;

/**
 *
 * @author Genarogg
 */
public class PatterExample {
    public static void main(String[] args) {
        String patterString = "sep";
        Pattern pattern = Pattern.compile(patterString);
        
        String pattern2 = pattern.pattern();
        System.out.println("El patron es: " + pattern2);
    }
}
