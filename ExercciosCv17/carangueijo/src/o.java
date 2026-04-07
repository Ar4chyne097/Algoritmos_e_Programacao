import java.util.Scanner;

public class o{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int maior = x;

        while (x != 0) {
            x = leitor.nextInt();
        
            if(x > maior){
                maior = x;
            }
        }

        System.out.println(maior);
        leitor.close();
    }
}