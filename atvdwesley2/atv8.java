package atvdwesley2;

import java.util.Scanner;

public class atv8 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um planeta:");
        System.out.println("1 - Terra");
        System.out.println("2 - Marte");
        System.out.println("3 - Lua");
        System.out.print("Opção: ");
        int planeta = entrada.nextInt();

        System.out.print("Digite a velocidade inicial (v0): ");
        double v0 = entrada.nextDouble();

        System.out.print("Digite o instante de tempo (t): ");
        double t = entrada.nextDouble();

        double g = 0.0;
        String nomePlaneta = "";

        switch (planeta) {
            case 1:
                g = 9.8; // Aceleração da gravidade na Terra (em m/s^2)
                nomePlaneta = "Terra";
                break;
            case 2:
                g = 3.71; // Aceleração da gravidade em Marte (em m/s^2)
                nomePlaneta = "Marte";
                break;
            case 3:
                g = 1.6; // Aceleração da gravidade na Lua (em m/s^2)
                nomePlaneta = "Lua";
                break;
            default:
                System.out.println("Opção inválida.");
                entrada.close();
                return;
        }

        double vt = v0 - g * t;
        double ht = v0 * t - 0.5 * g * t * t;

        System.out.println("No planeta " + nomePlaneta + ":");
        System.out.println("Velocidade no instante t (v(t)): " + vt + " m/s");
        System.out.println("Altura no instante t (h(t)): " + ht + " metros");

        entrada.close();
    }
}