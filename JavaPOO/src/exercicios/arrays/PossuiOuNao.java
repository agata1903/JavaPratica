package exercicios.arrays;

import java.util.Scanner;

public class PossuiOuNao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] n = {4,3,7,9,8,2,3,6,3};

        System.out.println("Que número vc acha que está neste array? ");
        int a = scanner.nextInt();

        for (int i = 0; i < n.length; i++) {
            if (a == n[i]) {
                System.out.println("Aqui");
            }
            else {
                System.out.println("Não");
            }
        }

        scanner.close();
    }
}
