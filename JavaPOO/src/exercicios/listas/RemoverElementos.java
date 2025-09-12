package exercicios.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoverElementos {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Laranja", "Abacaxi"));

        frutas.remove(1); // Para funcionar, declarar new ArrayList<>();

        for (String f: frutas) {
            System.out.println(f);
        }
    }
}
