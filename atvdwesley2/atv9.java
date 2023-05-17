package atvdwesley2;

import java.util.Scanner;

public class atv9 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("MENU");
        System.out.println("1 - Somar os dois números");
        System.out.println("2 - Multiplicar os dois números");
        System.out.println("3 - Subtrair o número maior pelo número menor");
        System.out.println("4 - Dividir o primeiro número pelo segundo");

        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();

        double resultado = 0.0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 3:
                if (num1 > num2) {
                    resultado = num1 - num2;
                } else if (num1 < num2) {
                    resultado = num2 - num1;
                }
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        entrada.close();
    }
}