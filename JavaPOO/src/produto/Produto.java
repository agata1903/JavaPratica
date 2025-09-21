package poo.produto;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    int adicionarEstoque(int quantidade) {
        return this.quantidade += quantidade;
    }

    int removerEstoque(int quantidade) {
        return this.quantidade -= quantidade;
    }

    void mostrarProduto() {
        System.out.printf("Nome: %s%n" +
                "Preço: R$%.2f%nQuantidade: %d%n",
                nome, preco, quantidade);
    }
}
