/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeii20.pkg09;


import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class AtividadeII2009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Frase,Palavra;
        

        Frase=JOptionPane.showInputDialog(null,"Informe uma frase");  
        Palavra=JOptionPane.showInputDialog(null,"Informe uma frase");  

        //Usando uma caixa de diáogo ao inves do terminal 
        if(Frase.indexOf(Palavra) != -1){
            JOptionPane.showMessageDialog(null,"Palavra encontrada");
        }else{
            JOptionPane.showMessageDialog(null,"Palavra não encontrada");
        }
       
        
        //Tamanho frase e palavra
      
        System.out.println("\nTamanho da Frase: "+Frase.length());
        System.out.println("Tamanho da Palavra: "+Palavra.length());
        
        //texto em caixa alta
        System.out.println("\nFrase em caixa alta: "+Frase.toUpperCase());
        System.out.println("Frase em caixa alta: "+Palavra.toUpperCase());
        
     
       
    }
    
}
