package exercicios.listas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoverDuplicatas {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,5,7,8,9,3,2);

        Set<Integer> numSemRepetir = new HashSet<>(numeros);

        List<Set<Integer>> novaLista = Arrays.asList(numSemRepetir);

        System.out.println(novaLista);

    }
}
