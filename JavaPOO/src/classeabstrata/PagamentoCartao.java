package poo.classeabstrata;

import java.time.LocalDate;

public class PagamentoCartao extends Pagamento{

    private int parcelas;

    public PagamentoCartao() {
    }

    @Override
    public String tipoPagamento() {
        return "Cartão";
    }

    public PagamentoCartao(double valor, LocalDate dataPagamento, int parcelas) {
        super(valor, dataPagamento);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public double calcularValorFinal() {
        this.setValor(this.getValor() + (this.getValor() * parcelas * 0.02));
        return this.getValor();
    }
}
