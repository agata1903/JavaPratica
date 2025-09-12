package exercicios.classes.contacorrente;

public class ContaCorrente {

    int numero;
    double saldo;
    boolean chequeEspecial;
    double limiteAtual;
    double limiteTotal = 600;

    void sacar(double valor) {
        saldo -= valor;
        if (saldo <= 0) {
            limiteAtual -= valor;
        }
    }

    void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido para depósito!");
            return;
        }

//        double valorRestante = limiteTotal - limiteAtual;
//
//        System.out.println("Operação foi um sucesso!");
//
//        if (valorRestante > 0) {
//            if (valor > valorRestante) {
//                limiteAtual = limiteTotal;
//                saldo += (valor - valorRestante);
//            }
//            else {
//                limiteAtual += valor;
//            }
//        }
        else {
            saldo += valor;
        }
        System.out.println("Operação finalizada!");

    }
}
