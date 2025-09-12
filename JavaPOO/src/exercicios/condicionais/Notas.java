package exercicios.condicionais;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota < 5) {
            System.out.println("O aluno está reprovado");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("O aluno está de recuperação");
        }
        else {
            System.out.println("O aluno está aprovado");
        }
    }
}
