/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Aluno {
    //Criando variáveis
    public String nome;
    public char sexo;
    public float altura;
    public float peso;
    public float imc;
    
    //Construtor da Classe
    public Aluno(){
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float Peso) {
        this.peso = Peso;
    }
    
    //Funções
    public float calculaImc(){
        imc= peso/ (altura*altura);
        return imc;
    }
    
    public String mostradados(){
        return nome + " - " + sexo + " - " + 
            altura + " - " + peso + " - " + imc; 
    }    
}
