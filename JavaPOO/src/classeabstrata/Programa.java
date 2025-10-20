package poo.classeabstrata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pagamento> pagamentoList = new ArrayList<>();
        LocalDate hoje = LocalDate.now();

        System.out.println("Selecione o tipo de pagamento: 1- Cartão, 2- Pix");
        int tipoPagamento = scanner.nextInt();

        Pagamento pagamento = null;

        switch (tipoPagamento) {
            case 1 -> {
                PagamentoCartao cartao = new PagamentoCartao();
                System.out.print("Valor: ");
                cartao.setValor(scanner.nextDouble());
                System.out.print("Parcelas: ");
                cartao.setParcelas(scanner.nextInt());
                cartao.setDataPagamento(hoje);
                cartao.calcularValorFinal();
                pagamentoList.add(cartao);
            }

            case 2 -> {
                PagamentoPix pix = new PagamentoPix();
                System.out.print("Valor: ");
                pix.setValor(scanner.nextDouble());
                pix.setDataPagamento(hoje);
                pix.calcularValorFinal();
                pagamentoList.add(pix);
            }
        }

        for (Pagamento p : pagamentoList) {
            System.out.println(p.resumoPagamento());
        }

        scanner.close();
    }
}
