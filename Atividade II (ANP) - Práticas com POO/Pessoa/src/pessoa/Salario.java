/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Thiago
 */
public class Salario {
    protected float totalSalario;
    protected float mediaSalario;

    public Salario() {
    }

    public float getTotalSalario() {
        return totalSalario;
    }

    public void setTotalSalario(float totalSalario) {
        this.totalSalario = totalSalario;
    }

    public float getMediaSalario() {
        return mediaSalario;
    }

    public void setMediaSalario(float mediaSalario) {
        this.mediaSalario = mediaSalario;
    }
    
    public void atualizaSalarioTotal(float salario){
        this.setTotalSalario(this.getTotalSalario()+salario);
    }
    
    public void atualizaMediaSalario(int totalPessoas){
        this.setMediaSalario(this.getTotalSalario()/totalPessoas);
    }
    
    public void mostraSalarios(){
        System.out.println("--------------------------------");
        System.out.println("Renda total: " + this.getTotalSalario());
        System.out.println("Renda per capita " + this.getMediaSalario());
    }
    
}
