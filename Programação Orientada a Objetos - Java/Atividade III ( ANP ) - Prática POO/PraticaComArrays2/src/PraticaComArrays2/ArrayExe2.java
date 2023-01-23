/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraticaComArrays2;
/**
 *
 * @author Thiago
 */
public class ArrayExe2 {

    public static void main(String[] args) {
        Array A1 =new Array();
        
        int[] A = new int[7];
        int[] B = new int[7];
        
        
        //Iniciando Arrays 
        A1.iniciaArray(A);
        A1.iniciaArray(B);
        
        
        //Mostra dados
        A1.mostraDados(A);
        A1.mostraDados(B);

        //União Vetor A e B
        A1.unirVetor(A, B);
      
    }
}
