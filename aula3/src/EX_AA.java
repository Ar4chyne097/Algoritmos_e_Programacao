import java.util.Scanner;

public class EX_AA {
    public static void main(String[] args) {
        float p1, p2, t1, t2, t3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        p1 = sc.nextFloat();

        System.out.print("Digite a nota da segunda prova: ");
        p2 = sc.nextFloat();

        System.out.print("Digite a nota do primeiro trabalho: ");
        t1 = sc.nextFloat();

        System.out.print("Digite a nota do segundo trabalho: ");
        t2 = sc.nextFloat();

        System.out.print("Digite a nota do terceiro trabalho: ");
        t3 = sc.nextFloat();

        float média = (p1+p2+t1+t2+t3)/5;

        if(média >= 6.0){
            System.out.println("Aprovado(a).");
        }else if(média >= 4 || média <= 5.99){
            System.out.println("Exame.");
        }else{
            System.out.println("Reprovado(a).");
        }

        sc.close();
    }
}
