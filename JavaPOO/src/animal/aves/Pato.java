package polimorfismo.animal.aves;

public class Pato extends Ave{

    @Override
    public void emitirSom() {
        System.out.println("Quá quá!");
    }

    @Override
    public void mover() {
        System.out.println("*Voando alto*");
    }
}
