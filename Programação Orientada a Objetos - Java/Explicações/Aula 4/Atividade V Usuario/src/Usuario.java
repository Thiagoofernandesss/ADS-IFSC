
public class Usuario {
    public String nome;
    public char sexo;
    public int nFilhos;
    public float valorRecebe;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setnFilhos(int nFilhos) {
        this.nFilhos = nFilhos;
    }
    
    public float calculaValor(){
        valorRecebe=(float)nFilhos *(float) 26.50;
        return valorRecebe;                
    }
    
    public String mostraValor(){
        return "Nome: "+ nome + "\nSexo: "+ sexo + 
                "\nValor a receber: " + valorRecebe;
    }
    
    
}
