package exercicios.repeticoes.loopwhile;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cont = 1;
        int multi = 0;

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        while (cont <= 10) {
            multi = n * cont;
            System.out.println(n + " x " + cont + " = " + multi);
            cont++;
        }
        scanner.close();
    }
}
