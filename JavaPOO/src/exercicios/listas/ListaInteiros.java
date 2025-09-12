package exercicios.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaInteiros {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        numeros.set(2, 99);

        for (Integer l: numeros) {
            System.out.println(l);
        }
    }
}
