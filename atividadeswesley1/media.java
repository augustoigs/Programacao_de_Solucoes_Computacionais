package atividadeswesley1;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das notas é: %.2f\n", media);

	}

}
