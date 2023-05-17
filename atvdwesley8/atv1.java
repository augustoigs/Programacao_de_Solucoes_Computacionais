package atvdwesley8;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite o divisor: ");
            int divisor = scanner.nextInt();

            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        scanner.close();
    }

    public static double dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero");
        }

        return (double) dividendo / divisor;
    }
}