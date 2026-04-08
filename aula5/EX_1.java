import java.util.Scanner;

public class EX_1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra, ou uma frase:");
        String txt = leitor.nextLine();

        System.out.println("O texto fornecido contém " +txt.length()+ " letras.");
        System.out.println("Sendo a primeira letra:\"" +txt.toUpperCase().charAt(0)+ "\"");
        System.out.println("E a última: \"" +txt.toUpperCase().charAt(txt.length()-1)+ "\"");
        System.out.println("O texto fornecido em letras minúsculas fica: "+txt.toLowerCase());
        System.out.println("O texto fornecido em letras maisculas fica: "+txt.toUpperCase());

        leitor.close();
    }
}