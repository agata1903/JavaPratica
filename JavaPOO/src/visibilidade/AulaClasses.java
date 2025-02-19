package visibilidade;

import criandoclasses.Caneta;

public class AulaClasses {

    public static void main(String[] args) {

        Caneta c = new Caneta();
        c.modelo = "Bic Crystal";
        c.cor = "Azul";
        c.ponta = 0.5F;
        c.carga = 80;
        c.tampada = false;
        c.status();
        c.rabiscar();
    }
}
