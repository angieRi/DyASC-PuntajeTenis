package untref.dysac.Tenis;

import java.util.List;

public class Marcador {
    // solo la parte visual
    private List<Jugador> jugadores;
    private int puntosJugadorA;
    private int puntosJugadorB;

    public Marcador(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public Object getMarcador(Jugador jugadorEquipoA) {
        return jugadorEquipoA.getPuntaje();
    }

    public void mostrarPuntos(int jugadorA, int jugadorB)
    {
        this.puntosJugadorA=jugadorA;
        this.puntosJugadorB=jugadorB;
        System.out.print("JugadorA:" +this.puntosJugadorA+ " JugadorB:" + this.puntosJugadorB);
    }
}
