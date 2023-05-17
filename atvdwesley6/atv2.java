package atvdwesley6;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        double[] numeros = new double[tamanho];

        // Lê os números do teclado e armazena no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um número real: ");
            numeros[i] = scanner.nextDouble();
        }

        // Imprime o vetor
        System.out.println("Números informados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Encontra as posições dos números negativos
        System.out.print("Posições dos números negativos: ");
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
