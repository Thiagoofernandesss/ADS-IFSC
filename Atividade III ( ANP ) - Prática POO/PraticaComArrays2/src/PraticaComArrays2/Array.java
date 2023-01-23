/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraticaComArrays2;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Array {
    protected  void iniciaArray(int[] V1) {
        int aux;

        for (int i = 0; i < 7; i++) {
            aux = (int) (Math.random() * 100);
            V1[i] = aux;
        }
    }

    protected void mostraDados(int[] V1) {
        for (int i = 0; i < 7; i++) {
            System.out.println("Numero " + (i + 1) + " : " + V1[i]);
        }
        System.out.println("----------------");
    }

    protected void unirVetor(int[] V1, int[] V2) {
        ArrayList V3 = new ArrayList();
        for (int i = 0; i < 7; i++) {
            V3.add(V1[i]);
            V3.add(V2[i]);
        }

        System.out.println("União dos Vetores");
        for (int i = 0; i < 14; i++) {
            System.out.println("Numero " + (i + 1) + " : " + V3.get(i));
        }
    }
}
