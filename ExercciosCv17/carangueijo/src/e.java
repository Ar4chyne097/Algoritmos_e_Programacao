import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int x = leitor.nextInt();

        System.out.println("\n");

        for(int i = 1; i <= 10; i ++){
            System.out.println(x*i);
        }

        leitor.close();
    }   
}
