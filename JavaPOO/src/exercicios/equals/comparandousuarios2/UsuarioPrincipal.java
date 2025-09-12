package exercicios.equals.comparandousuarios2;

public class UsuarioPrincipal {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Ágata";
        u1.email = "agata@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Tatá";
        u2.email = "agata@gmail.com";

        System.out.println(u1.equals(u2));
    }
}
