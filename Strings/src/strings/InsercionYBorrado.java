package strings;

/**
 *
 * @author Genarogg
 */
public class InsercionYBorrado {
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
        
        StringBuilder buffer = new StringBuilder();
        
        buffer.insert(0, refObject);
        buffer.insert(0, " ");
        buffer.insert(0, cadena);
        buffer.insert(0, " ");
        buffer.insert(0, arregloChar);
        buffer.insert(0, " ");
        buffer.insert(0, arregloChar, 3, 3);
        buffer.insert(0, " ");
        buffer.insert(0, valorBoolean);
        buffer.insert(0, " ");
        buffer.insert(0, valorChar);
        buffer.insert(0, " ");
        buffer.insert(0, valorInt);
        buffer.insert(0, " ");
        buffer.insert(0, valorLong);
        buffer.insert(0, " ");
        buffer.insert(0, valorFloat);
        buffer.insert(0, " ");
        buffer.insert(0, valorDouble);
        
        System.out.printf("buffer despues de insertar: %n%s%n%n", buffer.toString());
        
        buffer.deleteCharAt(8);//Elimina el 5 del 2.5;
        buffer.delete(2, 6);//Elimina el .333 en 33.333
        
        System.out.printf("buffer despues de la eliminacion:%n%s%n%n", buffer.toString());
    }
}
