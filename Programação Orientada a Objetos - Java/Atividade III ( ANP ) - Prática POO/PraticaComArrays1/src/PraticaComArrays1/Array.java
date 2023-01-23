/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraticaComArrays1;

import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Array {
    
    protected void iniciaArray(int[] V1) {
        int aux;
        
        for(int i = 0; i< 15; i++){
            aux = (int) (Math.random()*100);
            V1[i] = aux;
        }
    }

    protected void totalPares(int[] V1) {
        int par = 0;
        for (int i = 0; i < 15; i++) {
            if (V1[i] % 2 == 0) {
                par++;
            }
        }
        System.out.println("Quantidades de numeros pares: " + par);
        System.out.println("----------------");
    }

    protected void valorMaior(int[] V1) {
        int valorMaior = 0;
        for (int i = 0; i < 15; i++) {
            if (V1[i] > valorMaior) {
                valorMaior = V1[i];
            }
        }
        System.out.println("Maior Valor: " + valorMaior);
        System.out.println("----------------");
    }

    protected void totalIguais(int[] V1, int[] V2) {
        int totalIguais = 0;
        for (int i = 0; i < 15; i++) {
            for (int a = 0; a < 15; a++) {
                if (V1[i] == V2[a]) {
                    totalIguais++;
                }
            }
        }
        System.out.println("Total de iguais: " + totalIguais);
        System.out.println("----------------");
    }

    protected void mutiplicaArray(int[] V1, int[] V2) {
        ArrayList V3 = new ArrayList();
        for (int i = 0; i < 15; i++) {
            V3.add(V1[i] * V2[i]);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Produto " + (i + 1) + " : " + V3.get(i));
        }
        System.out.println("----------------");
    }

    protected void somaArray(int[] V1, int[] V2) {
        ArrayList V3 = new ArrayList();
        for (int i = 0; i < 15; i++) {
            V3.add(V1[i] + V2[i]);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Soma " + (i + 1) + " : " + V3.get(i));
        }
        System.out.println("----------------");
    }

    protected void mediaArray(int[] V1) {
        int media = 0, soma = 0;
        for (int i = 0; i < 15; i++) {
            soma = soma + V1[i];
        }
        media = soma / V1.length;
        System.out.println("Media do Array:" + media);
        System.out.println("----------------");
    }

    protected void buscaArray(int[] V1, int valor) {
        String mensagem = "Valor inexistente";
        int posicao = -1;
        for (int i = 0; i < 15; i++) {
            if (V1[i] == valor) {
                mensagem = "Valor encontrado!";
                posicao = i;
            }
        }
        System.out.println(mensagem);
        System.out.println("Pos:" + posicao + " º");
        System.out.println("----------------");
    }

    protected void mostraDados(int[] V1) {
        for (int i = 0; i < 15; i++) {
            System.out.println("Numero " + (i + 1) + " : " + V1[i]);
        }
        System.out.println("----------------");
    }
}
