import java.util.Scanner;

public class EX_X {
    public static void main(String[] args) {
        String nome1, nome2;
        int dia1, dia2, mes1, mes2, ano1, ano2;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa");
        nome1 = leitor.next();

        System.out.print("Digite o dia de nascimento dela:");
        dia1 = leitor.nextInt();

        System.out.print("Digite o mês de nascimento dela:");
        mes1 = leitor.nextInt();

        System.out.print("Digite o ano de nascimento dela:");
        ano1 = leitor.nextInt();

        System.out.print("Digite o nome da segunda pessoa");
        nome2 = leitor.next();

        System.out.print("Digite o dia de nascimento dela:");
        dia2 = leitor.nextInt();

        System.out.print("Digite o mês de nascimento dela:");
        mes2 = leitor.nextInt();

        System.out.print("Digite o ano de nascimento dela:");
        ano2 = leitor.nextInt();

        

        if(ano1 < ano2){
            System.out.println("A "+ nome1+ " é mais pessoa velha.");
        }else if(ano2 < ano1){
            System.out.println("A "+ nome2+ " é mais pessoa velha.");
        }else{
            if(mes1 < mes2){
                System.out.println("A "+ nome1+ " é mais pessoa velha.");
            }else if(mes2 < mes1){
                System.out.println("A "+ nome2+ " é mais pessoa velha.");
            }else{
                if(dia1 < dia2){
                    System.out.println("A "+ nome1+ " é mais pessoa velha.");
                }else if(dia2 < dia1){
                    System.out.println("A "+ nome2+ " é mais pessoa velha.");
                }else{
                    System.out.println("As duas tem a mesma idade.");
                }
            }
        }

        leitor.close();
    }
}

/*

import java.time.*;
import java.time.temporal.ChronoUnit;

LocalDate hoje = LocalDate.now();
LocalDate aniversario = LocalDate.of(ano1, mes1, dia1);

System.out.println(
    "A primeira data é mais velha, tendo hoje "+(ChronoUnit.YEARS.between(aniversario, hoje)) + " anos," + (ChronoUnit.MONTHS.between(aniversario, hoje) + " meses" + " e " + ChronoUnit.DAYS.between(aniversario, hoje) + " dias.")
);

*/