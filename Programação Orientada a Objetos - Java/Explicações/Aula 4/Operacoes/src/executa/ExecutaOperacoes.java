/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package executa;

import operacao.Operaçoes;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class ExecutaOperacoes {
    public static void main(String[] args) {
        Operaçoes o = new Operaçoes();
        
        o.setNumero1(Float.valueOf(JOptionPane.showInputDialog("Informe um número:")));
        o.setNumero2(Float.valueOf(JOptionPane.showInputDialog("Informe outro número:")));
        
        o.soma();
        o.divisao();
        o.mutiplicacao();
        
        System.out.println(o.imprimeResultado());
    }
    
}
