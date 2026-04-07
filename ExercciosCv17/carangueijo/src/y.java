public class y {
    public static void main(String[] args) {
        int i = 1;
        float A = 10000;
        float B = 5000;

        while(B < A){
            A += 100;
            B += 300;

            System.out.println("No mês "+ i +" a diferença das fortunas de A, com R$"+A+", e B, com R$"+B+" é igual à: "+(A-B));
            i++;
        }
    }
}
