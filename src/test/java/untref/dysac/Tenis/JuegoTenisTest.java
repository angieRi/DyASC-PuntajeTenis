package untref.dysac.Tenis;

import org.junit.Test;
import org.junit.validator.ValidateWith;
import untref.dysac.Tenis.interfaces.JuegoTenisInterface;

import static org.junit.Assert.*;

public class JuegoTenisTest {

    @Test
    public void deberiaSumarPuntosSinReset()
    {
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        juego.sumarPuntos(jugador0);
        assertEquals(jugador0.getPuntaje(),15);
        juego.sumarPuntos(jugador0);
        assertEquals(jugador0.getPuntaje(),30);
        juego.sumarPuntos(jugador0);
        assertEquals(jugador0.getPuntaje(),40);
    }

    @Test
    public void deberiaSumarPuntosResetandoLlegarA40()
    {
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        juego.sumarPuntos(jugador0);
        juego.sumarPuntos(jugador0);
        juego.sumarPuntos(jugador0);
        juego.sumarPuntos(jugador0);

        assertEquals(jugador0.getPuntaje(),0);
    }

    @Test
    public void deberiaGanarGamejugador0()
    {
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        int games;
        juego.sumarPuntos(jugador0);//15
        juego.sumarPuntos(jugador0);////30
        juego.sumarPuntos(jugador0);////40
        juego.sumarPuntos(jugador0);////0 -> un game ganado

        //games = JuegoTenis.getGames(0).getGames();
    }

    @Test
    public void deberiaEstarEnEstadoDeuce(){
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        juego.sumarPuntos(jugador0);//15
        juego.sumarPuntos(jugador0);////30
        juego.sumarPuntos(jugador0);////40

        juego.sumarPuntos(jugador1);//15
        juego.sumarPuntos(jugador1);////30
        juego.sumarPuntos(jugador1);////40

        assertTrue(juego.estaEnEstadoDeuce());
    }

    @Test
    public void deberiaNoEstarEnEstadoDeuce(){
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        juego.sumarPuntos(jugador0);//15
        juego.sumarPuntos(jugador0);////30
        juego.sumarPuntos(jugador0);////40

        assertFalse(juego.estaEnEstadoDeuce());
    }

    @Test
    public void deberiaJugador0EstarEnVentaja(){
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        juego.sumarPuntos(jugador0);//15
        juego.sumarPuntos(jugador0);////30
        juego.sumarPuntos(jugador0);////40

        juego.sumarPuntos(jugador1);//15
        juego.sumarPuntos(jugador1);////30
        juego.sumarPuntos(jugador1);////40

        assertTrue(juego.estaEnEstadoDeuce());
        juego.sumarPuntos(jugador0);
        juego.cambiarEstadoDeVentaja(jugador0);
        assertEquals("jugador 0",juego.obtenerJugadorConVentaja());
    }
    @Test
    public void deberiaJugador0GanarUnGame(){
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        juego.sumarPuntos(jugador0);//15
        juego.sumarPuntos(jugador0);////30
        juego.sumarPuntos(jugador0);////40

        juego.sumarPuntos(jugador1);//15
        juego.sumarPuntos(jugador1);////30

        juego.sumarPuntos(jugador0);

        assertEquals(1,jugador0.obtenerGamesGanados());
    }
    @Test
    public void reiniciPuntosDeJugadoresA0(){
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        juego.sumarPuntos(jugador0);//15
        juego.sumarPuntos(jugador0);////30
        juego.sumarPuntos(jugador0);////40

        juego.sumarPuntos(jugador1);//15
        juego.sumarPuntos(jugador1);////30

        juego.sumarPuntos(jugador0);

        assertEquals(1,jugador0.obtenerGamesGanados());
        juego.reiniciarPuntosDeJugadores();
        assertEquals(0,jugador0.getPuntaje());
        assertEquals(0,jugador1.getPuntaje());
    }
    @Test
    public void jugador0DeberiaGanarUnSet(){
        Jugador jugador0 = new Jugador("jugador 0");
        Jugador jugador1 = new Jugador("jugador 1");
        JuegoTenis juego = new JuegoTenis(jugador0,jugador1);

        for(int i=0; i<6;i++){
            juego.sumarPuntos(jugador0);//15
            juego.sumarPuntos(jugador0);//30
            juego.sumarPuntos(jugador0);//40

            juego.sumarPuntos(jugador1);//15
            juego.sumarPuntos(jugador1);//30

            juego.sumarPuntos(jugador0);
        }
        assertEquals(6,jugador0.obtenerGamesGanados());
    }
}
