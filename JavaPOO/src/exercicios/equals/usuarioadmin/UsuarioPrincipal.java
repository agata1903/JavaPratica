package exercicios.equals.usuarioadmin;

public class UsuarioPrincipal {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Ágata";
        u1.email = "agata@gmail.com";

        Admin u2 = new Admin();
        u2.nome = "Ágata";
        u2.email = "agata@gmail.com";

        System.out.println(u1.equals(u2));
    }
}
