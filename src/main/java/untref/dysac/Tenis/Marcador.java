package untref.dysac.Tenis;

import java.util.List;

public class Marcador {

    private List<Jugador> jugadores;
    private int puntosJugadorA;
    private int puntosJugadorB;

    public Marcador(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    void sumarPuntos(Jugador jugador){
        //Jugador jugador = this.jugadores.;

        switch (jugador.getPuntaje()){
            case 0:
                jugador.setPuntaje(15);
                break;
            case 15:
                jugador.setPuntaje(30);
                break;
            case 30:
                jugador.setPuntaje(40);
                break;
            case 40:
                // deberia chequear si hay ventajas
                // dependiendo de cual tenga ventaja se le saca al otro O gana el game
                // si gana un game puede ganar un set-> posibilidad de tie break
                // si gana 3 sets gana el partido?
                jugador.setPuntaje(0);
                break;
        }
    }
    private Jugador jugadorTenis;
    public Marcador(Jugador jugadorEquipo) {
        this.jugadorTenis= jugadorEquipo;
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
