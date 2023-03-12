
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Carro {

    public String placa;
    public float hodometro;
    public float consulmo;
    public float capacidadeTanque;
    public float quantidadeCombustivel;

    public Carro() {
    }

    public String getPlaca() {
        return placa;
    }

    public float getHodometro() {
        return hodometro;
    }

    public float getConsulmo() {
        return consulmo;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setHodometro(float hodometro) {
        this.hodometro = hodometro;
    }

    public void setConsulmo(float consulmo) {
        this.consulmo = consulmo;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecer(float valor) {

        int litros = (int) (float) (valor / 4.99);
        if(this.getCapacidadeTanque() == this.getQuantidadeCombustivel()){
            JOptionPane.showMessageDialog(null,"Tanque já está cheio não é preciso abastecer");
        }
        else if ((this.getQuantidadeCombustivel() + litros) > this.getCapacidadeTanque()) {
            this.setQuantidadeCombustivel(this.getCapacidadeTanque());
            JOptionPane.showMessageDialog(null,"Tanque cheio!\n" + "Litros = " + this.getQuantidadeCombustivel());
        } else {
            this.setQuantidadeCombustivel(this.getQuantidadeCombustivel() + litros);
            JOptionPane.showMessageDialog(null,"Litros = "+ this.getQuantidadeCombustivel());
        }

    }

    public void percorrer(float distancia){
        
        float autonomia  = this.getQuantidadeCombustivel()/this.getConsulmo();
        
        if(distancia <= autonomia){
            
            float consulmoCorrida = distancia / this.getConsulmo();
            
            this.setQuantidadeCombustivel(this.getQuantidadeCombustivel()-consulmoCorrida);
            
            this.setHodometro(this.getHodometro()+distancia);
            
            JOptionPane.showMessageDialog(null,"Distância percorrida!"+"\n" + 
                    "Kilmometragem do veículo: " + this.getHodometro() + "\n"+
                    "Litros: " + this.getQuantidadeCombustivel());
            
        } else{
            JOptionPane.showMessageDialog(null,"Não há combustivel suficiente!\n" +
                    "\nAutonomia do veículo: " + (int)(autonomia) + " Km\n"+
                    "Litros: " + this.getQuantidadeCombustivel());
        }
        
                
    
    }
}
