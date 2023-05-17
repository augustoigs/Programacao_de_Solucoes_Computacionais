package atvdwesley6;

import java.util.Scanner;

public class atv1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int[] numeros = new int[tamanho];

        // Lê os números do teclado e armazena no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        // Imprime o vetor
        System.out.println("Números informados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Calcula a soma dos números pares
        int somaPares = 0;
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
    }
}