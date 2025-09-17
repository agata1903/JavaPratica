package Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ControleFuncionarios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> funcionarios = new HashSet<>();

        while (true) {
            System.out.println("Digite o nome de um funcionário, digite 'sair' para sair: ");
            String nome = scanner.next();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            funcionarios.add(nome);
        }
        System.out.println(funcionarios);
        System.out.println("Total de funcionários: " + funcionarios.size());

    }
}
