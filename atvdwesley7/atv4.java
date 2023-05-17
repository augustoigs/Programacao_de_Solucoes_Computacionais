package atvdwesley7;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Ler a matriz a partir do teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Trocar os elementos da diagonal principal com os elementos da diagonal secundária
        int tamanho = matriz.length;
        for (int i = 0; i < tamanho; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][tamanho - 1 - i];
            matriz[i][tamanho - 1 - i] = temp;
        }

        // Imprimir a matriz resultante
        System.out.println("Matriz resultante:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}