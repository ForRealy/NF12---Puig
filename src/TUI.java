import java.util.Scanner;

public class TUI {
    private Scanner scanner;

    public TUI() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Nueva Partida");
        System.out.println("2. Cargar Partida");
        System.out.println("3. Configuración");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarTaulell(char[][] tablero, int turno) {
        System.out.println("Tablero:");
        // Mostrar el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[" + tablero[i][j] + "] ");
            }
            System.out.println();
        }
        // Mostrar el turno del jugador actual
        System.out.println("Turno del jugador: " + turno);
    }

    public int[] recollirJugada() {
        int[] jugada = new int[2];
        System.out.print("Introduce la fila: ");
        jugada[0] = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce la columna: ");
        jugada[1] = Integer.parseInt(scanner.nextLine());
        return jugada;
    }

    public void fiDePartida(int ganador) {
        if (ganador == 0) {
            System.out.println("La partida ha terminado en empate.");
        } else {
            System.out.println("El jugador " + ganador + " ha ganado la partida.");
        }
    }
}
