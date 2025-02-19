package banco;

import java.util.Scanner;

public class ContaPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Que tipo de conta gostaria de abrir?");
        System.out.println("1- Corrente");
        System.out.println("2- Poupança");

        int tipoConta = entrada.nextInt();

        conta.abrirConta(tipoConta);

        System.out.println("Tipo da conta: " + conta.getTipo());
        System.out.println("Status da conta: " + conta.getStatus());
        System.out.println("Saldo inicial: " + conta.getSaldo());

        entrada.close();
    }
}
