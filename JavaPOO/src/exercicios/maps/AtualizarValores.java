package exercicios.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtualizarValores {

    public static void main(String[] args) {

        Map<String, Integer> alunos = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        alunos.put("Ágata", 18);
        alunos.put("Mariana", 18);
        alunos.put("Ícaro", 20);

        System.out.println("Insira outra pessoa: ");
        String novoNome = scanner.next();
        System.out.println("Dê uma idade a ela");
        int novaIdade = scanner.nextInt();

        alunos.put(novoNome, novaIdade);

        for (Map.Entry<String, Integer> galera: alunos.entrySet()) {
            System.out.println(galera);
        }

        scanner.close();
    }
}
