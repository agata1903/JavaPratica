package poo.classeabstrata;

public class PagamentoPix extends Pagamento{

    public double aplicarDesconto() {
        if (this.getValor() > 300) {
            double novoValor = this.getValor() - (this.getValor() * 0.05);
            this.setValor(novoValor);
            return novoValor;
        }
        return this.getValor();
    }

    @Override
    public String tipoPagamento() {
        return "Pix";
    }

    @Override
    public double calcularValorFinal() {
        return aplicarDesconto();
    }
}
