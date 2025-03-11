package pratica.heranca;

public class Moto extends Veiculo{

    private float cilindradas;

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindrada: " + this.cilindradas);
    }

    public Moto(String marca, String modelo, int ano, float cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public float getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(float cilindradas) {
        this.cilindradas = cilindradas;
    }
}
