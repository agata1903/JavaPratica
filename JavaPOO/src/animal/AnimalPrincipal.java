package polimorfismo.animal;

import polimorfismo.animal.aves.Pato;
import polimorfismo.animal.aves.Papagaio;
import polimorfismo.animal.mamiferos.Cachorro;
import polimorfismo.animal.mamiferos.Gato;
import polimorfismo.animal.peixes.PeixePalhaco;
import polimorfismo.animal.peixes.Tubarao;
import polimorfismo.animal.repteis.Cobra;
import polimorfismo.animal.repteis.Jacare;

public class AnimalPrincipal {

    public static void main(String[] args) {

        System.out.println("Este é o senhor Cachorro:");
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Snoopy");
        cachorro.getNome();
        cachorro.mover();
        cachorro.emitirSom();
        System.out.println();

        System.out.println("Este é o senhor Gato:");
        Gato gato = new Gato();
        gato.setNome("Tom");
        gato.getNome();
        gato.mover();
        gato.emitirSom();
        System.out.println();

        System.out.println("Esta é a dona Cobra:");
        Cobra cobra = new Cobra();
        cobra.setNome("Kaa");
        cobra.getNome();
        cobra.mover();
        cobra.emitirSom();
        System.out.println();

        System.out.println("Este é o senhor Jacaré:");
        Jacare jacare = new Jacare();
        jacare.setNome("Zé Jacaré");
        jacare.getNome();
        jacare.mover();
        jacare.emitirSom();
        System.out.println();

        System.out.println("Este é o senhor Papagaio:");
        Papagaio papagaio = new Papagaio();
        papagaio.setNome("Louro");
        papagaio.getNome();
        papagaio.mover();
        papagaio.emitirSom();
        System.out.println();

        System.out.println("Esta é o senhor Pato:");
        Pato pato = new Pato();
        pato.setNome("Donald");
        pato.getNome();
        pato.mover();
        pato.emitirSom();
        System.out.println();

        System.out.println("Este é o senhor Tubarão:");
        Tubarao tubarao = new Tubarao();
        tubarao.setNome("Bruce");
        tubarao.getNome();
        tubarao.mover();
        tubarao.emitirSom();
        System.out.println();

        System.out.println("Este é o senhor Peixe-Palhaço");
        PeixePalhaco peixePalhaco = new PeixePalhaco();
        peixePalhaco.setNome("Nemo");
        peixePalhaco.getNome();
        peixePalhaco.mover();
        peixePalhaco.emitirSom();
    }
}