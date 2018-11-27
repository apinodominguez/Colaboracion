package colaboracion;

import javax.swing.JOptionPane;

/**
 *
 * @author apinodominguez
 */

public class Colaboracion {
    
    public static void main(String[] args) {
        
        Validar obx1 = new Validar();
        
    int x = obx1.setX();
    int y = obx1.setY();
    
    JOptionPane.showMessageDialog(null, "La suma de ambos numeros es: " + (x + y));
    }
    //Commit nuevo
    
    //Commit
}
