package exercicios.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Numeros {

    public static void main(String[] args) {

        Set<Integer> conj1 = new HashSet<>(Arrays.asList(1,2,3,4,5));

        Set<Integer> conj2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        conj1.addAll(conj2);
        System.out.println("Conjunto 1 após união: " + conj1);

        conj1.removeAll(conj2);
        System.out.println("Conjunto 1 atual após diferença: " + conj1);

        conj1.retainAll(conj2);
        System.out.println("Conjunto 1 após interseção: " + conj1);


    }
}
