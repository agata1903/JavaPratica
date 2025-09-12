package exercicios.listas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BuscaLista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> nomes = Arrays.asList("Ágata", "Mariana", "Ícaro", "Leo", "Renan");

        System.out.println("Digite um nome: ");
        String nomeEscolhido = scanner.next();

        if (nomes.contains(nomeEscolhido)) {
            System.out.println("Está na lista!");
        }
        else {
            System.out.println("Não está na lista!");
        }

        scanner.close();
    }
}
