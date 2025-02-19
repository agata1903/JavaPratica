package pratica.produto;

import java.text.NumberFormat;
import java.util.Currency;

public class Produto {

    String nome;
    double preco;
    int estoque;

    void exibirInformacoes() {

        NumberFormat formato = NumberFormat.getCurrencyInstance();
        formato.setCurrency(Currency.getInstance("BRL"));

        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + formato.format(this.preco));
        System.out.println("Estoque: " + this.estoque + " unidades");

    }

    void atualizarPreco() {

    }

    void adicionarProduto() {

    }

    void removerProduto() {

    }
}
