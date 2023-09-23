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

}
