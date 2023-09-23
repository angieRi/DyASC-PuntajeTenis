package untref.dysac.Tenis;

import org.junit.Test;
import untref.dysac.Tenis.interfaces.JuegoTenisInterface;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JuegoTenisTest {
    @Test
    public void sumaPuntoAJuagador()
    {
        JuegoTenisInterface juego = new JuegoTenis();
        assertEquals(15, juego.sumarPuntos());
        assertEquals(30, juego.sumarPuntos());
        assertEquals(40, juego.sumarPuntos());
        assertNotEquals(10, juego.sumarPuntos());
    }
}
