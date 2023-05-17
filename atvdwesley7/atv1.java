package atvdwesley7;

import java.util.Scanner;

public class atv1 {
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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

