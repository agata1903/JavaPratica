package exercicios.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaiorMenor {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(3);
        numeros.add(25);
        numeros.add(8);
        numeros.add(42);

        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
