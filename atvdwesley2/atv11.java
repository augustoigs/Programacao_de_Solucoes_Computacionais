package atvdwesley2;

import java.util.Scanner;

public class atv11 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade do cliente: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o sexo do cliente (M - masculino, F - feminino): ");
        char sexo = entrada.next().charAt(0);

        double mensalidade = 0.0;

        if (sexo == 'M') { // Se o sexo for masculino
            if (idade <= 15) {
                mensalidade = 60.0;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75.0;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90.0;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85.0;
            } else { // idade acima de 40
                mensalidade = 80.0;
            }
        } else if (sexo == 'F') { // Se o sexo for feminino
            if (idade <= 18) {
                mensalidade = 60.0;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90.0;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85.0;
            } else { // idade acima de 40
                mensalidade = 80.0;
            }
        } else { // Sexo inválido
            System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
            System.exit(0); // Encerra o programa
        }

        System.out.println("Valor da mensalidade a ser paga: R$ " + mensalidade);

        entrada.close();
    }
}