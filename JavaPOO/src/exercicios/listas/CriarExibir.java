package exercicios.listas;

import java.util.ArrayList;
import java.util.List;

public class CriarExibir {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Ágata");
        lista.add("Mariana");
        lista.add("Ícaro");
        lista.add("Leo");
        lista.add("Renan");

        for (String l: lista) {
            System.out.println(l);
        }
    }
}
