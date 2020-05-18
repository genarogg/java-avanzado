package ClasesGenericas;

/**
 *
 * @author Genarogg
 */
public class Main {
    public static void main(String[] args) {
        double [] elementosD = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        int [] elementosI = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //Crar un arreglo de elementos Double e Integer
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();
        
        testPushDouble(doubleStack, elementosD);
        testPopDouble(doubleStack);
        
        testPushInteger(integerStack, elementosI);
        testPopInteger(integerStack);
    }
    
    //test del metodo puhk con valores de tipo Double 
    private static void testPushDouble(Stack<Double> stack, double[] valores){
        System.out.printf("%nHacer push a los elementos dentro de la pila double%n");
        
        for(double valor : valores){
            System.out.printf("%.1f ", valor);
            stack.push(valor);
        }
        
    }
    
   
    
}
