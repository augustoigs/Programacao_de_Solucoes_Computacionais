package atvdwesley2;

import java.util.Scanner;

public class atvd5 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro lado em cm: ");
        double a = entrada.nextDouble();

        System.out.print("Informe o segundo lado em cm: ");
        double b = entrada.nextDouble();

        System.out.print("Informe o terceiro lado em cm: ");
        double c = entrada.nextDouble();

        boolean condicao1 = Math.abs(b - c) < a && a < (b + c);
        boolean condicao2 = Math.abs(a - c) < b && b < (a + c);
        boolean condicao3 = Math.abs(a - b) < c && c < (a + b);

        if (condicao1 && condicao2 && condicao3) {
            System.out.println("Resposta: os três valores informados podem ser os comprimentos dos lados de um triângulo.");
        } else {
            System.out.println("Resposta: os três valores informados não podem ser os comprimentos dos lados de um triângulo.");
        }

        entrada.close();
    }
}
