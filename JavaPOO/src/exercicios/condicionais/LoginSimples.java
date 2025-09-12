package exercicios.condicionais;

import java.util.Objects;
import java.util.Scanner;

public class LoginSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Usuário: ");
        String usuario = scanner.next();
        System.out.println("Senha:");
        String senha = scanner.next();

        if (Objects.equals(usuario, "admin") && Objects.equals(senha, "1234")) {
            System.out.println("Acesso concedido");
        }
        else {
            System.out.println("Usuário ou senha incorretos");
        }
    }
}
