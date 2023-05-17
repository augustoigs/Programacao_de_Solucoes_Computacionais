package atvdwesley2;

import java.util.Scanner;

public class atv7 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = entrada.nextInt();

        double preco = 0.0;

        switch (codigo) {
            case 1:
                preco = 99.99;
                break;
            case 2:
                preco = 103.89;
                break;
            case 3:
                preco = 49.98;
                break;
            case 4:
                preco = 89.72;
                break;
            case 5:
                preco = 97.35;
                break;
            default:
                System.out.println("Código de produto inválido.");
                entrada.close();
                return;
        }

        System.out.println("O preço do produto é: R$ " + preco);

        entrada.close();
    }
}