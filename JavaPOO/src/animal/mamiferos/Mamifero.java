package polimorfismo.animal.mamiferos;

import polimorfismo.animal.Animal;

public class Mamifero extends Animal {

    protected boolean temPelos;

    public void amamentar(){

    }

    public boolean isTemPelos() {
        return temPelos;
    }

    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }
}