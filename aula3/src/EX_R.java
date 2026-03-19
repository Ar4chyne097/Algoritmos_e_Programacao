import java.util.Scanner;

public class EX_R {
    public static void main(String[] args) {
        int a,b,c;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        a = leitor.nextInt();

        System.out.print("Digite outro número: ");
        b = leitor.nextInt();

        System.out.print("Digite mais um número: ");
        c = leitor.nextInt();

        if(a < b){
            if(a < c){
                if(b < c){
                    System.out.println(a+","+b+","+c);
                }else{
                    System.out.println(a+","+c+","+b);
                }
            }
        }else if(b < c){
            if(b < a){
                if(a < c){
                    System.out.println(b+","+a+","+c);
                }else{
                    System.out.println(b+","+c+","+a);
                }
            }
        }else if(c < a){
            if(c < b){
                if(a < b){
                    System.out.println(c+","+a+","+b);
                }else{
                    System.out.println(c+","+b+","+a);
                }
            }
        }
        
        leitor.close();
    }
}