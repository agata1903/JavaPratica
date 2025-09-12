package exercicios.repeticoes.loopwhile;

import java.util.Scanner;

public class SomaAteZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        int n = scanner.nextInt();
        while (n != 0) {
            soma += n;
            n = scanner.nextInt();
        }
        System.out.println("Total: " + soma);
    }
}
