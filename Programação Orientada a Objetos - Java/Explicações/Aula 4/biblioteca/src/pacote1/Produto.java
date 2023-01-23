
package pacote1;

/**
 * Atividade Métodos sem Retorno
 **/
public class Produto {
    private String descricao;
    private String un;
    private float quantidade;
    private float quantidadeEstoque;
    private float v_unitario;
    private float subtotal;
    
    //Definindo valores para algumas variáveis
    public Produto(){
        this.descricao = "Salsicha";
        this.un=" Pacote";
        this.subtotal=0;
        this.quantidadeEstoque=100;
    }
    
    //Setando informações que vão ser solicitadas

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public void setV_unitario(float v_unitario) {
        this.v_unitario = v_unitario;
    }
    
    //Funções
    public void calculaSubtotal(){
        this.subtotal= this.quantidade*this.v_unitario;
    }
    
    @Override
    public String toString(){
        return "Produto:" + "descricao=" + descricao + 
                ", un=" + un + ", Saldo=" + quantidade + 
                ", v_unit=" + v_unitario + ", subtotal=" + 
                subtotal + '}';
    }
    
    public String retornaDescricao(){
        return this.descricao;
    }
    
    public float realizaVenda(){
        if(quantidadeEstoque<quantidade){
            System.out.println("Sem quantidade para essa compra");
            System.out.println("Quantidade disponível:"+quantidadeEstoque);
            return -1;
        } else{
            System.out.println("Venda realizada!");
            quantidadeEstoque = quantidadeEstoque - quantidade;
            System.out.println("Saldo em estoque: "+ quantidadeEstoque); 
            return 0;
        }  
    }
    
  public void reajustaSaldo( float percenntual){
      this.quantidade = this.quantidade + (this.quantidade *(percenntual/100));
      
  }
    
    
}
