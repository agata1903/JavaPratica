package pratica.produto;

public class ProdutoDetalhes {

    public static void main(String[] args) {

        Produto p = new Produto();
        p.nome = "Abajur";
        p.preco = 100.0;
        p.estoque = 50;
        p.exibirInformacoes();
    }
}
