import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float H = 1;
        int n = leitor.nextInt();

        for(float i = 2; i <= n; i++){
            H += (1/i);
        }

        System.out.println(H);
        leitor.close();
    }
}
