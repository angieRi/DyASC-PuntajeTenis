package untref.dysac.Tenis;

import untref.dysac.Tenis.interfaces.JuegoTenisInterface;

public class JuegoTenis{

    private Jugador[] jugadores;
    private int[] games;

    public JuegoTenis(Jugador jugador1, Jugador jugador2){
        this.jugadores = new Jugador[2];
        this.jugadores[0] = jugador1;
        this.jugadores[1] = jugador2;
        this.games = new int[]{0, 0};
    }

    public Jugador getJugador(int numeroJugador) {
        return jugadores[numeroJugador];
    }

    public int getGames(int numeroJugador){
        return games[numeroJugador];
    }

    public void sumarPuntos(Jugador jugador){
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
                if(jugador.hasVentaja()){

                }
                // deberia chequear si hay ventajas
                // dependiendo de cual tenga ventaja se le saca al otro O gana el game
                // si gana un game puede ganar un set-> posibilidad de tie break
                // si gana 3 sets gana el partido?
                jugador.setPuntaje(0);
                break;
        }
    }
}
