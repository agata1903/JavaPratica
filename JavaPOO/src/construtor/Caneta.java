package construtor;

public class Caneta {

    public String modelo;
    private float ponta;
    private boolean tampada;
    public String cor;

    public Caneta(String m, float p, String c) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println(this.getModelo());
        System.out.println(this.getPonta());
        System.out.println(this.cor);
        System.out.println(this.tampada);
    }
}
