package exercicios.repeticoes.loopfor;

public class Quadrados {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            int quadrado = (int) Math.pow(i, 2);
            System.out.println(i + "²" + " = " + quadrado);
        }
    }
}
