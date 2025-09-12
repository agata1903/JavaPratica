package exercicios.condicionais;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("O número escolhido é positivo");
        } else if (n < 0) {
            System.out.println("O número escolhido é negativo");
        }
        else {
            System.out.println("O número escolhido é 0");
        }
    }
}
