package heranca;

public class PessoaPrincipal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno(123456789, "Informática");
        Professor p3 = new Professor("Java", 2500.0);
        Funcionario p4 = new Funcionario("Limpeza", true);
    }
}
