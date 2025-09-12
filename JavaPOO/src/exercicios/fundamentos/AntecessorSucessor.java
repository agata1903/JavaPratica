package exercicios.fundamentos;

import java.util.Scanner;

public class AntecessorSucessor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int sucessor = n + 1;
        int antecessor = n - 1;

        System.out.println("O número que vem antes de " + n + " é " + antecessor);
        System.out.println("O número que vem depois de " + n + " é " + sucessor);
    }
}
