package exercicios.switchcase;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número entre 1 a 7: ");
        int n = scanner.nextInt();

        String diaSemana = switch (n) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Escolha inválida!";
        };

        System.out.println(diaSemana);
        scanner.close();
    }
}
