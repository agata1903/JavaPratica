package exercicios.fundamentos;

import java.util.Scanner;

public class DobroTriplo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();

        int dobro = n * 2;
        int triplo = n * 3;

        System.out.println(n + " x 2 = " + dobro);
        System.out.println(n + " x 3 = " + triplo);
    }
}
