package atvdwesley5;

import java.util.Scanner;

public class atv5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite os números (digite 0 para encerrar):");

        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            numero = scanner.nextInt();
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        } else {
            System.out.println("Nenhum número foi informado.");
        }
    }
}