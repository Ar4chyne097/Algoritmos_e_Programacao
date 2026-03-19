import java.util.Scanner;

public class EX_S {
    public static void main(String[] args) {
        float a, b;
        String operacao;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número inteiro:");
        a = leitor.nextFloat();

        System.out.print("Insira outro número inteiro:");
        b = leitor.nextFloat();

        System.out.print("Digite uma operação(+,-,*,/): ");
        operacao = leitor.next();

        switch (operacao) {
            case "+":
                System.out.println(a+b);
                break;
        
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("¡ERROR! Inténtalo de nuevo.");

            leitor.close();
        }
    }
}
