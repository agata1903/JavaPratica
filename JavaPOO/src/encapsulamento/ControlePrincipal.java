package encapsulamento;

public class ControlePrincipal {

    public static void main(String[] args) {

        Controle c = new Controle();
        c.ligar();
        c.play();
        c.aumentarVolume();
        c.ativarMudo();
        c.desativarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
}
