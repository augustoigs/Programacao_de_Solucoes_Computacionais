package atvdwesley5;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro positivo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número inteiro positivo: ");
        int numero2 = scanner.nextInt();

        // Verifica se os números são positivos
        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Os números informados devem ser positivos.");
            return;
        }

        // Determina o menor e o maior número
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        // Imprime os números entre os limites
        for (int i = menor + 1; i < maior; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Quebra de linha
    }
}