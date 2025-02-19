package pratica.encapsulamento;

import java.util.Scanner;

public class ContaPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int valor;

        System.out.println("Digite seu nome: ");
        nome = entrada.next();

        Conta c = new Conta(nome);

        System.out.println("Quanto deseja depositar? ");
        valor = entrada.nextInt();
        c.depositar(valor);

        System.out.println("Quanto deseja sacar?");
        valor = entrada.nextInt();
        c.sacar(valor);

        c.exibirSaldo();

        entrada.close();

    }
}
