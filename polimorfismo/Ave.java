package polimorfismo;

public class Ave extends Animal{

    private String corPenas;

    public void fazerNinho(){

    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    @Override
    public void locomover() {
        System.out.println("Voanoo");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo alpiste");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piando");
    }
}
