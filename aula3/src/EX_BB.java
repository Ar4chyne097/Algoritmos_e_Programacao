import java.util.Scanner;

public class EX_BB {
    public static void main(String[] args) {
        String sexo;
        float tempo, salario;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu sexo(F/M): ");
        sexo = leitor.next();

        System.out.println("Digite o tempo de casa:");
        tempo = leitor.nextFloat();

        System.out.println("Digite o seu salário:");
        salario = leitor.nextFloat();

        if(sexo.toUpperCase().equals("M") && tempo >= 15){
            System.out.println("Seu salário com o adicional do bônus ficou: R$"+(salario*1.20));
        }else if(sexo.toUpperCase().equals("F") && tempo >= 10){
            System.out.println("Seu salário com o adicional do bônus ficou: R$"+(salario*1.20));
        }else{
            System.out.println("Seu salário com o adicional do bônus ficou: R$"+(salario+200));
        }

        leitor.close();
    }
}
