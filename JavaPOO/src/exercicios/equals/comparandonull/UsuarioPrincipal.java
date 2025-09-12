package exercicios.equals.comparandonull;

public class UsuarioPrincipal {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Ágata";
        u1.email = "agata@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = null;
        u2.email = null;

        System.out.println(u1.equals(u2));
    }
}
