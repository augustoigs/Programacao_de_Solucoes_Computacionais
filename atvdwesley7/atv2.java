package atvdwesley7;

import java.util.Scanner;

public class atv2 {

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

        // Imprimir os elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar
        System.out.println("Elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("- "); // Imprimir um traço para outras posições
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}