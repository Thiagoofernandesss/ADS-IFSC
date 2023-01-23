/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeexeçãoi;


import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class AtividadeExeçãoI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException{

     
    try{
            
        float nota[]=new float[5];
        int i;
        float soma=0,media=0;           
            
            
            
        //Lendo as notas
        for(i=0;i<5;i++){
            nota[i]=Float.parseFloat(JOptionPane.showInputDialog(null,"Nota do aluno "+(i+1)+" :"));
            if(nota[i]<=0){
                throw new IllegalArgumentException("Nota tem que ser positiva");
            }
            soma=soma+nota[i];
            media=soma/(i+1);
            }
        //definindo a maior e menor nota:
        float menorNota=nota[0];
        float maiorNota=nota[0];
        
        for(i=0;i<5;i++){
            if(nota[i]<menorNota)
                menorNota=nota[i];
            if(nota[i]>maiorNota)
                maiorNota=nota[i];
        }
        System.out.println("Maior nota: "+maiorNota);
        System.out.println("Menor nota:"+menorNota);
        System.out.println("Média: "+media);

            
        }catch(NumberFormatException exception){
            System.out.println("Digite somente números");
        }
      
    }
    
}
