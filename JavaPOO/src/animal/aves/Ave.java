package polimorfismo.animal.aves;

import polimorfismo.animal.Animal;

public class Ave extends Animal {

    protected boolean temPenas;

    public void voar(){

    }

    public boolean isTemPenas() {
        return temPenas;
    }

    public void setTemPenas(boolean temPenas) {
        this.temPenas = temPenas;
    }
}
