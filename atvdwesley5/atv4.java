package atvdwesley5;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        System.out.println("Digite as idades (digite um número negativo para encerrar):");

        int idade = scanner.nextInt();

        while (idade >= 0) {
            somaIdades += idade;
            contador++;

            idade = scanner.nextInt();
        }

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}