package criandoclasses;

public class Caneta {

    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;
    public void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Seu modelo é " + this.modelo);
        System.out.println("Sua ponta é de " + this.ponta);
        System.out.println("Sua carga é de " + this.carga + "%");
        if (!this.tampada) {
            System.out.println("Ela não está tampada");
        }
        else {
            System.out.println("Ela está tampada");
        }
    }
    public void rabiscar() {
        if (!tampada) {
            System.out.println("Rabiscando...");
        }
        else {
            System.out.println("Destampe para rabiscar");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
