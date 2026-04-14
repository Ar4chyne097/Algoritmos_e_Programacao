import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float n1,n2,n3, média;

        System.out.print("Digite a Primeira Nota:");
        n1 = sc.nextFloat();
        
        System.out.print("Digite a Segunda Nota:");
        n2 = sc.nextFloat();

        System.out.print("Digite a Terceira Nota:");
        n3 = sc.nextFloat();

        média = ((n1*3)+(n2*3)+(n3*4))/10;

        if(média >= 7.0){
            System.out.println("Sua média foi: "+média + "\nAprovado!");
        }else{
            System.out.println("Sua média foi: "+média + "\nReprovado!");
        }

        sc.close();
    }
}