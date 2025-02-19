package pratica.encapsulamento;

public class Conta implements Acoes {

    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;

    }

    public String getTitular(String nome) {
        return this.titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor precisa ser acima de 0!");
        }
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo <= 0) {
            throw new IllegalArgumentException("Saldo insuficiente para sacar!");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor precisa ser acima de 0!");
        }
        this.saldo -= valor;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + this.getSaldo());
    }
}