import java.util.Scanner;

public class EX_5{
    public static void main(String[] args) {
        boolean v1 = false;
        boolean v2 = false;
        boolean v3 = false;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma senha:");
        String senha = leitor.nextLine();

        String letras = "abcdefghijklmnopqrstuvwxyzáàâãéêíóôõú";

        while(v1 != true && v2 != true && v3 != true){
            if(senha.length() < 8){
                System.out.println("ERRO! A senha precisa conter pelo menos 8 digitos. Tente novamente. \n");

                System.out.print("Digite uma senha:");
                senha = leitor.nextLine();
            }else{
                v1 = true;
            }

            for (int i = 0; i < senha.length() ; i++) {
                if(senha.charAt(i) != senha.indexOf(letras)){
                    System.out.println("ERRO! A senha precisa conter pelo menos uma letra minúscula. Tente novamente. \n");

                    System.out.print("Digite uma senha:");
                    senha = leitor.nextLine();
                }else{
                    v2 = true;
                }
            }

            for (int i = 0; i < senha.length() ; i++) {
                if(senha.charAt(i) != senha.indexOf(letras.toUpperCase())){
                    System.out.println("ERRO! A senha precisa conter pelo menos uma letra maiúscula. Tente novamente. \n");

                    System.out.print("Digite uma senha:");
                    senha = leitor.nextLine();
                }else{
                    v2 = true;
                }
            }
        }


        System.out.println("A senha fornecida é válida!");
        leitor.close();
    }
}