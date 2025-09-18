package maps;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleEstoque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("caneta", 50);
        estoque.put("caderno", 30);
        estoque.put("lapis", 50);

        while (true) {
            System.out.println("Qual produto deseja comprar? Digite 0 para sair: ");
            String escolha = scanner.next().toLowerCase();

            if (escolha.equals("0")) {
                break;
            }

            escolha = Normalizer.normalize(escolha, Normalizer.Form.NFD).
                    replaceAll("\\p{M}", "");

            if (estoque.containsKey(escolha)) {

                int estoqueAtual = estoque.get(escolha);
                System.out.println("Quantas unidades deseja? ");
                int qtd = scanner.nextInt();

                if (qtd <= estoqueAtual) {
                    estoqueAtual -= qtd;
                    estoque.put(escolha, estoqueAtual);
                    System.out.println("Compra realizada com sucesso!");
                }
                else {
                    System.out.println("Estoque indisponível!");
                }
            }
            else {
                System.out.println("Produto indisponível!");
            }
        }
        for (Map.Entry<String, Integer> registro : estoque.entrySet()) {
            System.out.println("Produto: " + registro.getKey() + " | Estoque: " + registro.getValue());
        }
        System.out.println("Obrigada, volte sempre!");
    }
}