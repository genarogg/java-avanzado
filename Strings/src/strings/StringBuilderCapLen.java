package strings;

/**
 *
 * @author Genarogg
 */
public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hola, como estas?");
        
        //El metodo length proporciona el tamaño de la cadena de caracteres contenida en el objeto StringBuilder
        //El metodo capacity proporciona la capacidad de almacenamiento del objeto StringBuilder
        System.out.printf("buffer = %s%nLongitud = %d%ncapcacidad = %d%n", buffer.toString(), buffer.length(), buffer.capacity());
        
        buffer.ensureCapacity(75);
        System.out.printf("Nueva capacidad = %d%n%n", buffer.capacity());
        
        buffer.setLength(10);
        System.out.printf("Nueva longitud = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
    }
}
