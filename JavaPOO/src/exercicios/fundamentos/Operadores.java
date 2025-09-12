package exercicios.fundamentos;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        int n1 = scanner.nextInt();
        System.out.println("Insira o segundo valor: ");
        int n2 = scanner.nextInt();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multi = n1 * n2;
        double divisao = n1/n2;

        System.out.println(n1 + " + " + n2 + " = " + soma);
        System.out.println(n1 + " - " + n2 + " = " + subtracao);
        System.out.println(n1 + " x " + n2 + " = " + multi);
        System.out.println(n1 + " / " + n2 + " = " + divisao);
    }
}
