package atvdwesley5;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número natural: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. O número deve ser não negativo.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println(numero + "! = " + fatorial);
        }
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
