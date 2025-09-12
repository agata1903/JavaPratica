package exercicios.repeticoes.loopwhile;

import java.util.Scanner;

public class SenhaCorreta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senha = "tata";

        System.out.println("Digite a senha: ");
        String senhaDigitada = scanner.next();

        while (!senhaDigitada.equals(senha)) {
            System.out.println("Erro, digite novamente!");
            senhaDigitada = scanner.next();
        }
        System.out.println("Acesso concedido!");

        scanner.close();
    }
}
