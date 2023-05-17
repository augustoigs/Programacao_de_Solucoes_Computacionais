package atv3;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double cotacao, qtd_dol, qtd_real;
		
		System.out.println("Olá, aqui vamos converter o valor "
				+ "de dólares que você possui em reais.");
		System.out.print("Digite a cotação atual do dólar em Reais: ");
		cotacao = input.nextDouble();
		
		System.out.print("Quanto você possui em Dólares? ");
		qtd_dol = input.nextDouble();
		
		qtd_real = cotacao * qtd_dol;
		
		System.out.printf("A quantidade de reais que você possui é: %.2f %n",
				(qtd_real));
		
		System.exit(0);
		
	}

}