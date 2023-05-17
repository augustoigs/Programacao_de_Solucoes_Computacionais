package atvdwesley2;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("Informe a primeira nota (de 0 a 10): ");
		nota1 = input.nextDouble();
		System.out.print("Informe a segunda nota (de 0 a 10): ");
		nota2 = input.nextDouble();
		System.out.print("Informe a terceira nota (de 0 a 10): ");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A sua média é: " + media);
		
		if (media >=0 && media <3)
			System.out.println("Você foi reprovado.");
		else if(media >=3 && media <7) 
			System.out.println("Você deverá fazer o exame.");
		else
			System.out.println("Você foi aprovado.");
		
		System.exit(0);
			
	}

}
