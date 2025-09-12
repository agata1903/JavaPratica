package exercicios.listas;

import java.util.*;

public class OrdenarLista {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Agata", "Mariana", "Icaro","Leo","Renan");

        TreeSet<String> nomesOrdem = new TreeSet<>(nomes);
        System.out.println(nomesOrdem);

    }
}
