package exercicios.repeticoes.loopfor;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int multi;
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            multi = n * i;
            System.out.println(n + "x" + i + "=" + multi);
        }
        scanner.close();
    }


}
