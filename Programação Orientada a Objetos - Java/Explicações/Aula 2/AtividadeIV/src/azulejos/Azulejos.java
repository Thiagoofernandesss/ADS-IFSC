/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package azulejos;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Azulejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float AlturaAzulejo,LarguraAzulejo,AlturaParede,LarguraParede,AreaParede,AreaAzulejo,QuantAzulejos;
        
        Scanner ler= new Scanner (System.in);
        
        System.out.println("Informe a altura da parede: ");
        AlturaParede=ler.nextFloat();
        System.out.println("Informe a largura da parede: ");
        LarguraParede=ler.nextFloat();
        AreaParede=AlturaParede*LarguraParede;

        
        System.out.println("Informe a altura do azulejo: ");
        AlturaAzulejo=ler.nextFloat();
        System.out.println("Informe a largura do azulejo: ");
        LarguraAzulejo=ler.nextFloat();
        AreaAzulejo=AlturaAzulejo*LarguraAzulejo;
        
        QuantAzulejos=AreaParede/AreaAzulejo;
        
        System.out.println("Será necessário "+QuantAzulejos+" azulejos para cobrir a parede.");
        
        
        
        
      
        
       
        
    }
    
}
