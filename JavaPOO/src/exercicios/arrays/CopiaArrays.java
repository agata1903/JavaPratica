package exercicios.arrays;

import java.util.Arrays;

public class CopiaArrays {

    public static void main(String[] args) {

        int[] a = {3,4,5,6,7};
        int[] b = a.clone();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
