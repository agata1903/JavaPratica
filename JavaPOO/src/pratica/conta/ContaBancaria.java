package pratica.conta;

import java.util.Random;

public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        Random rand = new Random();
        this.numero = 100000 + rand.nextInt(900000);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor precisa ser acima de 0!");
            return;
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor precisa ser acima de 0!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para ser sacado!");
            return;
        }
        saldo -= valor;
    }

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
