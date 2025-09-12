package exercicios.equals.comparandoadmins;

public class AdminPrincipal {

    public static void main(String[] args) {

        Admin a1 = new Admin();
        a1.nome = "Tatá";
        a1.email = "tata@gmail.com";
        a1.nivel = 1;

        Admin a2 = new Admin();
        a2.nome = "Tatá";
        a2.email = "tata@gmail.com";
        a2.nivel = 2;

        System.out.println(a1.equals(a2));
    }
}
