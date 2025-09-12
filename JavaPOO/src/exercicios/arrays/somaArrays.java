package exercicios.arrays;

public class somaArrays {

    public static void main(String[] args) {

        int[] n = {5,6,8,9,2,4,5,7,8,4};

        int soma = 0;

        for (int i = 0; i < n.length; i++) {
            soma += n[i];
        }

        System.out.println(soma);
    }
}
