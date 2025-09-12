package exercicios.sets;

import java.util.*;

public class Avancado {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 1, 6);

        Set<Integer> numerosUnicos = new HashSet<>(numeros);

        System.out.println(numerosUnicos);
    }
}
