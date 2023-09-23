package untref.dysac.Tenis;

import org.junit.Test;
import untref.dysac.Tenis.interfaces.JuegoTenisInterface;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JugadorTest{

    @Test
    public void deberiaSumarPuntosSinReset()
    {
        Jugador jugador = new Jugador();
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),15);
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),30);
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),40);
    }

    @Test
    public void deberiaSumarPuntosResetandoLlegarA40()
    {
        Jugador jugador = new Jugador();
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),15);
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),30);
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),40);
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),0);
    }

}
