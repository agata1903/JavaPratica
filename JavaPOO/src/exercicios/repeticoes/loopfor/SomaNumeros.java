package exercicios.repeticoes.loopfor;

import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            soma += i;
            System.out.println(soma);
        }
        scanner.close();
    }
}
