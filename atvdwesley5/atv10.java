package atvdwesley5;

import java.util.Scanner;

public class atv10 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas = 10;
        int contador = 0;
        int pessoasFemininasEntre20e40 = 0;

        while (contador < quantidadePessoas) {
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.next().charAt(0);

            if (sexo == 'F' && idade >= 20 && idade <= 40) {
                pessoasFemininasEntre20e40++;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas do sexo feminino entre 20 e 40 anos: " + pessoasFemininasEntre20e40);
    }
}
