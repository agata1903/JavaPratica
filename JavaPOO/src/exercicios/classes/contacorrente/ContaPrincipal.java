package exercicios.classes.contacorrente;

public class ContaPrincipal {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = 12345;
        contaCorrente.saldo = 0;
        contaCorrente.depositar(10);
        contaCorrente.sacar(5);


        System.out.println(contaCorrente.saldo);
    }
}
