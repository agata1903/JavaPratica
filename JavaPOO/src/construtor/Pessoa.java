package construtor;

public class Pessoa {

    public String nome;
    public int idade;
    private String cpf;

    public Pessoa(int idade, String nome, String cpf) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CPF: " + this.cpf);
    }

}
