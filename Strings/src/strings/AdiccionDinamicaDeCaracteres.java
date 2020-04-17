package strings;

/**
 *
 * @author Genarogg
 */
public class AdiccionDinamicaDeCaracteres {
    public static void main(String[] args) {
        Object refObject = "hola";
        String cadena = "adios";
        char[] arregloChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBoolean = true;
        char valorChar = 'Z';
        int valorInt = 7;
        long valorLong = 100000000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.33;

        StringBuilder ultimoBuffer = new StringBuilder("ultimo bufer");

        StringBuilder bufer = new StringBuilder();

        //El metodo append permite agregar elementos al final del StringBuilder
        bufer.append(refObject)
             .append("\n")
             .append(cadena)
             .append("\n")
             .append(arregloChar)
             .append("\n")
             .append(valorBoolean)
             .append("\n")
             .append(arregloChar, 0 , 3)
             .append("\n")
             .append(valorChar)
             .append("\n")
             .append(valorInt)
             .append("\n")
             .append(valorLong)
             .append("\n")
             .append(valorFloat)
             .append("\n")
             .append(valorDouble)
             .append("\n")
             .append(ultimoBuffer);
                
        System.out.printf("buffer contiene%n%s%n", bufer.toString());
        
        //El compilador puede usar StringBuilder y metodos append para implementar los operadores
        //+ y += de concatenacion de String
        String cadena1 = "Hola";
        String cadena2 = "BC";
        int valor =22;
        
        //La instruccion String s = cadena1 + cadena2 + valor
        //Decha concatenacion puede ser realizada con StringBuilder de la siguiente manera
        String s = new StringBuilder().append("hola").append("Bc").append(22).toString();
        
        //La instruccion s += "!";
        //puede ser realizar en StringBuilder de la siguiente manera
        s = new StringBuilder().append(s).append("!").toString();
        
        System.out.printf("%s",s);
    }
}
