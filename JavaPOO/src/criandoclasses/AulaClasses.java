package criandoclasses;

public class AulaClasses {

    public static void main(String[] args) {

        Caneta c = new Caneta();
        c.cor = "Azul";
        c.modelo = "Bic";
        c.ponta = 0.5f;
        c.carga = 100;
        c.tampar();
        c.status();
        c.rabiscar();
    }
}
