package exercicios.Resumo;

public class GafanhotoPrincipal {

    public static void main(String[] args) {

        Video v[] = new Video[2];
        v[0] = new Video("Aula 1 de Java");
        v[1] = new Video("Aula 2 de Java");
        System.out.println(v[0].toString());

        Gafanhoto g = new Gafanhoto();
        g.setNome("Ágata");
        g.setIdade(28);
        g.setSexo("F");
        g.setLogin("Tata");
        g.setTotAssistido(26);
        g.setExp(329);
        g.ganharExp();
        g.viuMaisUm();
        g.detalhes();

        Visualizacao visualizacao = new Visualizacao(g, v[0]);
        visualizacao.avaliar(10);

        System.out.println(visualizacao.toString());
    }
}
