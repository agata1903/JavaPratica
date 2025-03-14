package polimorfismo.animal.peixes;

public class Tubarao extends Peixe{

    @Override
    public void emitirSom() {
        System.out.println("...");
    }

    @Override
    public void mover() {
        System.out.println("*Nadando rápido*");
    }
}
