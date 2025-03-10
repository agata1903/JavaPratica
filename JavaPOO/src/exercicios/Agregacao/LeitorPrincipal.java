package exercicios.Agregacao;

public class LeitorPrincipal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Ágata", 27, "feminino");

        Livro livro = new Livro("1984", "George Orwell", 320, 5, true);

        livro.abrir();
        livro.avancarPag();
        livro.detalhes();



    }
}
