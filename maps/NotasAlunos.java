package maps;

import java.util.*;

public class NotasAlunos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> boletim = new HashMap<>();

        boletim.putIfAbsent("Ágata", new ArrayList<>());
        boletim.get("Ágata").add(10.0);
        boletim.get("Ágata").add(9.8);

        boletim.putIfAbsent("Mariana", new ArrayList<>());
        boletim.get("Mariana").add(9.5);
        boletim.get("Mariana").add(8.0);

        boletim.putIfAbsent("Paulo", new ArrayList<>());
        boletim.get("Paulo").add(6.0);
        boletim.get("Paulo").add(5.0);

        double media = 0;

        for (Map.Entry<String, List<Double>> resultado : boletim.entrySet()) {
            double soma = 0;
            for (Double notas : resultado.getValue()) {
                soma += notas;
            }
            media = soma / resultado.getValue().size();
            System.out.println(media);
        }

    }
}
