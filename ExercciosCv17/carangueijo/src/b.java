import java.util.Scanner;

public class b{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        
        int cont = 0;
        int soma = 0;
        int x = leitor.nextInt();

        while (x != 0) {
            x = leitor.nextInt();
            soma += x;
            cont ++;

            if(x == 0){
                cont --;
            }
        }

        System.out.println((soma/cont));

        leitor.close();
    }
}