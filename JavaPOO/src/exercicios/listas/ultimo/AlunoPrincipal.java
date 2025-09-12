package exercicios.listas.ultimo;

import java.util.ArrayList;
import java.util.List;

public class AlunoPrincipal {

    public static void main(String[] args) {

       List<Aluno> alunos = new ArrayList<>();
       alunos.add(new Aluno("Ágata", 10));
       alunos.add(new Aluno("Mariana", 6));
       alunos.add(new Aluno("Ícaro", 9));
       alunos.add(new Aluno("Leo", 5));
       alunos.add(new Aluno("Renan", 10));

       for (Aluno a: alunos) {
           if (a.nota >= 7) {
               System.out.println(a.nome);
           }
       }
    }
}
