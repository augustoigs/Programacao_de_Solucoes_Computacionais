package atvdwesley9;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números ordenados para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nDigite o número a ser pesquisado:");
            int numero = scanner.nextInt();

            int comparacoes = buscaBinaria(vetor, numero);
            System.out.println("Número de comparações realizadas: " + comparacoes);

            System.out.println("\nDeseja realizar outra pesquisa? (S/N)");
            String opcao = scanner.next();
            if (!opcao.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        scanner.close();
    }

    public static int buscaBinaria(int[] vetor, int numero) {
        int comparacoes = 0;
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            comparacoes++;

            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == numero) {
                return comparacoes;
            } else if (vetor[meio] < numero) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return comparacoes;
    }
}