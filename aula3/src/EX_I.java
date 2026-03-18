import java.util.Scanner;

public class EX_I {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu:");
        idade = sc.nextInt();

        System.out.println("Sua idade em 2100 será: "+ (2100-idade));
    }
}
