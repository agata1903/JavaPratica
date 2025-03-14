package polimorfismo.animal;

public class Animal {

    protected String nome;
    protected int idade;

    public void emitirSom(){

    }

    public void mover(){

    }

    public String getNome() {
        System.out.println("Nome: " + this.nome);
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
}

