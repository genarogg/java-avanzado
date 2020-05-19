package clasesymetodosgenericos;

/**
 *
 * @author Genarogg
 */
public class ClasesYMetodosGenericos {

    public static void main(String[] args) {
        //Crear arreglos Integer, Double and Character
        Integer[] arregloInteger = {1, 2, 3, 4, 5, 6};
        Double[] arregloDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] arregloCharacter = {'H','E','L', 'L', 'O'};
        
        System.out.printf("el arreglo arregloInteger contiene:%n");
        imprimirArreglo(arregloInteger);
        System.out.printf("El arreglo arregloDouble contiene:%n");
        imprimirArreglo(arregloDouble);
        System.out.printf("El arreglo arregloCharacter contiene:%n");
        imprimirArreglo(arregloCharacter);
        
        
    }
    public static <T> void imprimirArreglo(T[] arreglo){
        //Imprimir elementos del arreglo
        for(T numero : arreglo){
            System.out.printf("%s ", numero);
        }
        System.out.println();
    }
}
    
    /*
    public static void imprimirArreglo(Integer[] arreglo){
        //Imprimir elementos del arreglo
        for(Integer integer : arreglo){
            System.out.printf("%s ", integer);
        }
        System.out.println();
    }
    
    public static void imprimirArreglo(Double[] arreglo){
        //Imprimir elementos del arreglo
        for(Double double1 : arreglo){
            System.out.printf("%s ", double1);
        }
        System.out.println();
    }
    
    public static void imprimirArreglo(Character[] arreglo){
        //Imprimir elementos del arreglo
        for(Character character : arreglo){
            System.out.printf("%s ", character);
        }
        System.out.println();
    }
    */