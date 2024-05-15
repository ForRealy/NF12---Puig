public class Main {
    public static void main(String[] args) {
        // Crear instancias de TUI y Joc
        TUI tui = new TUI();
        Joc joc = new Joc();

        // Mostrar el menú y gestionar las opciones
        int opcion;
        do {
            opcion = tui.mostrarMenu();
            switch (opcion) {
                case 1:
                    novaPartida(joc, tui);
                    break;
                case 2:
                    carregarPartida(joc, tui);
                    break;
                case 3:
                    configuracio(tui);
                    break;
                case 4:
                    sortir();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void novaPartida(Joc joc, TUI tui) {
        joc.novaPartida();
        boolean partidaEnCurso = true;
        int turnoActual = 1; // Comenzar con el jugador 1

        while (partidaEnCurso) {
            tui.mostrarTaulell(joc.getTablero(), turnoActual);
            int[] jugada = tui.recollirJugada();
            joc.jugar(jugada[0], jugada[1]);

            // Verificar si la jugada es ganadora
            if (joc.jugadaGuanyadora(jugada[0], jugada[1])) {
                tui.mostrarTaulell(joc.getTablero(), turnoActual);
                tui.fiDePartida(turnoActual);
                partidaEnCurso = false;
            } else if (tableroLleno(joc.getTablero())) {
                tui.mostrarTaulell(joc.getTablero(), turnoActual);
                tui.fiDePartida(0); // Empate
                partidaEnCurso = false;
            } else {
                // Cambiar el turno
                turnoActual = (turnoActual == 1) ? 2 : 1;
            }
        }
    }

    private static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void carregarPartida(Joc joc, TUI tui) {
        // Aquí se podría implementar la lógica para cargar una partida
        System.out.println("Funcionalidad de cargar partida aún no implementada.");
    }

    private static void configuracio(TUI tui) {
        // Aquí se mostraría el menú de configuración
        System.out.println("Funcionalidad de configuración aún no implementada.");
    }

    private static void sortir() {
        System.out.println("Saliendo de la aplicación...");
        System.exit(0);
    }
}
