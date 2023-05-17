package atvdwesley9;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nDigite o número a ser pesquisado:");
            int numero = scanner.nextInt();

            System.out.println("\nQual algoritmo de busca deseja utilizar?");
            System.out.println("1. Sequencial");
            System.out.println("2. Sequencial com Sentinela");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int comparacoesSequencial = buscaSequencial(vetor, numero);
                    System.out.println("Número de comparações realizadas: " + comparacoesSequencial);
                    break;
                case 2:
                    int comparacoesSentinela = buscaSequencialSentinela(vetor, numero);
                    System.out.println("Número de comparações realizadas: " + comparacoesSentinela);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    public static int buscaSequencial(int[] vetor, int numero) {
        int comparacoes = 0;

        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == numero) {
                return comparacoes;
            }
        }

        return comparacoes;
    }

    public static int buscaSequencialSentinela(int[] vetor, int numero) {
        int comparacoes = 0;

        int tamanho = vetor.length;
        int ultimoElemento = vetor[tamanho - 1];
        vetor[tamanho - 1] = numero;

        int i = 0;
        while (vetor[i] != numero) {
            comparacoes++;
            i++;
        }

        vetor[tamanho - 1] = ultimoElemento;

        if (i < tamanho - 1 || vetor[tamanho - 1] == numero) {
            return comparacoes;
        } else {
            return comparacoes + 1;
        }
    }
}
