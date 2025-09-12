package exercicios.fundamentos;

import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        int diasVivo = idade * 365;
        System.out.println("Você está vivo(a) por " + diasVivo + " dias.");
    }
}
