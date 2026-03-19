import java.util.Scanner;

public class EX_N{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu sexo(F/M): ");
        String sexo = leitor.nextLine();

        System.out.print("Digite sua altura em metros: ");
        double altura = leitor.nextDouble();

        if(sexo.equals( "F")){
            System.out.println("Seu peso ideal é: "+ (72.7 * altura - 58));
        }else if(sexo != "F"){
            System.out.println("Seu peso ideal é: "+ (62.7 * altura - 44.7));
        }

        leitor.close();
    }
}