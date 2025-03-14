package polimorfismo;

public class AnimalPrincipal {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();

        m.setPeso(4.5f);
        m.setIdade(2);
        m.setQntMembros(4);
        m.setCorPelo("Branco e preto");
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println();

        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        Canguru c = new Canguru();
        c.locomover();
    }
}
