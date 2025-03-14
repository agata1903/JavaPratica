package polimorfismo.animal.repteis;

public class Cobra extends Reptil{

    @Override
    public void emitirSom() {
        System.out.println("Ssssssss...");
    }

    @Override
    public void mover() {
        System.out.println("*Rastejando*");
    }
}
