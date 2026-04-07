import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        int maior, menor;
        Scanner leitor = new Scanner(System.in);

        maior = leitor.nextInt();
        menor = maior;

        for(int i = 1; i < 100; i++){
            int idade = leitor.nextInt();

            if(idade > maior){
                maior = idade;
            }
            
            if(idade < menor){
                menor = idade;
            }
        }

        System.out.println(maior);
        System.out.println(menor);
        leitor.close();
    }
}