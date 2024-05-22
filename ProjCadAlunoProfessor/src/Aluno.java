
import javax.swing.JOptionPane;

public class Aluno {
    
    public String nome;
    public int idade;
    public int rgm;
    public double vl_mens;
    
    public void Cadastrar(String nm,int id,int rgm,double vl){
        this.nome=nm;
        this.idade=id;
        this.rgm=rgm;
        this.vl_mens=vl;
        JOptionPane.showMessageDialog(null,"Dados Cadastrados com Sucesso !!!");
    }
    
    public void Exibir(){
        JOptionPane.showMessageDialog(null,"Nome: "+this.nome+
                "\nIdade: "+this.idade+"\nRGM: "+this.rgm+"\nValor mensalidade: "+this.vl_mens);
    }
    
}
