import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear matriz de equipos (Champions League)
        String[][] equipos = new String[19][11]; // 32 equipos con 11 jugadores cada uno

        // Nombres de ejemplo para equipos y jugadores
        String[] nombresEquipos = {"Almería", "Atlético de Madrid", "Real Betis", "Celta de Vigo", "Espanyol", "Girona", "Osasuna",
                "Real Madrid", "Sevilla FC", "Real Valladolid", "Athletic Club", "Barcelona", "Cádiz", "Elche", "Getafe",
                "Mallorca", "Real Sociedad", "Rayo Vallecano", "Levante"};
        String[] nombresJugadores = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11"};

        // Asignar nombres a equipos y jugadores
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 11; j++) {
                equipos[i][j] = nombresJugadores[j] + " (Equipo " + (i + 1) + ")";
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la simulación del FIFA!");

        // Ingresar nombre y apellido del árbitro
        System.out.print("Por favor, ingresa tu nombre y apellido: ");
        String arbitro = scanner.nextLine();

        // Elegir equipo
        System.out.println("Por favor, elige un equipo (1-32):");
        for (int i = 1; i <= 19; i++) {
            System.out.println(i + ". " + nombresEquipos[i - 1]);
        }
        int equipoSeleccionado = scanner.nextInt();
        while (equipoSeleccionado < 1 || equipoSeleccionado > 19) {
            System.out.println("Selección inválida. Por favor, elige un equipo (1-32):");
            equipoSeleccionado = scanner.nextInt();
        }

        // Mostrar información del equipo seleccionado y el árbitro
        System.out.println("Equipo seleccionado: " + nombresEquipos[equipoSeleccionado - 1]);
        System.out.println("Jugadores:");
        for (int i = 0; i < 11; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + equipos[equipoSeleccionado - 1][i]);
        }
        System.out.println("Árbitro: " + arbitro);

        // Mostrar la formación del equipo en formato ASCII
        System.out.println("\nFormación 4-4-2:");
        System.out.println("       " + equipos[equipoSeleccionado - 1][0]+" Portero" ); //
        System.out.println(" " + equipos[equipoSeleccionado - 1][1] + " 1" + equipos[equipoSeleccionado - 1][2] + " " + equipos[equipoSeleccionado - 1][3] + " " + equipos[equipoSeleccionado - 1][4]); // Defensores
        System.out.println(equipos[equipoSeleccionado - 1][5] + " " + equipos[equipoSeleccionado - 1][6] + " " + equipos[equipoSeleccionado - 1][7] + " " + equipos[equipoSeleccionado - 1][8]); // Centrocampistas
        System.out.println("   " + equipos[equipoSeleccionado - 1][9] + " " + equipos[equipoSeleccionado - 1][10]); // Delanteros

        scanner.close();
    }
}

