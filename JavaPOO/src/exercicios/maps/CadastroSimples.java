package exercicios.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CadastroSimples {

    public static void main(String[] args) {

        Map<String, Integer> cadastro = new HashMap<>();

        cadastro.put("Tatá", 1);
        cadastro.put("Mariana", 2);
        cadastro.put("Ícaro", 3);



        for (Map.Entry<String, Integer> registro: cadastro.entrySet()) {
            System.out.println(registro);
        }
    }
}
