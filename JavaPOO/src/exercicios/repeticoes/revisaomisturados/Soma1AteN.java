package exercicios.repeticoes.revisaomisturados;

import java.util.Scanner;

public class Soma1AteN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        System.out.println("Escolha um número: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        System.out.println("Total: " + soma);
        scanner.close();
    }
}
