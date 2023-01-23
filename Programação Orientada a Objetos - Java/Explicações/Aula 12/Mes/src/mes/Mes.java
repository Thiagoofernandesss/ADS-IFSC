/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mes;

import java.util.Random;

/**
 *
 * @author Thiago
 */
public class Mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();

        String [] meses={"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
        "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        int numero = random.nextInt(11);
        
        System.out.println("Numero Sorteado: " +numero);
        System.out.println("Mes corespondente: " +meses[numero]);

    }
    
    
}
