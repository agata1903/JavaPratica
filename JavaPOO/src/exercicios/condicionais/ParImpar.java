package exercicios.condicionais;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número " +  n + " é par");
        }

        else {
            System.out.println("O número " + n + " é ímpar");
        }
    }
}
