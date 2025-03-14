package polimorfismo.animal.repteis;

public class Jacare extends Reptil{

    @Override
    public void emitirSom() {
        System.out.println("Grrr...");
    }

    @Override
    public void mover() {
        System.out.println("*Andando devagar*");
    }
}
