import java.util.Scanner;

public class EX_B {
    public static void main(String[] args) {
        int p1,p2,p3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        p1 = sc.nextInt();

        System.out.print("Digite a nota da primeira prova: ");
        p2 = sc.nextInt();

        System.out.print("Digite a nota da primeira prova: ");
        p3 = sc.nextInt();

        float mediaP = ((p1*3)+(p2*3)+(p3*4))/10;

        System.out.println("A média é: " + mediaP);
    }
}
