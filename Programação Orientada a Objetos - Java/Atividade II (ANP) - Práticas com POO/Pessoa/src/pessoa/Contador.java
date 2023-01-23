/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Thiago
 */
public class Contador {
    protected int cadastros;
    protected int totalHomens;
    protected int totalMulheres;
    
    public Contador() {
    }

    public int getCadastros() {
        return cadastros;
    }

    public void setCadastros(int cadastros) {
        this.cadastros = cadastros;
    }

    public int getTotalHomens() {
        return totalHomens;
    }

    public int getTotalMulheres() {
        return totalMulheres;
    }

    public void setTotalHomens(int totalHomens) {
        this.totalHomens = totalHomens;
    }

    public void setTotalMulheres(int totalMulheres) {
        this.totalMulheres = totalMulheres;
    }
    
    public void contaCadastro(){
        this.setCadastros(this.getCadastros()+1);
    }
    
    public void contaSexo(char sexo){
        if(sexo=='M' || sexo=='m'){            
            this.setTotalHomens(this.getTotalHomens()+1);
        }else if(sexo=='F' || sexo=='f'){
            this.setTotalMulheres(this.getTotalMulheres()+1);
        }
    }
    
    public void totalCastro(){
        System.out.println("--------------------------------");
        System.out.println("Total de cadastros: " + this.getCadastros());
    }
    
    public void totalSexo(){
        System.out.println("--------------------------------");
        System.out.println("Total de Homens: " + this.getTotalHomens());
        System.out.println("Total de mulheres: " + this.getTotalMulheres());
    }
    
    
}
