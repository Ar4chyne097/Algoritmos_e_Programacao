import java.util.Scanner;

public class EX_Y {
    public static void main(String[] args) {
        int cilindradas;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantas cilindradas tem a moto: ");
        cilindradas = leitor.nextInt();

        if(cilindradas >= 0 || cilindradas <= 120){
            System.out.println("Tipo: Subprodução");
        }else if(cilindradas >= 121 || cilindradas <=240){
            System.out.println("Tipo: Produção");
        }else{
            System.out.println("Superprodução");
        }
        
        leitor.close();
    }
}
