package vetor.exercícios;

import java.util.Scanner;

public class EX1{
    public static void main(String[] args){
        int[] x = new int[10];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < x.length; i++) {
            System.out.print("Digite um número: ");
            x[i] = leitor.nextInt();
        }

        System.out.println("\n");

        for(int j = x.length - 1; j >= 0; j --){
            System.out.println(x[j]);
        }

        leitor.close();
    }
}