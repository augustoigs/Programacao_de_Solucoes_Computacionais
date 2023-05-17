package atvdwesley2;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota;
		
		System.out.print("Digite sua nota: ");
		nota = input.nextDouble();
		
		if (nota >= 7) { 
			System.out.println("Você foi aprovado. ");
		}
		else {
			System.out.println("Você foi reprovado. ");
		}
		
		System.exit(0);
		
	}

}