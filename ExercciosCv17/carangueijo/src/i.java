import java.lang.Math;
import java.util.Scanner;

public class i {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int m = leitor.nextInt();
        int resultado = (int) Math.pow(n, m);

        System.out.println(resultado);

        leitor.close();
    }
}
