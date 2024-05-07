import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JocTest {

    @Test
    public void testNovaPartida() {
        Joc joc = new Joc();
        joc.novaPartida();
        assertEquals(1, joc.getTorn(), "El torn debería ser 1 después de iniciar una nueva partida");
    }

    @Test
    public void testJugar() {
        // Aquí podrías escribir pruebas para el método jugar(), dependiendo de su lógica.
        // Por ejemplo, si hay alguna validación de jugada, podrías probar un caso válido e uno inválido.
    }

    @Test
    public void testJugadaGuanyadora() {
        // Aquí podrías escribir pruebas para el método jugadaGuanyadora(), dependiendo de su lógica.
        // Por ejemplo, si determina qué jugador gana, podrías probar diferentes escenarios de victoria.
    }
}
