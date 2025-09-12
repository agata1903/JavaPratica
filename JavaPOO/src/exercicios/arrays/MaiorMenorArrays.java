package exercicios.arrays;

public class MaiorMenorArrays {

    public static void main(String[] args) {

        int[] n = {4,6,8,0,9,1,7,4,2,7};

        int maior = n[0];
        int menor = n[0];

        for (int i = 0; i < n.length; i++) {
            if (n[i] > maior) {
                maior = n[i];
            }
            if (n[i] < menor) {
                menor = n[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}
