package atvdwesley6;

import java.util.Scanner;

public class atv3 {

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

        // Encontra o menor e o maior número
        double menor = numeros[0];
        double maior = numeros[0];

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}