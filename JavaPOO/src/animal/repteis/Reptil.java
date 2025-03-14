package polimorfismo.animal.repteis;

import polimorfismo.animal.Animal;

public class Reptil extends Animal {

    protected boolean temEscamas;

    public void rastejar(){

    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }
}
