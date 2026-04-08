import java.util.Scanner;

public class EX_2{
    public static void main(String[] args) {
        int contador = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra, ou uma frase:");
        String txt = leitor.nextLine();

        for(int i = 0; i < txt.length(); i ++){
            char caracter = txt.toLowerCase().charAt(i);

            if(
                caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'|| caracter == 'á' || caracter == 'à' || caracter == 'â' || 
                caracter == 'ã'|| caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú' || caracter == 'ê' || caracter == 'ô' || caracter == 'õ'){
                contador ++;
            }
        }

        System.out.println("A quantidade de vogais no texto fornecido é: "+contador);

        leitor.close();
    }
}
