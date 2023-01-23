/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayslist;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Thiago
 */
public class ArraysList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection <Integer> numeros = new ArrayList();
        Collection <String> nomes = new ArrayList();
        ArrayList contatos = new ArrayList();

        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.remove(1);
        
        contatos.add(0, "OII!");
      
        
        System.out.println("Lista de numero" +numeros);
        
        System.out.println("Imprimi: "+ contatos.get(0));

    }
    
}
