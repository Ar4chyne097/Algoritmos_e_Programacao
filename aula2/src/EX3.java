import java.util.Scanner;

public class EX3{
    public static void main(String[] args) {
        float dólar, real, cotação;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o montante em reais:");
        real = sc.nextFloat();

        System.out.print("Digite a cotação do dólar:");
        cotação = sc.nextFloat();

        dólar = (real * cotação);

        System.out.println("O montante em reais em dólares usando a cotação fornecida é: "+dólar);
    }
}
