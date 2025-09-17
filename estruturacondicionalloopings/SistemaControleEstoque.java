package estruturacondicionalloopings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaControleEstoque {

    public static void main(String[] args) {

        Map<String, Integer> produto = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        produto.put("caderno", 20);
        produto.put("lapis", 50);
        produto.put("borracha", 15);
        produto.put("caneta", 50);

        System.out.println("Qual produto deseja comprar? ");
        String escolha = scanner.next().toLowerCase();

        if (escolha.equals("lápis")) {
            escolha = escolha.replace("á", "a");
        }

        if (!produto.containsKey(escolha)) {
            System.out.println("Desculpe, produto indisponível!");
        }
        if ((produto.containsKey(escolha))) {
            System.out.println("Quantas unidades deseja comprar? ");
            int qtd = scanner.nextInt();

            int estoqueAtual = produto.get(escolha);
            estoqueAtual -= qtd;
            produto.put(escolha, estoqueAtual);
        }
        System.out.println(produto);
    }
}
