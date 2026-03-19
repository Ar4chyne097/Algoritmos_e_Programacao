import java.util.Scanner;

public class EX_U {
    public static void main(String[] args) {
        float a1, a2, a3;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Indique o valor da primeira aresta do triângulo:");
        a1 = leitor.nextFloat();

        System.out.print("Indique o valor da primeira aresta do triângulo:");
        a2 = leitor.nextFloat();

        System.out.print("Indique o valor da primeira aresta do triângulo:");
        a3 = leitor.nextFloat();

        if(a1 > (a2+a3) || a2 > (a1+a3) || a3 > (a2+a1)){
            System.out.println("ERRO! Esse triângulo não existe");
        }else{
            if(a1 == a2 && a1 == a3){
                System.out.println("O triângulo com as arestas fornecidas é equilátero.");
            }else if(a1 == a2 || a1 == a3 || a2 == a3){
                System.out.println("O triângulo com as arestas fornecidas é isósceles.");
            }else{
                System.out.println("O triângulo com as arestas fornecidas é escaleno.");
            }
        }

        leitor.close();
    }
}
