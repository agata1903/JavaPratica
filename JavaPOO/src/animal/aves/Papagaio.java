package polimorfismo.animal.aves;

public class Papagaio extends Ave{

    @Override
    public void emitirSom() {
        System.out.println("Olá!");
    }

    @Override
    public void mover() {
        System.out.println("*Voando baixo*");
    }
}
