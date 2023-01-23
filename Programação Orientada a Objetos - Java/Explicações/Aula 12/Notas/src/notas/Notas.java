/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float notas[] = new float[5];
        float nota, soma=0, media=0;

        for (int i = 0; i < 5; i++) {
            nota = Float.valueOf(JOptionPane.showInputDialog("Informe a " + (i + 1) + "º nota:"));
            notas[i] = nota;
        }

        Arrays.sort(notas);

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
            media=soma/notas.length;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("-----------");
        System.out.println("Media" + media);
    }

}
