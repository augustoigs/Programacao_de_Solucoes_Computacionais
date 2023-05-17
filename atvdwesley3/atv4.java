package atvdwesley3;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalHabitantes = 0;
        double somaSalarios = 0;
        int somaFilhos = 0;

        System.out.println("Informe os dados dos habitantes da cidade:");
        System.out.println("(Digite um salário negativo para encerrar a pesquisa)");

        while (true) {
            System.out.print("Salário do habitante: R$ ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Número de filhos do habitante: ");
            int numFilhos = scanner.nextInt();

            // Atualizar os totais de salários e número de filhos
            totalHabitantes++;
            somaSalarios += salario;
            somaFilhos += numFilhos;
        }

        if (totalHabitantes > 0) {
            // Calcular as médias
            double mediaSalarios = somaSalarios / totalHabitantes;
            double mediaFilhos = (double) somaFilhos / totalHabitantes;

            System.out.println("\nResultados da pesquisa:");
            System.out.printf("Média salarial da população: R$ %.2f%n", mediaSalarios);
            System.out.printf("Média do número de filhos: %.2f%n", mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi informado.");
        }

        scanner.close();
    }
}
