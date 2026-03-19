import java.util.Scanner;

public class EX_W {
    public static void main(String[] args) {
        int dia1, dia2, mes1, mes2, ano1, ano2;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o dia da primeira data:");
        dia1 = leitor.nextInt();

        System.out.print("Digite o mês da primeira data:");
        mes1 = leitor.nextInt();

        System.out.print("Digite o ano da primeira data:");
        ano1 = leitor.nextInt();

        System.out.print("Digite o dia da segunda data:");
        dia2 = leitor.nextInt();

        System.out.print("Digite o mês da segunda data:");
        mes2 = leitor.nextInt();

        System.out.print("Digite o ano da segunda data:");
        ano2 = leitor.nextInt();

        if(ano1 > ano2){
            System.out.println(dia1+"/"+mes1+"/"+ano1);
        }else if(ano2 > ano1){
            System.out.println(dia2+"/"+mes2+"/"+ano2);
        }else{
            if(mes1 > mes2){
                System.out.println(dia1+"/"+mes1+"/"+ano1);
            }else if(mes2 > mes1){
                System.out.println(dia2+"/"+mes2+"/"+ano1);
            }else{
                if(dia1 > dia2){
                    System.out.println(dia1+"/"+mes1+"/"+ano1);
                }else if(dia2 > dia1){
                    System.out.println(dia2+"/"+mes1+"/"+ano1);
                }else{
                    System.out.println(dia1+"/"+mes1+"/"+ano1);
                }
            }
        }
        leitor.close();
    }
}
