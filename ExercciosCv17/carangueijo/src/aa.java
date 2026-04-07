import java.util.Scanner;

public class aa{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        float soma = 0;
        int x = 0;

        while (x != (-1)) {
            x = leitor.nextInt();
        
            cont ++;
            soma += x;
            
            if(x == -1){
                cont -= 1;
                soma += 1;
            }
        }

        System.out.println((soma/cont));
        leitor.close();
    }
}