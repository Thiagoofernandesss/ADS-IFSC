
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao =-1;
        Carro car = new Carro();
       
        while(opcao != 0){
            opcao  = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar dados do veículo\n"
                    +"2 - Abastecer veículo\n"
                    +"3 - Andar\n"
                    +"0 - Sair"));
            
            switch(opcao){
                case 1: {
                    car.setPlaca(String.valueOf(JOptionPane.showInputDialog(null, "Placa do veículo: ")));
                    car.setHodometro(Float.valueOf((JOptionPane.showInputDialog(null, "Kilometragem do veículo: "))));
                    car.setConsulmo(Float.valueOf((JOptionPane.showInputDialog(null, "Consulmo do veículo: "))));
                    car.setCapacidadeTanque(Float.valueOf((JOptionPane.showInputDialog(null, "Capacidade do tanque: "))));
                    car.setQuantidadeCombustivel(Float.valueOf((JOptionPane.showInputDialog(null, "Quantidade de combustível: "))));
                    JOptionPane.showMessageDialog(null, "Carro cadastrado!");
                    break;
                }
                
                case 2:{
                    car.abastecer(Float.valueOf((JOptionPane.showInputDialog(null, "Quantos reais você quer colocar no veículo? "))));
                    break;
                }
                
                case 3:{
                    car.percorrer(Float.valueOf((JOptionPane.showInputDialog(null, "Qual distância irá ser percorrida?"))));
                
                }

                    
            
            }
        
        }

    }
    
}
