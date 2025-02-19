package banco;

public class Conta {

    public int nConta;
    protected int tipo;
    private String titular;
    private double saldo;
    private boolean status;

    public Conta(){
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(int tipo) {
        this.tipo = tipo;
        this.setStatus(true);

        if (tipo == 1) {
            this.setSaldo(50);
        }
        else if (tipo == 2){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Seu saldo não pode estar negativo, pague suas dívidas antes de fechar a conta!");
        }

        if (this.getSaldo() > 0) {
            System.out.println("Retire seu dinheiro antes de fechar sua conta!");
        }

        else {
            this.setStatus(false);
            System.out.println("Fechando conta... obrigado por utilizar nossos serviços!");
        }
    }

    public void depositar(double valor) {
        if (this.getStatus()) {
            if (valor <= 0) {
                System.out.println("O valor do depósito deve ser acima de 0!");
                return;
            }
        }
        this.setSaldo(this.getSaldo() + valor);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser acima de 0!");
            return;
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para ser sacado!");
            return;
        }
        setSaldo(getSaldo() + valor);
    }

    public void pagarMensal() {
        double valor;

        if (tipo == 1) {
            valor = 12;
            setSaldo(getSaldo() - valor);
        }
        else {
            valor = 20;
            setSaldo(getSaldo() - valor);
        }
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
