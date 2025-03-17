package exercicios.Resumo;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public int viuMaisUm() {
        return totAssistido++;
    }
    

    public void detalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Login: " + getLogin());
        System.out.println("Exp: " + getExp());
        System.out.println("Total de vídeos assistidos: " + getTotAssistido());

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    protected int ganharExp() {
        return super.ganharExp();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String getSexo() {
        return super.getSexo();
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }

    @Override
    public int getExp() {
        return super.getExp();
    }

    @Override
    public void setExp(int exp) {
        super.setExp(exp);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
