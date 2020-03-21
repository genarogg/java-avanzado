package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Genarogg
 */
public class DivisionEntreCero {
    
    //demuestra el lanzamiento de una exception cuando ocurre una divisiin entre cero
    public static int cociente(int numerador, int denominador){
        return numerador / denominador; //posible division entre cero
    }

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el primer numero:")) ;
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el segundo numero:")) ;
        
        JOptionPane.showMessageDialog(null, "el resultado es: " + (n1 / n2));

    }
    
}
