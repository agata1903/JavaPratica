package pratica.heranca;

public class VeiculoPrincipal {

    public static void main(String[] args) {

        Veiculo v = new Veiculo("Chevrolet", "Onix", 2025);
        Carro c = new Carro("Chevrolet", "Onix", 2025, 4);
        Moto m = new Moto("Honda", "CG 160 Start", 2025, 162.7f);

        System.out.println("Carro");
        c.exibirDetalhes();
        System.out.println();
        System.out.println("Moto");
        m.exibirDetalhes();
    }
}
