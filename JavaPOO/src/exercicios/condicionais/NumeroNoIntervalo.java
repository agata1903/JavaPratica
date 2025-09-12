package exercicios.condicionais;

import java.util.Scanner;

public class NumeroNoIntervalo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        if (n >= 50 && n <= 100) {
            System.out.println("Está dentro do intervalo");
        }
        else {
            System.out.println("Não está");
        }
    }

}
