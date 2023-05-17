package atvdwesley3;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;
        int faltas;
        int alunosAprovados = 0;
        int alunosReprovados = 0;
        int alunosReprovadosNota = 0;
        int alunosReprovadosFaltas = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        int totalNotas = 0;
        int quantidadeAlunos = 0;

        while (true) {
            System.out.print("Digite a nota final (-1 para sair): ");
            nota = scanner.nextInt();

            if (nota < 0) {
                break;
            }

            System.out.print("Digite o total de faltas: ");
            faltas = scanner.nextInt();

            quantidadeAlunos++;

            if (nota >= 90) {
                alunosAprovados++;
            }

            if (nota < 70 || faltas >= 20) {
                alunosReprovados++;

                if (nota < 70) {
                    alunosReprovadosNota++;
                }

                if (faltas >= 20) {
                    alunosReprovadosFaltas++;
                }
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            totalNotas += nota;
        }

        if (quantidadeAlunos > 0) {
            double mediaNotas = (double) totalNotas / quantidadeAlunos;

            System.out.println("Quantidade de alunos com nota final maior ou igual a 90: " + alunosAprovados);
            System.out.println("Quantidade de alunos reprovados por nota ou por faltas: " + alunosReprovados);
            System.out.println("Quantidade de alunos reprovados por nota: " + alunosReprovadosNota);
            System.out.println("Quantidade de alunos reprovados por faltas: " + alunosReprovadosFaltas);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + mediaNotas);
        } else {
            System.out.println("Nenhum aluno informado.");
        }

        scanner.close();
    }
}