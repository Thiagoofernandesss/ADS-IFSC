/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomodficadoracesso;


import biblioteca.Produto;

/**
 *
 * @author professor
 */
public class ExemploModficadorAcesso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //Exemplo Metodo sem retorno Produto
        Produto p = new Produto();
        
        p.setSaldo((float) 10);
        p.setV_unit((float) 10.45);
        
        p.calculaSubtotal();
        
        System.out.println(p.toString());
        //System.out.println(p.getDescricao());
        
        /* 
        System.out.println(p.realizaVenda((float)5.5));
        p.realizaVenda(10);
        System.out.println(p.toString());
        */
        p.reajustaSaldo(10);
        System.out.println(p.toString());
        
        /*
        p.reajustaSaldo(25, (float)89.50);
        System.out.println(p.toString());
        */
    }
    
}