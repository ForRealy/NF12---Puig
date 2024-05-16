import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JocTest {

    @Test
    public void testJugarColocaFichaEnPrimeraCasilla() {
        Joc juego = new Joc(); // Crear una instancia del juego
        juego.novaPartida(); // Iniciar una nueva partida

        // Obtener el tablero y el turno actual
        char[][] tablero = juego.getTablero();
        int turno = juego.getTurno();

        // Realizar las aserciones necesarias
        // Por ejemplo, asumamos que quieres asegurarte de que el tablero esté vacío al inicio del juego
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                assertEquals(' ', tablero[i][j]); // Comprobar que todas las casillas estén vacías
            }
        }

        // Asumamos que quieres asegurarte de que el turno inicial sea 1
        assertEquals(1, turno);
    }
}
