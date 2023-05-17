package atv4;

import java.util.Scanner;

public class atv4 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salario = entrada.nextDouble();

        double aumento = salario * 0.25; // Calcula o valor do aumento (25% do salário)
        double novoSalario = salario + aumento; // Calcula o novo salário

        System.out.printf("O novo salário do funcionário sera: R$ %.2f", novoSalario);
        entrada.close();
    }
}

	