package exercicios.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPalavras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String frase = scanner.next();
        String[] fraseQuebrada = frase.split(" ");

        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra: fraseQuebrada) {
            if (contagem.containsKey(palavra)) {
                contagem.put(palavra, contagem.get(palavra) + 1);
            } else {
                contagem.put(palavra, 1);
            }
        }


        scanner.close();
    }
}
