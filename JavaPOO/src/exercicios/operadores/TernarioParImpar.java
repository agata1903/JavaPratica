package exercicios.operadores;

import java.util.Scanner;

public class TernarioParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int n = scanner.nextInt();

        String maiorDeIdade = (n >= 18) ?
                "Maior de idade" : "Menor de idade";

        System.out.println(maiorDeIdade);
    }
}
