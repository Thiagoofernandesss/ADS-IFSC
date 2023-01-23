
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class ExecutaUsuario {
    public static void main(String[] args) {
        Usuario a1 = new Usuario();
        
        a1.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        a1.setSexo(JOptionPane.showInputDialog("Informe seu sexo M/F:").charAt(0));
        a1.setnFilhos(Integer.parseInt((JOptionPane.showInputDialog("Informe número de filho:"))));
        
        a1.calculaValor();
        
        JOptionPane.showMessageDialog(null, a1.mostraValor());
        //System.out.println(a1.mostraValor());
        
    }
    
}
