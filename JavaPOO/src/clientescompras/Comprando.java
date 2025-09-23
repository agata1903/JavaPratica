package poo.clientescompras;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Comprando {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cliente c1 = new Cliente("Agata", "agata@gmail.com", new ArrayList<>());

        ArrayList<Cliente> amznCliente = new ArrayList<>();

        c1.adicionarCompra("Blusinha");

        amznCliente.add(c1);

        System.out.println("Qual cliente quer pesquisar? ");
        String escolha = scanner.next();
        escolha = escolha.substring(0, 1).toUpperCase() + escolha.substring(1).toLowerCase();
        escolha = Normalizer.normalize(escolha, Normalizer.Form.NFD).replaceAll("\\p{M}", "");

        if (!escolha.matches("[a-zA-Z ]+")) {
            System.out.println("Nome inválido! Não é permitido usar números, acentos ou caracteres especiais.");
        }
        boolean encontrado = false;

        for (Cliente c : amznCliente) {
            if (c.nome.equalsIgnoreCase(escolha)) {
                encontrado = true;
            }
            if (encontrado) {
                c.mostrarCompras();
            }
        }
        if (!encontrado) {
            System.out.println("Cliente não encontrado!");
        }
    }
}
