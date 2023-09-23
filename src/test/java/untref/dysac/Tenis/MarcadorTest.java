package untref.dysac.Tenis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MarcadorTest {
    @Test
    public void iniciaMarcadoryMuestraPuntosDeJugador()
    {
        Jugador jugadorEquipoA = new Jugador();
        Marcador juegoTenis = new Marcador();
        assertEquals(0,juegoTenis.getMarcador(jugadorEquipoA));
        assertNotEquals(15,juegoTenis.getMarcador(jugadorEquipoA));
    }
}
