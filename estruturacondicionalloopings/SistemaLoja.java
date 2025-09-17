package estruturacondicionalloopings;

import java.util.Scanner;

public class SistemaLoja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeProduto = "";
        double precoProduto = 0;
        int qtdProduto = 0;
        double total = 0;
        String resp = "";

        System.out.println("Digite 'sair' para sair: ");
        resp = scanner.next();
        while (!resp.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome do produto: ");
            nomeProduto = scanner.next();
            System.out.println("Digite o preço desse produto: ");
            precoProduto = scanner.nextDouble();
            System.out.println("Quantas unidades?");
            qtdProduto = scanner.nextInt();
            if (qtdProduto <= 0) {
                System.out.println("Insira um valor acima de 0!");
                qtdProduto = scanner.nextInt();
            }
            total = precoProduto * qtdProduto;
            
            if (total > 500) {
                total = total - (total * 10/100);
            } else if (total >= 300 && total <= 500) {
                total = total - (total * 5/100);
            }
            System.out.println("Digite 'sair' para sair: ");
            resp = scanner.next();
        }

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: " + precoProduto);
        System.out.println("Total: " + total);
        scanner.close();
    }
}
