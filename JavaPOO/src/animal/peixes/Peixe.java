package polimorfismo.animal.peixes;

import polimorfismo.animal.Animal;

public class Peixe extends Animal {

    protected boolean temBranquias;

    public void nadar(){

    }

    public boolean isTemBranquias() {
        return temBranquias;
    }

    public void setTemBranquias(boolean temBranquias) {
        this.temBranquias = temBranquias;
    }
}
