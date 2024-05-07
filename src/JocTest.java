import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JocTest {

    @Test
    public void testNovaPartida() {
        Joc joc = new Joc();
        joc.novaPartida();
    }

    @Test
    public void testJugar() {
        Joc joc = new Joc();
        joc.jugar();
    }

    @Test
    public void testJugadaGuanyadora() {
        Joc joc = new Joc();
        joc.jugadaGuanyadora();
    }
}
