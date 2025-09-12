package exercicios.repeticoes.revisaomisturados;

import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        int n = scanner.nextInt();

        while (n > 0) {
            System.out.println(n -= 1);
        }
    }


}
