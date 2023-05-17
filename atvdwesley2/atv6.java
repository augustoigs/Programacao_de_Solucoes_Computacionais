package atvdwesley2;

import java.util.Scanner;

public class atv6 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor de 'a': ");
        double a = entrada.nextDouble();

        System.out.print("Informe o valor de 'b': ");
        double b = entrada.nextDouble();

        System.out.print("Informe o valor de 'c': ");
        double c = entrada.nextDouble();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau: x = " + (-c / b));
        } else {
            double discriminante = b * b - 4 * a * c;

            if (discriminante < 0) {
                System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + discriminante);
            } else if (discriminante == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + discriminante
                        + ", x' = " + raiz1 + ", x'' = " + raiz2);
            }
        }

        entrada.close();
    }
}

