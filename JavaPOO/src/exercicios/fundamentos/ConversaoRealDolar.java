package exercicios.fundamentos;

import java.util.Scanner;

public class ConversaoRealDolar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto deseja converter? ");
        double real = scanner.nextDouble();

        double dolar = real * 0.19;

        System.out.printf("R$ %.2f equivale a US$ %.2f", real, dolar);
    }
}
