
import javax.swing.JOptionPane;

public class ExecutaQuadrado {
    public static void main(String[] args) {
        Quadrado a1 = new Quadrado();
        
        a1.setLado(Float.valueOf(JOptionPane.showInputDialog
        ("Medidado do Lado 1:")));
        a1.setLado(Float.valueOf(JOptionPane.showInputDialog
        ("Medidado do Lado 2:")));
        
        a1.calculaArea();
        
        JOptionPane.showMessageDialog(null, a1.mostraresultado());
    }  
}
