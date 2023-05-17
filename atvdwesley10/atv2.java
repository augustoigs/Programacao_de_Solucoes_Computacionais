package atvdwesley10;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nEscolha o método de ordenação:");
        System.out.println("1. Bolha");
        System.out.println("2. Seleção");
        System.out.println("3. Inserção");

        int opcao = scanner.nextInt();

        Ordenacao ordenacao = new Ordenacao();

        switch (opcao) {
            case 1:
                ordenacao.ordenacaoBolha(vetor);
                break;
            case 2:
                ordenacao.ordenacaoSelecao(vetor);
                break;
            case 3:
                ordenacao.ordenacaoInsercao(vetor);
                break;
            default:
                System.out.println("Opção inválida. O vetor não será ordenado.");
                break;
        }

        System.out.println("\nVetor ordenado:");
        ordenacao.imprimirVetor(vetor);

        scanner.close();
    }
}
