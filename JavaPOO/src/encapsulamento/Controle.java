package encapsulamento;

public class Controle implements Controlador{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controle() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        
    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void aumentarVolume() {

    }

    @Override
    public void diminuirVolume() {

    }

    @Override
    public void ativarMudo() {

    }

    @Override
    public void desativarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}