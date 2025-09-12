package exercicios.classes.aluno;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String[] disciplinas;
    double[] notas;

    void somaNotas(double[] notas) {
        double soma = 0;
        notas = new double[3];
        for (int i = 0; i <= notas.length; i++) {
            soma += notas[i];
        }
    }
}
