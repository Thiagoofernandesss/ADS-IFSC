/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

/**
 *
 * @author Thiago
 */
public class Elevador {
    protected int andarAtual;
    protected int totalAndares;
    protected int capacidade;
    protected int pessoas;

    public Elevador() {
        this.andarAtual = 0;
        this.totalAndares = 10;
        this.capacidade = 8;
        this.pessoas = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public void status(){
        System.out.println("----------------------------------");
        System.out.println("STATUS:");
        System.out.println("Andar: " + this.getAndarAtual());
        System.out.println("Pessoas no elevador: " + this.getPessoas());
        System.out.println("Capacidade do elevador: " + this.getCapacidade());
    }
    
    public void entraPessoa(){
        if (this.getPessoas() < this.getCapacidade()){
            this.setPessoas(this.getPessoas()+1);
            System.out.println("----------------------------------");
            System.out.println("Pessoas no elevador: " + this.getPessoas());
            System.out.println("Capacidade:" + this.getCapacidade());
        }else{
            System.out.println("----------------------------------");
            System.out.println("Elevador cheio!!");
            System.out.println("Pessoas no elevador: " + this.getPessoas());
            System.out.println("Capacidade: " + this.getCapacidade());
        }   
    }
    
    public void saiPessoa(){
        if(this.getPessoas() > 0){
            this.setPessoas(this.getPessoas()-1);
            System.out.println("----------------------------------");
            System.out.println("Pessoas no elevador: " + this.getPessoas());
            System.out.println("Capacidade: " + this.getCapacidade());
        }else{
            System.out.println("----------------------------------");
            System.out.println("Elevador vazio!!");
            System.out.println("Pessoas no elevador: " + this.getPessoas());
            System.out.println("Capacidade: " + this.getCapacidade());
        }
    }
    
    public void sobe(){
        if(this.getAndarAtual()>= this.getTotalAndares()){
            System.out.println("----------------------------------");
            System.out.println("Impossível subir!!");
            System.out.println("Andares: " + this.getTotalAndares());
            System.out.println("Andar atual: " + this.getAndarAtual());
        } else{
            this.setAndarAtual(this.getAndarAtual()+1);
            System.out.println("----------------------------------");
            System.out.println("Andares: " + this.getTotalAndares());
            System.out.println("Andar atual: " + this.getAndarAtual());
        }
    }
    
    public void desce(){
        if(this.getAndarAtual()!= 0){
            this.setAndarAtual(this.getAndarAtual()-1);
            System.out.println("----------------------------------");
            System.out.println("Andares: " + this.getTotalAndares());
            System.out.println("Andar atual: " + this.getAndarAtual());
        }else{
            System.out.println("----------------------------------");
            System.out.println("Impossível descer!!");
            System.out.println("Andar atual: " + this.getAndarAtual());
        }
    }
}