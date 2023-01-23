/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote2;

import pacote1.Produto;
import javax.swing.JOptionPane;

/**
 * Atividade Métodos sem Retorno
 **/

public class ExecutaProduto {
    
    public static void main(String[] args) {
        
        Produto p = new Produto();
        
        p.setQuantidade(Float.valueOf(JOptionPane.showInputDialog("Quantidade:")));
        p.setV_unitario((float)10.0);
        
        p.calculaSubtotal();
        
        System.out.println(p.toString());
        //System.out.println(p.retornaDescricao());
        //System.out.println(p.realizaVenda());
        p.reajustaSaldo(10);
        System.out.println(p.toString());
        
    }
    
}
