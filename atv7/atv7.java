package atv7;

import java.util.Scanner;

public class atv7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, salario_final, salario_min;
		
		salario_min = 1320.00;
		
		System.out.print("Informe o valor do seu salário: ");
		salario = input.nextDouble();
		
		salario_final = salario / salario_min;
		
		System.out.printf("Você recebe %.2f salários mínimos.", (salario_final));
		
		System.exit(0);

	}

}