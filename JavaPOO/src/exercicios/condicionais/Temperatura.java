package exercicios.condicionais;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos graus está agora?");
        int temp = scanner.nextInt();

        if (temp < 10) {
            System.out.println("Está muito frio!");
        } else if (temp >= 10 && temp <= 19) {
            System.out.println("Está frio!");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("Está agradável!");
        }
        else {
            System.out.println("Está muito quente!");
        }
    }
}
