/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacao;

/**
 *
 * @author Thiago
 */
public class Operaçoes {
    private float numero1;
    private float numero2;
    private float soma;
    private float divisao;
    private float multiplicacao;
    

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public void soma(){
        soma = numero1+numero2;
    }
    
    public void divisao(){
        divisao=numero1/numero2;
    }
    
    public void mutiplicacao(){
        multiplicacao=numero1*numero2;
    }
    
    
    public String imprimeResultado(){
        return "Soma: "+ soma +"\nDivisão: "+ divisao +
                "\nMultiplicação: "+multiplicacao;
    }
    
    
    
}



