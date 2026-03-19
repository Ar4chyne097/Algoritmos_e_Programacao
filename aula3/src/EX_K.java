import java.util.Scanner;

public class EX_K {
    public static void main(String[] args) {
        float salario, totVendas;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        salario = sc.nextFloat();

        System.out.print("Digite o total de vendas realizadas: ");
        totVendas = sc.nextFloat();

        float nSalario = (salario) + ((totVendas*4)/100);

        System.out.print("Seu salário com o acresimo da comissão é: " + nSalario);

        sc.close();
    }    
}
