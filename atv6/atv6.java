package atv6;

import java.util.Scanner;

public class atv6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.print("Informe a temperatura em Celsius: ");
		celsius = input.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32;
		System.out.println("A temperatura em Fahrenheit é de:  " + fahrenheit + ".");
		
		System.exit(0);

	}

}