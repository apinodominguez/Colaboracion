package colaboracion;

import javax.swing.JOptionPane;

/**
 *
 * @author apinodominguez
 */

public class Colaboracion {

    public static void main(String[] args) {
    int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
    int y = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero: "));
    
    JOptionPane.showMessageDialog(null, "La suma de ambos numeros es: " + (x + y));
    }
    
}
