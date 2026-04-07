import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        int maior = 0;
        Scanner leitor = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        int canal = leitor.nextInt();
        

        while(canal != 0){
            canal = leitor.nextInt();

            if(canal == 4){
                c1 ++;
            }

            if(canal == 5){
                c2 ++;
            }

            if(canal == 9){
                c3 ++;
            }

            if(c1 > c2){
                if(c1 > c3){
                    maior = 4;
                }else{
                    maior = 9;
                }
            }else{
                if(c2 > c3){
                    maior = 5;
                }else{
                    maior = 9;
                }
            }
        }

        System.out.println("canal " + maior + " é o maior.");
        leitor.close();
    }
}
