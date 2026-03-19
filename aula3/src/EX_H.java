import java.util.Scanner;

public class EX_H {
    public static void main(String[] args) {
        float km, gasolina;
        Scanner sc = new Scanner(System.in);

        System.out.print("Distância em quilômetros: ");
        km = sc.nextFloat();

        System.out.print("Quantidade de combustível gasto: ");
        gasolina = sc.nextFloat();

        System.out.println("A média do consumo é: "+ (gasolina/km));

        sc.close();
    }
}
