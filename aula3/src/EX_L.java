import java.util.Scanner;

public class EX_L{
    public static void main(String[] args) {
        int nascimento, anoAtual;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu:");
        nascimento = sc.nextInt();

        System.out.print("Digite o ano atual:");
        anoAtual = sc.nextInt();

        System.out.println("Sua idade é de "+ (anoAtual-nascimento) + " anos");
    }
}
