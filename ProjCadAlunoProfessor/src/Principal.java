
import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        String nome=JOptionPane.showInputDialog("Digite o nome do aluno");
        int idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        int rgm=Integer.parseInt(JOptionPane.showInputDialog("Digite o rgm"));
        double valor=Double.parseDouble(JOptionPane.showInputDialog("Valor da Mensalidade: "));
        // criando a instancia aluno para a classe Aluno
        Aluno aluno = new Aluno();
        // a instancia chama o método passando os valores;
        aluno.Cadastrar(nome, idade, rgm, valor);
        aluno.Exibir();
    }
    
}
