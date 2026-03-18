import java.util.Scanner;

public class EX_F {
    public static void main(String[] args) {
        int b,h;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        b = sc.nextInt();

        System.out.print("Digite o valor da altura: ");
        h = sc.nextInt();
        
        
        System.out.println("O valor da área do retângulo "+ (b*h)/2);
    }    
}