/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarraylistcompleto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class ExemploArrayListCompleto {
    public static void main(String[] args) {
        ArrayList<Contato> agenda= new ArrayList();
        
        Contato aux = new Contato("Bi", 123456, "Rua 2");
        agenda.add(aux);
         
        aux = new Contato("Thi", 123456, "Rua 2");
        agenda.add(aux);
        
        aux = new Contato("Thi", 123456, "Rua 2");
        agenda.add(aux);
        
        System.out.println(agenda.size());
        
        agenda.remove(0);
        
        System.out.println(agenda.size());
        


        

        
    }
    
}
