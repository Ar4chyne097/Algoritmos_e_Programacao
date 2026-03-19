import java.util.Scanner;

public class EX_V {
    public static void main(String[] args) {
        float a,b,c;
        Scanner leitor = new Scanner(System.in, "UTF-8");

        System.out.print("Informe o valor de A: ");
        a = leitor.nextFloat();

        System.out.print("Informe o valor de B: ");
        b = leitor.nextFloat();

        System.out.print("Informe o valor de C: ");
        c = leitor.nextFloat();

        if(a != 0.0){
            float Δελτα = (b*b) - (4*a*c);
            System.out.println("O valor de Δελτα é: " + Δελτα);
        }else{
            System.out.println("¡ERROR! Inténtalo de nuevo.");
        }

        leitor.close();
    }
}
