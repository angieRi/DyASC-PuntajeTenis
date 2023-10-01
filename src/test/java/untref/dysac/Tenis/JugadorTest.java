package untref.dysac.Tenis;

import org.junit.Test;
import untref.dysac.Tenis.interfaces.JuegoTenisInterface;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JugadorTest{

    @Test
    public void jugadorAConseguirGames()
    {
        Jugador jugador = new Jugador("jugadorA");
        jugador.obtenerGamesGanados();
        assertNotEquals(1,jugador.obtenerGamesGanados());
        assertEquals(0,jugador.obtenerGamesGanados());
    }

    @Test
    public void deberiaAgregarYDevolverUnGameGanado(){
        Jugador jugador = new Jugador("jugadorA");
        jugador.sumarGameGanado();
        assertEquals(1,jugador.obtenerGamesGanados());
    }

    @Test
    public void deberiaSumarPuntosSinReset()
    {
        Jugador jugador = new Jugador("jugadorB");
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
        Jugador jugador = new Jugador("jugadorB");
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),15);
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),30);
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),40);
        jugador.sumarPuntos();
        assertEquals(jugador.getPuntaje(),0);
    }
    @Test
    public void obtieneSetDelJugador(){
        Jugador jugador = new Jugador("jugadorA");
        jugador.obtenerSets();
        assertNotEquals(1,jugador.obtenerSets());
    }
    @Test
    public void incrementaSetGanadoDelJugador(){
        Jugador jugadorA = new Jugador("jugadorA");
        jugadorA.ganaSet();
        assertEquals(1,jugadorA.obtenerSets());
    }
    @Test
    public void obtieneTieBrakeDeJugadorA(){
        Jugador jugadorA = new Jugador("jugadorA");
        jugadorA.obtenerPuntosTieBrake();
        assertNotEquals(1,jugadorA.obtenerPuntosTieBrake());
    }
    @Test
    public void sumaUnPuntoTieBrakeDeJugadorA(){
        Jugador jugadorA = new Jugador("jugadorA");
        jugadorA.ganaPuntoTieBrake();
        assertEquals(1,jugadorA.obtenerPuntosTieBrake());
    }
    @Test
    public void deberiaDevolverNombreDeJugador(){
        Jugador jugadorA = new Jugador("jugadorA");

        assertEquals("jugadorA",jugadorA.conseguirNombre());
    }
}
