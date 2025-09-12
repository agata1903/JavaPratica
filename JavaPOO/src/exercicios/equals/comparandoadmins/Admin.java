package exercicios.equals.comparandoadmins;

import java.util.Objects;

public class Admin {

    String nome;
    String email;
    int nivel;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return nivel == admin.nivel && Objects.equals(nome, admin.nome) && Objects.equals(email, admin.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, nivel);
    }
}
