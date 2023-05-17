package atvdwesley5;

import java.util.Scanner;

public class atv8 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int base = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int expoente = scanner.nextInt();

        int potencia = 1;

        for (int i = 1; i <= expoente; i++) {
            potencia *= base;
        }

        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + potencia);
    }
}