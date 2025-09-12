package exercicios.repeticoes.loopfor;

import java.util.Scanner;

public class TrianguloAsteriscos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        int n = scanner.nextInt();
        String str = "*";

        for (int i = 1; i <= n; i++) {
            System.out.println(str.repeat(i));
        }

        scanner.close();
    }
}
