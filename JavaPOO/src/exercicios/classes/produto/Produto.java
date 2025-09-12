package exercicios.classes.produto;

public class Produto {

    String nome;
    float preco;
    int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularTotal() {
        return preco * quantidade;
    }

    void exibirInfo() {
        System.out.println("Nome do produto: " + nome +
        "\nPreço: R$" + preco + "\nQuantidade: " + quantidade);
    }
}
