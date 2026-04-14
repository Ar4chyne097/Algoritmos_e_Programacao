package vetor.exercícios;

import java.util.Scanner;

public class EX2{
    public static void main(String[] args) {
        float soma = 0;
        float[] x = new float[20];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < x.length; i++) {
            System.out.print("Digite um número: ");
            x[i] = leitor.nextInt();
            soma += x[i];
        }

        float média = (soma/x.length);

        for(int j = x.length - 1; j >= 0; j --){
            if((float) x[j] < média){
                System.out.println(x[j]);
            }
        }

        leitor.close();
    }
}
