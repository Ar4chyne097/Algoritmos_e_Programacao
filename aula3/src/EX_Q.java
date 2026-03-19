import java.util.Scanner;

public class EX_Q {
    public static void main(String[] args) {
        int a;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        a = leitor.nextInt();

        if(a % 2 == 0){
            System.out.println(a + "é par.");
        }else{
            System.out.println(a + "é ímpar.");
        }
        
        leitor.close();   
    }
}
