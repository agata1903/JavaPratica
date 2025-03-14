package polimorfismo.animal.mamiferos;

public class Gato extends Mamifero{

    @Override
    public void emitirSom() {
        System.out.println("Miaaaaaaaaau!");
    }

    @Override
    public void mover() {
        System.out.println("*Saltando*");
    }
}
