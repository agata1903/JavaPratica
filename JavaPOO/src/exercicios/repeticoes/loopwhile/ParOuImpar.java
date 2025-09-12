package exercicios.repeticoes.loopwhile;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        while (n != -1) {
            if (n % 2 == 0) {
                System.out.println("Par");
            }
            else {
                System.out.println("Ímpar");
            }
            System.out.println("Digite outro número: ");
            n = scanner.nextInt();
        }
        System.out.println("Você digitou -1. Fim do programa");
        scanner.close();
    }
}
