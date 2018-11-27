package colaboracion;

import javax.swing.JOptionPane;

public class Validar {

    private int x;
    private int y;
    
public int setX(){
    do{
        x = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        if(x < 0)
            JOptionPane.showMessageDialog(null, "El numero no puede ser menor que 0");
        }while (x < 0);
    return x;
}

public int setY(){
    do{
        y = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero: "));
        if(y < 0)
            JOptionPane.showMessageDialog(null, "El numero no puede ser menor que 0");
        }while (y < 0);
    return y;
}
// Commit para pull-request Nº1
// Commit para pull-request Nº2


}
