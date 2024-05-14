public class Main {
    public static void main(String[] args) {
        // Crear instancias de TUI y Joc
        TUI tui = new TUI();
        Joc joc = new Joc();

        // Mostrar el menú y gestionar las opciones
        int opcion = 0;
        boolean jugar = false;
        do {
            if (!jugar) {
                opcion = tui.mostrarMenu();
                switch (opcion) {
                    case 1:
                        novaPartida(joc, tui);
                        jugar = true;
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
            } else {
                // Si estamos jugando, solo mostramos el tablero y recogemos la jugada
                tui.mostrarTaulell(joc.getTablero(), joc.getTurno());
                int[] jugada = tui.recollirJugada();
                // Aquí podríamos agregar lógica para jugar la jugada y verificar si hay un ganador
                // Por ahora, simplemente cambiamos de turno
                joc.jugar(jugada[0], jugada[1]);
                // Si hay un ganador o la partida termina en empate, dejamos de jugar
                if (joc.jugadaGuanyadora(jugada[0], jugada[1]) || partidaEmpatada(joc)) {
                    jugar = false;
                }
            }
        } while (opcion != 4);
    }

    private static void novaPartida(Joc joc, TUI tui) {
        // Iniciar una nueva partida
        joc.novaPartida();
        // Aquí podríamos agregar más lógica relacionada con la nueva partida
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

    private static boolean partidaEmpatada(Joc joc) {
        // Aquí podrías implementar la lógica para verificar si la partida termina en empate
        return false; // Por ahora, siempre devolvemos falso
    }
}
