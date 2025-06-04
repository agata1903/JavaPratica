package banco;

public class ContaPoupanca extends Conta {

    private int agencia;
    private int numeroConta;
    private double saldo;

    public ContaPoupanca(int agencia, int numeroConta, double saldo) {
        super();
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.getSaldo() + valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.getSaldo() - valor;
    }

    @Override
    public void consultarSaldo() {
        this.getSaldo();
    }

    @Override
    public void exibirDados() {

    }
}
