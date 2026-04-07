import java.util.Scanner;

public class EX_P {
    public static void main(String[] args) {
        float a,b;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        a = leitor.nextFloat();

        System.out.print("Digite outro número real: ");
        b = leitor.nextFloat();

        if(a < b){
            System.out.println("O menor número inserido fora: "+ a);
        }else if(a == b){
            System.out.println("Os dois números apresentados são iguais.");
        }else{
            System.out.println("O menor número inserido fora: "+ b);
        }
        
        leitor.close();
    }
}
