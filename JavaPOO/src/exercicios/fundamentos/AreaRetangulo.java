package exercicios.fundamentos;

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da base: ");
        double b = scanner.nextDouble();
        System.out.println("Insira o valor da altura: ");
        double h = scanner.nextDouble();

        double area = b * h;
        System.out.println("Valor da área: " + area + "m²");
    }
}
