package trycatch;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private int numeroQuarto;
    private LocalDate entrada;
    private LocalDate saida;

    public Reserva() {
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }

    public int duracao() {
        return saida.getDayOfMonth() - entrada.getDayOfMonth();
    }

    public String mostrarReserva() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Quarto nº: " + this.getNumeroQuarto() + "\nData de entrada: " + this.getEntrada().format(formatter) + "\nData de saída: " +
                this.getSaida().format(formatter) + "\nDias hospedado: " + this.duracao();
    }

}
