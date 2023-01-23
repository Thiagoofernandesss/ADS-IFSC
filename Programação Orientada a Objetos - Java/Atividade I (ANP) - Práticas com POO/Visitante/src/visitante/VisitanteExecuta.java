/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitante;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class VisitanteExecuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contador c1 = new Contador();
        ArrayList cidades = new ArrayList();
        
        //Cria visitante
        Visitante v1 = new Visitante();
        
        //Prenche os dados do visitante
        v1.setNome(JOptionPane.showInputDialog("Nome:"));
        v1.setFone(JOptionPane.showInputDialog("Celular:"));
        v1.setCidade(JOptionPane.showInputDialog("Cidade:"));
        v1.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
        v1.setProfissao(JOptionPane.showInputDialog("Profissão:"));
        v1.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento\n(ex:2001:)")));
        
        //Atualiza contadores
        c1.contaVisitante();
        c1.contaSexo(v1.getSexo());
        c1.contaMenorIdade(v1.getAnoNascimento());
        
        //Conta cidades distintas
        if(!cidades.contains(v1.getCidade())){
            cidades.add(v1.getCidade());
        } 
        
        //Cria visitante
        Visitante v2 = new Visitante();

        //Prenche os dados do visitante
        v2.setNome(JOptionPane.showInputDialog("Nome:"));
        v2.setFone(JOptionPane.showInputDialog("Celular:"));
        v2.setCidade(JOptionPane.showInputDialog("Cidade:"));
        v2.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
        v2.setProfissao(JOptionPane.showInputDialog("Profissão:"));
        v2.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: \n(ex:2001:)")));
        
        //Atualiza contadores
        c1.contaVisitante();
        c1.contaSexo(v2.getSexo());
        c1.contaMenorIdade(v2.getAnoNascimento());
        
        //Conta cidades distintas
        if(!cidades.contains(v2.getCidade())){
            cidades.add(v2.getCidade());
        }
        
        //Cria visitante
        Visitante v3 = new Visitante();

        //Prenche os dados do visitante
        v3.setNome(JOptionPane.showInputDialog("Nome:"));
        v3.setFone(JOptionPane.showInputDialog("Celular:"));
        v3.setCidade(JOptionPane.showInputDialog("Cidade:"));
        v3.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
        v3.setProfissao(JOptionPane.showInputDialog("Profissão:"));
        v3.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: \n(ex:2001:)")));
        
        //Atualiza contadores
        c1.contaVisitante();
        c1.contaSexo(v3.getSexo());
        c1.contaMenorIdade(v3.getAnoNascimento());
        
        //Conta cidades distintas
        if(!cidades.contains(v3.getCidade())){
            cidades.add(v3.getCidade());
        }
        
        //Cria visitante
        Visitante v4 = new Visitante();

        //Prenche os dados do visitante
        v4.setNome(JOptionPane.showInputDialog("Nome:"));
        v4.setFone(JOptionPane.showInputDialog("Celular:"));
        v4.setCidade(JOptionPane.showInputDialog("Cidade:"));
        v4.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
        v4.setProfissao(JOptionPane.showInputDialog("Profissão:"));
        v4.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: \n(ex:2001:)")));
        
        //Atualiza contadores
        c1.contaVisitante();
        c1.contaSexo(v4.getSexo());
        c1.contaMenorIdade(v4.getAnoNascimento());
        
        //Conta cidades distintas
        if(!cidades.contains(v4.getCidade())){
            cidades.add(v4.getCidade());
        }
        
        //Cria visitante
        Visitante v5 = new Visitante();

        //Prenche os dados do visitante
        v5.setNome(JOptionPane.showInputDialog("Nome:"));
        v5.setFone(JOptionPane.showInputDialog("Celular:"));
        v5.setCidade(JOptionPane.showInputDialog("Cidade:"));
        v5.setSexo(JOptionPane.showInputDialog("Sexo F/M:").charAt(0));
        v5.setProfissao(JOptionPane.showInputDialog("Profissão:"));
        v5.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: \n(ex:2001:)")));
        
        //Atualiza contadores
        c1.contaVisitante();
        c1.contaSexo(v5.getSexo());
        c1.contaMenorIdade(v5.getAnoNascimento());
        
        //Conta cidades distintas
        if(!cidades.contains(v5.getCidade())){
            cidades.add(v5.getCidade());
        }
        
        
        
        //--------------------------------------------------------------------//
        
        //Calcula percentual
        c1.calculaPercentual(c1.getVisitante(),c1.getHomen(),c1.getMulher());
        
        //Mostra dados:
        c1.totalVisitante();
        c1.totalSexo();
        c1.totalPercentual();
        c1.totalMenor();
        System.out.println("-----------------------------");    
        System.out.println("Cidades:" + cidades.size());
    }
    
}
