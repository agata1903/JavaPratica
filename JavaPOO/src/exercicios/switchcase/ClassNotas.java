package exercicios.switchcase;

import java.util.Scanner;

public class ClassNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual nota deseja informação? ");
        int nota = scanner.nextInt();

        String classificacao = switch (nota) {
            case 10 -> "Excelente";
            case 8, 9 -> "Ótimo";
            case 6, 7 -> "Bom";
            case 4, 5 -> "Regular";
            case 0, 1, 2, 3 -> "Insuficiente";
            default -> "Nota inválida";
        };

        System.out.println(classificacao);
        scanner.close();

    }
}
