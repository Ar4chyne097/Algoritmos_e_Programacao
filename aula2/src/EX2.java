import javax.swing.JOptionPane;

public class EX2{
    public static void main(String[] args){
        String nome;
        float salário, totVendas;

        nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
        salário = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu salário mensal:"));
        totVendas = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o montante das vendas do mês:"));

        float dinheiroFinal = salário + ((totVendas*15)/100);

        JOptionPane.showMessageDialog(null, "Senhor(a) "+nome + ", o seu salário final é: R$"+dinheiroFinal);
    }
}
