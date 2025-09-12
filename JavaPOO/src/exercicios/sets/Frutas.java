package exercicios.sets;

import java.util.HashSet;

public class Frutas {

    public static void main(String[] args) {

        HashSet<String> frutas = new HashSet<>();

        frutas.add("Morango");
        frutas.add("Banana");
        frutas.add("Manga");
        frutas.add("Maçã");
        frutas.add("Abacaxi");

        System.out.println("A lista possui " + frutas.size() + " elementos.");
        System.out.println("A manga está na lista? " + frutas.contains("Manga"));

        frutas.remove("Maçã");

        System.out.println("A lista atual possui " + frutas.size() + " elementos.");
    }
}
