package poo.classeabstrata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pagamento {

    private double valor;
    private LocalDate dataPagamento;

    public Pagamento() {
    }

    public Pagamento(double valor, LocalDate dataPagamento) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public abstract String tipoPagamento();

    public abstract double calcularValorFinal();

    public String resumoPagamento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataPagamento.format(formatter);
        return String.format("Total: R$%.2f%nTipo de pagamento: %s%nData de pagamento: %s", this.getValor(), this.tipoPagamento(), dataFormatada);
    }
}
