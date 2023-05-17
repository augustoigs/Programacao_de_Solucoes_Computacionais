package atvdwesley2;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("Informe o primeiro lado: ");
		a = input.nextDouble();
		System.out.print("Informe o segundo lado: ");
		b = input.nextDouble();
		System.out.print("Informe o terceiro lado: ");
		c = input.nextDouble();
		
		if (a == b && b == c) 
			System.out.println("O triângulo é Equilátero.");
				
		else if (a == b || b == c || c == a)
			System.out.println("O triângulo é Isósceles.");
		
		else 
			System.out.println("O triângulo é Escaleno.");
	
	System.exit(0);	
	}

}
