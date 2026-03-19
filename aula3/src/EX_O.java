import java.util.Scanner;

public class EX_O {
    public static void main(String[] args) {
        int a,b;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        a = leitor.nextInt();

        System.out.print("Digite outro número inteiro: ");
        b = leitor.nextInt();

        if(a > b){
            System.out.println("O maior número inserido fora: "+ a);
        }else if(a == b){
            System.out.println("Os dois números apresentados são iguais.");
        }else{
            System.out.println("O maior número inserido fora: "+ b);
        }
        
        leitor.close();
    }   
}