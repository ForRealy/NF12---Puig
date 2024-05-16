import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JocTest {

    private Joc juego; // Declara una instancia del juego

    @BeforeEach
    public void setUp() {
        juego = new Joc(); // Inicializa el juego antes de cada prueba
    }

    @Test
    public void testNovaPartidaGeneraTableroVacio() {
        // Llama a la función novaPartida
        juego.novaPartida();

        // Obtener el tablero
        char[][] tablero = juego.getTablero();

        // Verificar que todas las casillas estén vacías
        for (char[] chars : tablero) {
            for (char aChar : chars) {
                assertEquals(' ', aChar);
            }
        }
    }

    @Test
    public void testNovaPartidaIniciaTurnoJugador1() {
        // Llama a la función novaPartida
        juego.novaPartida();

        // Obtener el turno actual
        int turno = juego.getTurno();

        // Verificar que el turno sea del jugador 1
        assertEquals(1, turno);
    }
}
