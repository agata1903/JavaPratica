package trycatch;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Reserva r1 = new Reserva();

        System.out.println("Número do quarto: ");
        r1.setNumeroQuarto(scanner.nextInt());

        r1.setEntrada(LocalDate.now());

        while (true) {
            try {
                System.out.println("Data de saída: ");
                int dia = scanner.nextInt();
                int mes = scanner.nextInt();
                int ano = scanner.nextInt();
                LocalDate dataSaida = LocalDate.of(ano, mes, dia);
                if (dataSaida.isBefore(LocalDate.now())) {
                    System.out.println("Data inválida! Coloque apenas datas futuras!");
                    continue;
                }
                r1.setSaida(dataSaida);
                System.out.println(r1.mostrarReserva());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro, coloque apenas números!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
