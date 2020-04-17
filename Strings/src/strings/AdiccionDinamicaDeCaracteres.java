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
                
        
    }
}
