/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitante;

/**
 *
 * @author Thiago
 */
public final class Visitante {

    protected String nome;
    protected String fone;
    protected String cidade;
    protected char sexo;
    protected String profissao;
    protected int anoNascimento;

    public Visitante() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getCidade() {
        return cidade;
    }

    public char getSexo() {
        return sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void status() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Fone: " + this.getFone());
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Profissao: " + this.getProfissao());
        System.out.println("Ano de nascimento: " + this.getAnoNascimento());
    }

}
