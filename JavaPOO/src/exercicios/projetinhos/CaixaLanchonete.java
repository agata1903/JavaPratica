package exercicios.projetinhos;

import java.util.Scanner;

public class CaixaLanchonete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a lanchonete Coma Bem!");
        System.out.println("--------------------------------");

        String resp = "";
        int pedido;
        float soma = 0;
        float preco = 0;

        System.out.println("Gostaria de fazer seu pedido? S/N");
        resp = scanner.next();

        while (resp.equalsIgnoreCase("S")) {
            System.out.println("O que gostaria de pedir?\nCardápio:\n" +
                    "1- Hambúrguer -> R$15,20\n" +
                    "2- Refrigerante -> R$5,30\n" +
                    "3- Batata frita -> R$8,40");
            pedido = scanner.nextInt();

            String cardapio = switch (pedido) {
                case 1 -> "Hamburguer";
                case 2 -> "Refrigerante";
                case 3 -> "Batata frita";
                default -> "Erro";
            };

            preco = switch (pedido) {
                case 1 -> 15.20F;
                case 2 -> 5.30F;
                case 3 -> 8.40F;
                default -> 0F;
            };

            soma += preco;
            System.out.println("Gostaria de pedir mais alguma coisa? S/N");
            resp = scanner.next();
        }
        System.out.printf("Total: R$%.2f", soma);

        scanner.close();
    }
}
