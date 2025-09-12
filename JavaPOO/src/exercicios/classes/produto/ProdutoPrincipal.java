package exercicios.classes.produto;

public class ProdutoPrincipal {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 3000.0F, 100);
        produto.calcularTotal();
        produto.exibirInfo();
    }
}
