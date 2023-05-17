package atvdwesley6;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        double[] numeros = new double[tamanho];

        // Lê os números do teclado e armazena no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um número real: ");
            numeros[i] = scanner.nextDouble();
        }

        // Imprime os elementos nas posições pares do vetor
        System.out.println("Elementos nas posições pares:");
        for (int i = 0; i < tamanho; i += 2) {
            System.out.print(numeros[i] + " ");
        }
    }
}
