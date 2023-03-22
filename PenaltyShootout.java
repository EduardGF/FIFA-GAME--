import java.util.Scanner;

public class PenaltyShootout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de rondas de penaltis:");
        int numRondas = scanner.nextInt();
        chutePenaltis(numRondas);
    }

    public static void chutePenaltis(int numRondas) {
        for (int i = 1; i <= numRondas; i++) {
            System.out.println("Ronda " + i + ":");
            boolean gol = Math.random() < 0.5;
            mostrarPorteria(gol);
            if (gol) {
                System.out.println("¡Gol!");
            } else {
                System.out.println("¡Falló!");
            }
        }
    }

    public static void mostrarPorteria(boolean gol) {
        System.out.println("═════════");
        System.out.println("      ║");
        System.out.println("      ║");
        if (gol) {
            System.out.println("   👤 ║ ⚽");
        } else {
            System.out.println(" ⚽👤 ║");
        }
        System.out.println("      ║");
        System.out.println("═════════");
    }
}
