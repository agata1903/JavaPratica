package exercicios.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuscaSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> usuarios = new HashMap<>();

        usuarios.put("Ágata", 18);
        usuarios.put("Mariana", 18);
        usuarios.put("Ícaro", 20);

        System.out.println("Quem você quer buscar? ");
        String buscarNome = scanner.next();

        for (Map.Entry<String, Integer> alunos: usuarios.entrySet()) {
            if (buscarNome.equals(alunos.getKey())) {
                System.out.println("O aluno " + alunos.getKey() + " tem " + alunos.getValue() + " anos.");
            }
            else {
                System.out.println("O aluno não existe");
            }
        }

    }
}
