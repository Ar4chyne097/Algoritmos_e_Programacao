import java.util.Scanner;

public class EX_D {
    public static void main(String[] args) {
        int salario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        salario = sc.nextInt();

        float nSalario = salario + ((salario*5)/100) - ((salario*7)/100);
        
        System.out.println("Após um aumento de 5% e um diminuto de 7% de impostos, o novo valor é: "+ nSalario);

        sc.close();
    }    
}