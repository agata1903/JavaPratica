package enumerate;

import java.util.Date;

public class Programa {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1234, new Date(), OrdemStatus.PAG_PENDENTE);

        System.out.println(pedido);

        OrdemStatus os1 = OrdemStatus.ENTREGUE;

        OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}
