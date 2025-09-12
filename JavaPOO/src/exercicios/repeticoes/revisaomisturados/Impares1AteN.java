package exercicios.repeticoes.revisaomisturados;

import java.util.Scanner;

public class Impares1AteN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
