import java.util.Scanner;

public class EX_M {
    public static void main(String[] args) {
        float n1, n2, média;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = leitor.nextFloat();

        System.out.print("Digite a segunda nota: ");
        n2 = leitor.nextFloat();

        média = (n1+n2)/2;

        if(média > 6.0){
            System.out.println("Aprovado(a)!");
        }else{
            System.out.println("Reprovado(a)!");;
        }

        leitor.close();
    }
}