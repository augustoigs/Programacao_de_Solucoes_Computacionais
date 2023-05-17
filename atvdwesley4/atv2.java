package atvdwesley4;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double salario;
        char sexo;
        int idade;

        // Validação da nota
        do {
            System.out.print("Digite a nota (entre 0 e 10): ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);

        // Validação do salário
        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        // Validação do sexo
        do {
            System.out.print("Digite o sexo (m ou f): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'm' && sexo != 'f');

        // Validação da idade
        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        System.out.println("\nDados informados corretamente!");

        scanner.close();
    }
}