package exercicios.fundamentos;

import java.util.Scanner;

public class Maioridade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        boolean maiorIdade = idade >=18;

        System.out.println("Fulano é de maior? " + maiorIdade);

        scanner.close();

    }
}
