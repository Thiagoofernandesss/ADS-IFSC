/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeiii_06_09;

import java.util.Scanner;

/**
 *
 * @author professor
 */
public class AtividadeIII_06_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] altura = new float[5];
        float maiorAltura, menorAltura = 0, mediaHomens = 0;
        int nMulheres, nHomens = 0;
        char[] sexo = new char[5];
        
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        
        System.out.println("Informe a altura da pessoa 1:");
        altura[0] = ler.nextFloat();
        System.out.println("Informe o sexo da pessoa 1 (M/F):");
        sexo[0] = ler.next().charAt(0);

        
        System.out.println("Informe a altura da pessoa 2:");
        altura[1] = ler.nextFloat();
        System.out.println("Informe o sexo da pessoa 2 (M/F):");
        sexo[1] = lerString.next().charAt(0);
        
        System.out.println("Informe a altura da pessoa 3:");
        altura[2] = ler.nextFloat();
        System.out.println("Informe o sexo da pessoa 3 (M/F):");
        sexo[2] = lerString.next().charAt(0);
        
        System.out.println("Informe a altura da pessoa 4:");
        altura[3] = ler.nextFloat();
        System.out.println("Informe o sexo da pessoa 4 (M/F):");
        sexo[3] = lerString.next().charAt(0);
        
        System.out.println("Informe a altura da pessoa 5:");
        altura[4] = ler.nextFloat();
        System.out.println("Informe o sexo da pessoa 5 (M/F):");
        sexo[4] = lerString.next().charAt(0);
        
        if(altura[0] >= altura[1] && altura[0] >= altura[2] && 
                altura[0] >= altura[3] && altura[0] > altura[4]){
            maiorAltura = altura[0];
        }else if(altura[1] >= altura[2] && altura[1] >= altura[3] && 
                altura[1] >= altura[4]){
            maiorAltura = altura[1];
        }else if(altura[2] >= altura[3] && altura[2] >= altura[4]){
            maiorAltura = altura[2];
        }else if(altura[3] >= altura[4]){
            maiorAltura = altura[3];
        }else {
            maiorAltura = altura[4];
        }
        
        nMulheres = 0;
        
        int x = 0;
        
        do{
            if(sexo[x] == 'F' || sexo[x] == 'f')
            nMulheres++;
            x++;
        }while(x < 5);
        
        
        for(int i=0; i<5; i++){
            if(sexo[i] == 'M' || sexo[i] == 'm'){
                mediaHomens += altura[i];
                nHomens++;
            }
            
            if(i == 0)
                menorAltura = altura[i];
            else{
                if(menorAltura > altura[i]){
                    menorAltura = altura[i];
                }
            }
        }
        
        mediaHomens = mediaHomens / nHomens;
        
        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
        System.out.println("O número de mulheres é: " + nMulheres);
        System.out.println("A média da altura dos homens é: " + mediaHomens);
    }
    
}
