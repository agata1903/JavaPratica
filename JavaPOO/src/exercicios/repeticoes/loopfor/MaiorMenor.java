package exercicios.repeticoes.loopfor;

import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        int maior = n;
        int menor = n;

        for(int i = 1; i < 5; i++) {
            System.out.println("Digite outro número: ");
            n = scanner.nextInt();

            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        scanner.close();
    }
}
