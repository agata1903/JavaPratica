package polimorfismo.animal.peixes;

public class PeixePalhaco extends Peixe{

    @Override
    public void emitirSom() {
        System.out.println("Glub glub");
    }

    @Override
    public void mover() {
        System.out.println("*Nadando devagar*");
    }
}
