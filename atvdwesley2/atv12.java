package atvdwesley2;

import java.util.Scanner;

public class atv12 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tipo de apartamento (S - simples, D - duplo): ");
        char tipoApartamento = entrada.next().charAt(0);

        System.out.print("Digite a quantidade de dias de hospedagem: ");
        int numDias = entrada.nextInt();

        double diaria = 0.0;

        if (tipoApartamento == 'S') { // Se o tipo de apartamento for simples
            if (numDias < 10) {
                diaria = 100.0;
            } else if (numDias >= 10 && numDias <= 15) {
                diaria = 90.0;
            } else { // numDias > 15
                diaria = 80.0;
            }
        } else if (tipoApartamento == 'D') { // Se o tipo de apartamento for duplo
            if (numDias < 10) {
                diaria = 140.0;
            } else if (numDias >= 10 && numDias <= 15) {
                diaria = 120.0;
            } else { // numDias > 15
                diaria = 100.0;
            }
        } else { // Tipo de apartamento inválido
            System.out.println("Tipo de apartamento inválido. Digite S para simples ou D para duplo.");
            System.exit(0); // Encerra o programa
        }

        double total = diaria * numDias;

        System.out.println("Total a ser pago: R$ " + total);

        entrada.close();
    }
}

