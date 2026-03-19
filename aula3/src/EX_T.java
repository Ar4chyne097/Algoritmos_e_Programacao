import java.util.Scanner;

public class EX_T {
    public static void main(String[] args) {
        float b1, b2, b3, h1, h2, h3, a1, a2, a3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base do primeiro triângulo: ");
        b1 = sc.nextFloat();

        System.out.print("Digite o valor da base do primeiro triângulo: ");
        h1 = sc.nextFloat();

        System.out.print("Digite o valor da base do segundo triângulo: ");
        b2 = sc.nextFloat();

        System.out.print("Digite o valor da base do segundo triângulo: ");
        h2 = sc.nextFloat();

        System.out.print("Digite o valor da base do terceiro triângulo: ");
        b3 = sc.nextFloat();

        System.out.print("Digite o valor da base do terceiro triângulo: ");
        h3 = sc.nextFloat();

        a1 = (b1*h1)/2;
        a2 = (b2*h2)/2;
        a3 = (b3*h3)/2;

        if(a1 > a2 && a1 > a3){
            System.out.println("O triângulo com a maior área tem o valor de: "+a1);
        }else if(a2 > a1 && a2 > a3){
            System.out.println("O triângulo com a maior área tem o valor de: "+a2);
        }else if(a3 > a1 && a3 > a2){
            System.out.println("O triângulo com a maior área tem o valor de: "+a3);
        }

        sc.close();
    }
}
