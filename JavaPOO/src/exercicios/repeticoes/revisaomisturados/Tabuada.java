package exercicios.repeticoes.revisaomisturados;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        int mult;
        for(int i = 1; i <= 10; i++) {
            mult = n * i;
            System.out.println(n + " x " + i + " = " + mult);
        }

        scanner.close();
    }
}
