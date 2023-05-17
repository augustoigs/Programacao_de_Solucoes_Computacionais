package atvdwesley7;

import java.util.Scanner;

public class atv3 {

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

        // Imprimir a matriz informada
        System.out.println("Matriz informada:");
        imprimirMatriz(matriz);

        // Imprimir a matriz transposta
        int[][] matrizTransposta = transporMatriz(matriz);
        System.out.println("Matriz transposta:");
        imprimirMatriz(matrizTransposta);

        scanner.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] matrizTransposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        return matrizTransposta;
    }
}