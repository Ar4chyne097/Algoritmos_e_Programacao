import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        System.err.println("-----------------------");
        System.err.println("| JOGO DOS PALITINHOS |");
        System.err.println("-----------------------");

        int qntdPC = 3;
        int qntdPJ = 3;
        int qntdPJEsconde = 0;
        int qntdPCEsconde = 0;
        int qntdPalpiteJogador = 0;
        int qntdPalpiteComputador = 0;

        while (qntdPC > 0 || qntdPJ > 0){
            System.out.print("\n");
            System.out.print("Quantos palitos você vai separar:");
            qntdPJEsconde = leitor.nextInt();

            System.out.print("Quantos seu palpite:");
            qntdPalpiteJogador = leitor.nextInt();

            System.out.println("Quantidade escolhida pelo JOGADOR:"+ qntdPJEsconde);
            System.out.println("Palpite do JOGADOR:"+ qntdPalpiteJogador);

            qntdPCEsconde = (int)(Math.random() * 10) % (qntdPC+1);
            qntdPalpiteComputador = qntdPCEsconde + ((int)(Math.random() * 10) % (qntdPC+1));

            System.out.println("Quantidade escolhida pelo COMPUTADOR:"+qntdPCEsconde);
            System.out.println("Palpite do COMPUTADOR:"+qntdPalpiteComputador);

            if(qntdPalpiteJogador == qntdPJEsconde + qntdPJEsconde){
                System.out.println("Você acertou");
                qntdPJ --;
            }else if(qntdPalpiteComputador == qntdPJEsconde + qntdPJEsconde){
                qntdPC --;
            }else{
                System.out.println("Ninguém acertou");
            }
        }

        if(qntdPJ == 0){
            System.out.println("Você venceu!!!");
        }else if(qntdPC == 0){
            System.out.println("Computador venceu!!!");
        }else{
            System.out.println("Obrigado por jogar!!!");
        }

        leitor.close();
    }
}