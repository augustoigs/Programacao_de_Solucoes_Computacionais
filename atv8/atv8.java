package atv8;

import java.util.Scanner;

public class atv8 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double peso1, peso2, peso3;
		
		System.out.print("Informe seu peso atual: ");
		peso1 = input.nextDouble();
		
		peso2 = peso1 * 0.15 + peso1;
		peso3 = peso1 * 0.20 + peso1;
		
		System.out.println("O peso caso engorde 15% é de: " + peso2 + 
				" e caso engorde 20% é de: " + peso3);
		
		System.exit(0);		
	}

}