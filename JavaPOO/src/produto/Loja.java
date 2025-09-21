package poo.produto;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Produto> estoque = new ArrayList<>();

        Produto p1 = new Produto();
        p1.nome = "arroz";
        p1.preco = 20.0;
        p1.quantidade = 30;

        estoque.add(p1);

        Produto p2 = new Produto();
        p2.nome = "feijao";
        p2.preco = 15.0;
        p2.quantidade = 30;

        estoque.add(p2);

        while (true) {
            System.out.println("Qual produto deseja comprar? ");
            String escolha = scanner.next();

            escolha = Normalizer.normalize(escolha, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
            boolean encontrado = false;

            for (Produto p : estoque) {
                if (p.nome.equalsIgnoreCase(escolha)) {
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Produto não encontrado!");
            }

            else {
                System.out.println("Quantas unidades deseja comprar? ");
                int qtdEscolhida = scanner.nextInt();
                for (Produto q : estoque) {
                    if (q.nome.equalsIgnoreCase(escolha) && q.quantidade >= qtdEscolhida) {
                        q.removerEstoque(qtdEscolhida);
                        System.out.println("Compra realizada com sucesso!");
                    }
                }
            }
            System.out.println("Deseja comprar mais alguma coisa? ");
            String resp = scanner.next();
            resp = Normalizer.normalize(resp, Normalizer.Form.NFD).replaceAll("\\p{M}", "");

            while (!resp.equalsIgnoreCase("sim") && !resp.equalsIgnoreCase("nao")) {
                System.out.println("Erro, você só pode responder com 'sim' ou 'não'!");
                System.out.println("Deseja comprar mais alguma coisa? ");
                resp = scanner.next();
            }

            if (resp.equalsIgnoreCase("nao")) {
                break;
            }
        }
        for (Produto p : estoque) {
            p.mostrarProduto();
        }
        scanner.close();
    }
}