package vetor.exercícios;

import java.util.Scanner;

public class EX4{
    public static void main(String[] args){
        int[] num = new int[5];
        String[] nome = new String[5];
        String[] sigla = new String[5];
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 5; i ++){
            System.out.print("Digite o número do candidato: ");
            num[i] = leitor.nextInt();
        }

        for(int i = 0; i < 5; i ++){
            System.out.print("Digite a sigla do partido do candidato: ");
            sigla[i] = leitor.next();
        }

        for(int i = 0; i < 5; i ++){
            System.out.print("Digite o nome do candidato: ");
            nome[i] = leitor.next();
        }

        leitor.close();

        boolean indicador = false;
        int x = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;

        while (indicador != true) {
            x = leitor.nextInt();

            if(x == num[0]){
                c1 ++;
            }else if(x == num[1]){
                c2 ++;
            }else if(x == num[2]){
                c3 ++;
            }else if(x == num[3]){
                c4 ++;
            }else if(x == num[4]){
                c5 ++;
            }
        }   
    }
}
