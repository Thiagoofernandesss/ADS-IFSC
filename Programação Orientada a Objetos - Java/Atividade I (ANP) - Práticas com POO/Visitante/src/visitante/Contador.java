/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitante;

/**
 *
 * @author Thiago
 */
public class Contador {

    protected int homen;
    protected int mulher;
    protected int visitante;
    protected int menorIdade;
    protected float percentHomen;
    protected float percentMulher;

    public Contador() {

    }

    public int getHomen() {
        return homen;
    }

    public int getMulher() {
        return mulher;
    }

    public void setHomen(int homen) {
        this.homen = homen;
    }

    public void setMulher(int mulher) {
        this.mulher = mulher;
    }

    public int getVisitante() {
        return visitante;
    }

    public void setVisitante(int visitante) {
        this.visitante = visitante;
    }

    public int getMenorIdade() {
        return menorIdade;
    }

    public void setMenorIdade(int menorIdade) {
        this.menorIdade = menorIdade;
    }

    public float getPercentHomen() {
        return percentHomen;
    }

    public float getPercentMulher() {
        return percentMulher;
    }

    public void setPercentHomen(float percentHomen) {
        this.percentHomen = percentHomen;
    }

    public void setPercentMulher(float percentMulher) {
        this.percentMulher = percentMulher;
    }

    public void contaSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            this.setHomen(this.getHomen() + 1);
        } else if (sexo == 'F' || sexo == 'f') {
            this.setMulher(this.getMulher() + 1);
        }
    }

    public void contaVisitante() {
        this.setVisitante(this.getVisitante() + 1);
    }

    public void contaMenorIdade(int anoNascimento) {
        if (anoNascimento > 2004) {
            this.setMenorIdade(this.getMenorIdade() + 1);
        }
    }

    public void calculaPercentual(float totalVisitantes, float totalHomens, float totalMulheres) {
        this.setPercentHomen((totalHomens / totalVisitantes) * 100);
        this.setPercentMulher((totalMulheres / totalVisitantes) * 100);
    }

    public void totalSexo() {
        System.out.println("-----------------------------");
        System.out.println("Total de Homens: " + this.getHomen());
        System.out.println("Total de Mulheres: " + this.getMulher());
    }

    public void totalVisitante() {
        System.out.println("-----------------------------");
        System.out.println("Total de visitante: " + this.getVisitante());
    }

    public void totalMenor() {
        System.out.println("-----------------------------");
        System.out.println("Total de menores de idade: " + this.getMenorIdade());
    }

    public void totalPercentual() {
        System.out.println("-----------------------------");
        System.out.println("% de homens: " + this.getPercentHomen());
        System.out.println("% de mulheres: " + this.getPercentMulher());
    }

}
