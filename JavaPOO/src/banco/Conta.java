package banco;

public abstract class Conta extends Cliente {

    public Conta() {
        super();
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void consultarSaldo();
    public abstract void exibirDados();

    public Conta(String nome, int idade, String endereco, String cpf) {
        super(nome, idade, endereco, cpf);
    }
}
