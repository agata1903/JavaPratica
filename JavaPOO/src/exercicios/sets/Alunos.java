package exercicios.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Alunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Agata");
        alunos.add("Mariana");
        alunos.add("Icaro");
        alunos.add("Leo");
        alunos.add("Renan");

        List<String> ordemAlfabetica = new ArrayList<>(alunos).stream().sorted().toList();

        System.out.println(ordemAlfabetica);
    }
}
