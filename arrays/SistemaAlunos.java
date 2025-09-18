package arrays;

import java.util.Scanner;

public class SistemaAlunos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomeAlunos = new String[4];
        double[] notaAlunos = new double[4];


        for (int i = 0; i < nomeAlunos.length; i++) {
            System.out.println("Digite o nome do aluno: ");
            nomeAlunos[i] = scanner.next();
            System.out.println("Digite a nota desse aluno: ");
            notaAlunos[i] = scanner.nextDouble();
        }

        for (int i = 0; i < nomeAlunos.length; i++) {
            String situacao;

            if (notaAlunos[i] >= 7) {
                situacao = "Aprovado";
            } else if (notaAlunos[i] < 7 && notaAlunos[i] >= 6) {
                situacao = "Recuperação";
            }
            else {
                situacao = "Reprovado";
            }
            System.out.println("Aluno: " + nomeAlunos[i] + " | Nota: " + notaAlunos[i] + " | Situação: " + situacao);
        }
        
    }
}
