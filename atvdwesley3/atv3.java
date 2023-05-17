package atvdwesley3;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canal;
        int totalAudiencia = 0;
        int[] audienciaPorCanal = new int[5]; // Índices 0 a 4 correspondem aos canais 2, 4, 5, 7 e 12

        // Ler os dados de audiência
        while (true) {
            System.out.print("Digite o número do canal (ou 0 para encerrar): ");
            canal = scanner.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo o canal: ");
            int audiencia = scanner.nextInt();

            // Atualizar a audiência total e a audiência do canal específico
            totalAudiencia += audiencia;
            audienciaPorCanal[canal - 2] += audiencia;
        }

        System.out.println("\nResultados da pesquisa de audiência:");

        // Calcular e exibir o percentual de audiência de cada canal
        for (int i = 0; i < audienciaPorCanal.length; i++) {
            int canalNumero = i + 2;
            double percentualAudiencia = (double) audienciaPorCanal[i] / totalAudiencia * 100;
            System.out.println("Canal " + canalNumero + ": " + percentualAudiencia + "% de audiência");
        }

        scanner.close();
    }
}