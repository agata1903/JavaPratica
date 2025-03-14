package polimorfismo.animal.mamiferos;

public class Cachorro extends Mamifero{


    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void mover() {
        System.out.println("*Correndo*");
    }
}
