package exercicios.equals.comparandousuarios;

public class UsuarioPrincipal {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Ágata";
        u1.email = "agata@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Ágata";
        u2.email = "agata@email.com";

        System.out.println(u1.equals(u2));
    }
}
