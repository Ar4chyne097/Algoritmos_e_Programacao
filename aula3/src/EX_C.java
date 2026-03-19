import java.util.Scanner;

public class EX_C {
    public static void main(String[] args) {
        int salario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        salario = sc.nextInt();
        
        System.out.println("Após um aumento de 25%, o novo valor é:"+ (salario*1.25));

        sc.close();
    }    
}