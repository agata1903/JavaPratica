package exercicios.condicionais;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0) {
            System.out.println("É bissexto");
        } else if (ano % 100 == 1 && ano % 400 == 0) {
            System.out.println("Não é bissexto");
        }
    }
}
