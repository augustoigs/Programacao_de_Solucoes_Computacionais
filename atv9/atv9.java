package atv9;

import java.util.Scanner;

public class atv9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a1, a , b, c;
		
		System.out.print("Informe o valor de b: ");
		b = input.nextDouble();
		
		System.out.print("Informe o valor de c: ");
		c = input.nextDouble();
		
		a1 = (Math.pow(b, 2)) + (Math.pow(c, 2));
		
		a = Math.sqrt(a1);
		
		System.out.printf("O valor da hipotenusa é de: %.2f ", (a));
		
		System.exit(0);
	}

}
