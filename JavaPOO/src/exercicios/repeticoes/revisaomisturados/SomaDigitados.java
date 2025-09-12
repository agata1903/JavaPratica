package exercicios.repeticoes.revisaomisturados;

import java.util.Scanner;

public class SomaDigitados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        int soma = 0;

        while (n != 0) {
            soma += n;
            n = scanner.nextInt();
        }
        System.out.println("Total: " + soma);
    }
}
