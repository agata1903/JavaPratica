package exercicios.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListasChavesValores {

    public static void main(String[] args) {

        Map<String, Integer> alunos = new HashMap<>();

        alunos.put("Ágata", 18);
        alunos.put("Mariana", 18);
        alunos.put("Henrique", 18);
        alunos.put("Ícaro", 20);
        alunos.put("Leo", 20);
        alunos.put("Renan", 20);

        for (Map.Entry<String, Integer> galera: alunos.entrySet()) {
            System.out.println(Arrays.asList("Nome: " + galera.getKey(), "Idade: " + galera.getValue()));
        }
    }
}
