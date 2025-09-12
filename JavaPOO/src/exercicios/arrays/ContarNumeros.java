package exercicios.arrays;

import java.util.Arrays;

public class ContarNumeros {

    public static void main(String[] args) {

        int[] n = {2,4,6,8,9,5,1,0,4};


        int[] pares = new int[0];
        int[] impares = new int[0];

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                pares = new int[]{n[i]};
            }
            if (n[i] % 2 == 1) {
                impares = new int[]{n[i]};
            }
        }
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
