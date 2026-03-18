import java.math.*;
import java.util.Scanner;

public class EX_G {
    public static void main(String[] args) {
        double p, r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do perímetro do círculo: ");
        p = sc.nextInt();


        r = (p/(Math.PI * 2));

        System.out.println("O valor do raio é: "+ r);
    }
}
