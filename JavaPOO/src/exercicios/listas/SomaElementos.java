package exercicios.listas;

import java.util.Arrays;
import java.util.List;

public class SomaElementos {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5,10,15,20);

        int soma = 0;
        for (Integer i: numeros) {
            soma += i;
        }
        System.out.println(soma);
    }
}
