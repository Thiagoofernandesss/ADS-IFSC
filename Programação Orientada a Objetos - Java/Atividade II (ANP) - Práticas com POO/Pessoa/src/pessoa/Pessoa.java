/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Thiago
 */
public final class Pessoa {

    private String nome;
    private int anoNascimento;
    private char sexo;
    private float peso;
    private float altua;
    private float salario;

    public Pessoa() {
        
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltua() {
        return altua;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltua(float altua) {
        this.altua = altua;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void mostraPessoa() {
        System.out.println("--------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano de nascimento: " + this.getAnoNascimento());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Altura: " + this.getAltua());
        System.out.println("Salário " + this.getSalario());
    }

    public void calculaIdade(int anoNascimento) {
        int idade = 2022 - anoNascimento;
        System.out.println("Idade: " + idade);
    }

    public void calculaImc(float peso, float altura) {
        float imc = (peso / (altura * altura));
        System.out.println("Imc: " + Math.floor(imc));
    }

}
