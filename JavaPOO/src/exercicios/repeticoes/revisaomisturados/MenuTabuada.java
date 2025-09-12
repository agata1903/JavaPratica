package exercicios.repeticoes.revisaomisturados;

import java.util.Objects;
import java.util.Scanner;

public class MenuTabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int v1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int v2 = scanner.nextInt();

        String resp = "";
        int res;

        while (!resp.equalsIgnoreCase("sair") ) {
            System.out.println("Qual operação deseja fazer? + - * ou /. Digite 'sair' para sair: ");
            resp = scanner.next();


            if (resp.equals("+")) {
                res = v1 + v2;
                System.out.println(res);
            } else if (resp.equals("-")) {
                res = v1 - v2;
                System.out.println(res);
            } else if (resp.equals("*")) {
                res = v1 * v2;
                System.out.println(res);
            } else if (resp.equals("/")) {
                res = v1 / v2;
                System.out.println(res);
            }
        }
        System.out.println("Fim do programa.");
        scanner.close();
    }
}
