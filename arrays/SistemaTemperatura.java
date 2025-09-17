package arrays;

import java.util.Scanner;

public class SistemaTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] temperatura = new double[3];

        double maior, menor, soma = 0, media;

        System.out.println("Digite a temperatura do 1º dia: ");
        temperatura[0] = scanner.nextDouble();
        maior = temperatura[0];
        menor = temperatura[0];
        soma += temperatura[0];

        for (int i = 1; i < temperatura.length; i++) {
            System.out.println("Digite a temperatura do " + (i + 1) + "º dia: ");
            temperatura[i] = scanner.nextDouble();
            soma += temperatura[i];

            if (temperatura[i] > maior) {
                maior = temperatura[i];
            }
            if (temperatura[i] < menor) {
                menor = temperatura[i];
            }
        }

        media = soma / temperatura.length;

        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Média das temperaturas: " + media);

        scanner.close();
    }
}