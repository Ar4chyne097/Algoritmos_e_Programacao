import java.util.Scanner;

public class g {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int x = leitor.nextInt();

        if(x == 0 || x == 1){
            System.out.println(1);
        }else{
            for(int i = x - 1; i != 1; i --){
                x *= i;
            }
            
            System.out.println(x);
        }

        leitor.close();
    }
}
