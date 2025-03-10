package agregacao;

public class LutadorPrincipal {

    public static void main(String[] args) {

        Lutador[] lutadores = new Lutador[6];

        lutadores[0] = new Lutador("Adalton", "Brasil",
                45, 1.95, 98, 12, 5, 10);

        lutadores[1] = new Lutador("Barry","EUA",
                33, 1.64, 64, 10, 3, 20);

        lutadores[2] = new Lutador("Cassio", "Venezuela",
                39, 1.75, 78, 9, 1, 10);

        lutadores[3] = new Lutador("Danny", "Canadá",
                24, 1.83, 88, 5, 7, 3);

        lutadores[4] = new Lutador("Emmanuel", "França",
                42, 2.00, 102, 15, 0, 12);

        lutadores[5] = new Lutador("Fernando", "Espanha",
                35, 1.81, 84, 10, 3, 7);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutadores[0], lutadores[3]);
        UEC01.lutar();
    }
}
