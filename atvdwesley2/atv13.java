package atvdwesley2;

import java.util.Scanner;

public class atv13 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um comando Git (git clone, git fetch, git pull): ");
        String comando = scanner.nextLine();

        if (comando.equals("git clone")) {
            System.out.println("Comando: git clone");
            System.out.println("Explicação: O comando git clone é usado para clonar um repositório Git existente para o seu computador. Ele cria uma cópia local completa do repositório, incluindo todo o histórico de commits.");

            System.out.println("Exemplo: git clone https://github.com/usuario/repositorio.git");
        } else if (comando.equals("git fetch")) {
            System.out.println("Comando: git fetch");
            System.out.println("Explicação: O comando git fetch é usado para buscar as últimas alterações de um repositório remoto, mas não aplica automaticamente essas alterações ao seu repositório local. Ele atualiza as referências remotas (branches e tags) no seu repositório local.");

            System.out.println("Exemplo: git fetch origin");
        } else if (comando.equals("git pull")) {
            System.out.println("Comando: git pull");
            System.out.println("Explicação: O comando git pull é usado para buscar as últimas alterações de um repositório remoto e aplicá-las automaticamente ao seu repositório local. Ele combina o comando git fetch e o comando git merge em um único passo.");

            System.out.println("Exemplo: git pull origin main");
        } else {
            System.out.println("Comando inválido.");
        }

        scanner.close();
    }
}