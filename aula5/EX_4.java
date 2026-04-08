import java.util.Scanner;

public class EX_4{
    public static void main(String[] args) {
        String fraseReversa = "";
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra:");
        String txt = leitor.nextLine();

        for(int i = txt.length() - 1; i >= 0; i --){
            fraseReversa += txt.charAt(i);
        }

        if(txt.toLowerCase().equals(fraseReversa.toLowerCase())){
            System.out.println("A palavra fornecida é um palíndromo");   
        }else{
            System.out.println("A palavra fornecida não é um palíndromo");   
        }

        leitor.close();
    }
}