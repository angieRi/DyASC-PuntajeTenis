package untref.dysac.Tenis;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MarcadorTest {
    @Test
    public void iniciaMarcadoryMuestraPuntosDeJugador()
    {
        Jugador jugadorEquipoA = new Jugador("as");
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("jugador 1"));
        jugadores.add(new Jugador("jugador 2"));
        Marcador juegoTenis = new Marcador(jugadores);
        assertEquals(0,juegoTenis.getMarcador(jugadorEquipoA));
        assertNotEquals(15,juegoTenis.getMarcador(jugadorEquipoA));
    }
    @Test
    public void marcadorConseguirGame()
    {
        Jugador jugadorEquipoA = new Jugador("as");
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("jugador 1"));
        jugadores.add(new Jugador("jugador 2"));
        Marcador juegoTenis = new Marcador(jugadores);
     //   assertEquals(0,juegoTenis.getGames());
        assertNotEquals(15,juegoTenis.getMarcador(jugadorEquipoA));
    }
}
