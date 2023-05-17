package atvdwesley10;

public class atv1 {

	public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 3};

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        System.out.println("\nOrdenação por Bolha:");
        ordenacaoBolha(vetor.clone());
        imprimirVetor(vetor);

        System.out.println("\nOrdenação por Seleção:");
        ordenacaoSelecao(vetor.clone());
        imprimirVetor(vetor);

        System.out.println("\nOrdenação por Inserção:");
        ordenacaoInsercao(vetor.clone());
        imprimirVetor(vetor);
    }

    public static void ordenacaoBolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenacaoSelecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[indiceMinimo];
            vetor[indiceMinimo] = temp;
        }
    }

    public static void ordenacaoInsercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}