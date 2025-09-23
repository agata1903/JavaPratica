package poo.clientescompras;

import poo.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    String email;
    List<String> compras;

    public Cliente(String nome, String email, List<String> compras) {
        this.nome = nome;
        this.email = email;
        this.compras = new ArrayList<>();
    }

    void adicionarCompra(String produto) {
        compras.add(produto);
    }

    void mostrarCompras() {
        System.out.println("DADOS DO CLIENTE: \nNome: " + nome + "\nE-mail: " + email + "\nCompras: " + compras);
    }
}
