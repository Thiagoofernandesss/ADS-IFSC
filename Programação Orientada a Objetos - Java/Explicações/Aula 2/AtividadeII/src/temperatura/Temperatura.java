/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float C,K,F;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em celcius: ");
        C=ler.nextFloat();
        
        F = (float) (C*1.8+32);
        K = (float) (C+273.15);
        
        System.out.println("Temperatura em Fahrenheit: "+F);
        System.out.println("Temperatura em Kelvin: "+K);

    }
    
}
