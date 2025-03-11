package heranca;

public class Aluno extends Pessoa{

    private int matricula;
    private String curso;

    public void cancMatricula() {
        System.out.println("Matrícula cancelada com sucesso!");
    }

    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
