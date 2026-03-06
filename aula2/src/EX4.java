import java.util.Scanner;

public class EX4{
    public static void main(String[] args) {
        float deposito, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor que será depositado na poupança:");
        deposito = sc.nextFloat();

        System.out.print("\nO valor depositado após 1 mês tornou-se:"+(deposito+((deposito*0.70)/100)));
    }
}
