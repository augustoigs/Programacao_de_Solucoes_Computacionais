package atv5;

import java.util.Scanner;

public class atv5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double diagonal_maior, diagonal_menor, area;
		
		System.out.print("Informe a diagonal maior: ");
		diagonal_maior = input.nextDouble();
		
		System.out.print("Informe a diagonal menor: ");
		diagonal_menor = input.nextDouble();
		
		area = (diagonal_maior * diagonal_menor) / 2;
		
		System.out.println("A área do losango é de: " + area + ".");
		
		System.exit(0);
	
	}

}
