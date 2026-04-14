package vetor;

public class dasghjk{
    public static void main(String[] args) {
        float soma = 0;
        int i = 0;
        int[] x = {1,10,2,2,5,7,1,10,8,3};

        while(i != x.length){
            soma += x[i];

            i++;
        }

        float média = (soma/(x.length));

        for (int j = 0; j < x.length; j++) {
            if(x[j] < média){
                System.out.println(x[j]);
            }
        }
    }
}