import java.util.Scanner;

public class EX_A {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro algarismo: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo algarismo: ");
        b = sc.nextInt();

        System.out.print("Digite o terceiro algarismo: ");
        c = sc.nextInt();

        System.out.println("O resultado do produto:" + (a*b*c));

        sc.close();
    }
}