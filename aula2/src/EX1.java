import javax.swing.JOptionPane;

public class EX1 {
    public static void main(String[] args){
        
        float km = Float.parseFloat(JOptionPane.showInputDialog(null, "Indique a quilometragem rodada:"));

        float gas = Float.parseFloat(JOptionPane.showInputDialog(null, "Indique a quantidade de gasolina gasta:"));

        JOptionPane.showMessageDialog(null, "A média de gasto de gasolina foi: "+(km/gas));
        
    }
}