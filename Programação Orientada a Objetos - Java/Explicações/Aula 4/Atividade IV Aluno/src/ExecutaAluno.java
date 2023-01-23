/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
import javax.swing.JOptionPane;

public class ExecutaAluno {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        a1.setNome(JOptionPane.showInputDialog
        ("Informe Seu nome:"));
        a1.setAltura(Float.valueOf(JOptionPane.showInputDialog
        ("Informe a altura:")));
        a1.setPeso(Float.valueOf(JOptionPane.showInputDialog
        ("Informe o peso:")));
        a1.setSexo(JOptionPane.showInputDialog
        ("Informe o Sexo F/M:").charAt(0));
        
        a1.calculaImc();
       
        JOptionPane.showMessageDialog(null, a1.mostradados());
    }
}
