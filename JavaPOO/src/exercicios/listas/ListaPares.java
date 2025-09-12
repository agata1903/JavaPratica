package exercicios.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaPares {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> pares = new ArrayList<>();

        for (Integer n: numeros) {
            if (n % 2 == 0) {
                pares.add(n);
            }
        }
        System.out.println(pares);

    }
}
