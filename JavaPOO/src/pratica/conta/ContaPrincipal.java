package pratica.conta;

import java.util.Scanner;

public class ContaPrincipal {

    public static void main(String[] args) {

        int conta;
        int resp = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual tipo de conta deseja abrir? 1- Conta Corrente; 2- Conta Poupança: ");
        conta = entrada.nextInt();

        if (conta == 1) {
            ContaBancaria cc = new ContaBancaria();
            cc.setNumero(cc.getNumero());
            System.out.println("Insira seu nome: ");
            cc.setTitular(entrada.next());

            while (true) {
                System.out.println("Gostaria de fazer uma operação?");
                System.out.println("1- Depositar");
                System.out.println("2- Sacar");
                System.out.println("3- Sair");
                resp = entrada.nextInt();

                if (resp == 1) {
                    System.out.println("Quanto gostaria de depositar? ");
                    cc.depositar(entrada.nextInt());
                } else if (resp == 2) {
                    System.out.println("Quanto gostaria de sacar? ");
                    cc.sacar(entrada.nextInt());
                } else if (resp == 3) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Operação inválida! Digite novamente!");
                }
            }
            System.out.println("Nome: " + cc.getTitular());
            System.out.println("Conta nº " + cc.getNumero());
            System.out.println("Saldo: R$" + cc.getSaldo());
        }

        else {
            ContaBancaria cp = new ContaBancaria();
            cp.setNumero(cp.getNumero());
            System.out.println("Insira seu nome: ");
            cp.setTitular(entrada.next());

            System.out.println("Cadastrado com sucesso!");

            while (true) {
                System.out.println("Gostaria de fazer uma operação?");
                System.out.println("1- Depositar");
                System.out.println("2- Sacar");
                System.out.println("3- Sair");
                resp = entrada.nextInt();

                if (resp == 1) {
                    System.out.println("Quanto gostaria de depositar? ");
                    cp.depositar(entrada.nextInt());
                } else if (resp == 2) {
                    System.out.println("Quanto gostaria de sacar? ");
                    cp.sacar(entrada.nextInt());
                } else if (resp == 3) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Operação inválida! Digite novamente!");
                }
            }
            System.out.println("Nome: " + cp.getTitular());
            System.out.println("Conta nº: " + cp.getNumero());
            System.out.println("Saldo: R$" + cp.getSaldo());
        }
    }
}
