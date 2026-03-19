import java.util.Scanner;

public class EX_J {
    public static void main(String[] args) {
        int p1,p2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        p1 = sc.nextInt();

        System.out.print("Digite a segunda nota: ");
        p2 = sc.nextInt();

        float mediaP = ((p1*2)+(p2*3))/5;

        System.out.println("A média é: " + mediaP);

        sc.close();
    }
}
