import java.util.Scanner;

public class EX_Z {
    public static void main(String[] args) {
        int anos;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantas anos tens: ");
        anos = leitor.nextInt();

        if(anos >= 0 || anos <= 10){
            System.out.println("Nadador Tipo: Infantil");
        }else if(anos >= 11 || anos <= 14){
            System.out.println("Nadador Tipo: Júnior");
        }else if(anos >= 15 || anos <= 20){
            System.out.println("Nadador Tipo: Adolescente");
        }else if(anos >= 21 || anos <= 35){
            System.out.println("Nadador Tipo: Jovem");
        }else{
            System.out.println("Nadador Tipo: Mestre");
        }
        
        leitor.close();
    }
}
