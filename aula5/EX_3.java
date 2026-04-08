import java.util.Scanner;

public class EX_3{
    public static void main(String[] args) {
        StringBuilder fraseReversa = new StringBuilder();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra, ou uma frase:");
        String txt = leitor.nextLine();

        for(int i = txt.length() - 1; i >= 0; i --){
            fraseReversa.append(txt.charAt(i));
        }

        System.out.println("A frase fornecida ao contrário fica mais ou menos assim:"+ fraseReversa);

        leitor.close();
    }
}
