package ExprecionesRegulares.PatternYMatcher;

import java.util.regex.Pattern;

/**
 *
 * @author Genarogg
 */
public class PatternYMatcherExample {
    public static void main(String[] args) {
        String text = "this is the text to be searched " +
                      "for occurrences of the pattern";
        String pattern = ". *.is.*";
        boolean matches = Pattern.matches(pattern, text);
        
        System.out.println("matches = " + matches);
    }
}
