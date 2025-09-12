package exercicios.repeticoes.revisaomisturados;

import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int i = 1; i < 10; i++) {
            System.out.println("Escolha um número: ");
            int c = scanner.nextInt();

            if (c > maior) {
                maior = c;
            }

            if (c < menor) {
                menor = c;
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}
