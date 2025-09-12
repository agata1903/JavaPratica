package exercicios.fundamentos;

import java.util.Scanner;

public class BoasVindas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Bem-vindo(a), " + nome);
    }
}
