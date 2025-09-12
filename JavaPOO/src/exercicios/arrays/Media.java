package exercicios.arrays;

import java.util.Arrays;

public class Media {

    public static void main(String[] args) {

        int[] n = {3,4,7,6,3,1};

        int soma = 0;
        for (int i = 0; i < n.length; i++){
            soma += n[i];
        }

        System.out.println(soma);
        System.out.println("Média: " + soma/n.length);
    }
}
