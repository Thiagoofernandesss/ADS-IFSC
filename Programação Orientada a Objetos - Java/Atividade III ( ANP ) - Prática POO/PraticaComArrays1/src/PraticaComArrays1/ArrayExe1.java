package PraticaComArrays1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class ArrayExe1 {

    public static void main(String[] args) {
        Array A1 = new Array();
        
        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[15];
        int[] D = new int[15];

        //Iniciando Arrays 
        A1.iniciaArray(A);
        A1.iniciaArray(B);
        A1.iniciaArray(C);
        A1.iniciaArray(D);
        
        //Mostra dados
        A1.mostraDados(A);
        
        //Total de pares
        A1.totalPares(A);
         
        //Maior Valor
        A1.valorMaior(A);

        //Total Iguais
        A1.totalIguais(A, B);
        
        //Mutiplica Arrays
        A1.mutiplicaArray(A, B);
        
        //Soma Arrays
        A1.somaArray(A, B);
        
        //Media Array
        A1.mediaArray(D);
        
        //Busca Valor 
        A1.buscaArray(A, 30);
    }

}
