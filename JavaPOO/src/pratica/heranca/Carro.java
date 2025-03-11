package pratica.heranca;

public class Carro extends Veiculo{

    private int qntPortas;

    public Carro(String marca, String modelo, int ano, int qntPortas) {
        super(marca, modelo, ano);
        this.qntPortas = qntPortas;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de portas: " + this.getQntPortas());
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }
}
