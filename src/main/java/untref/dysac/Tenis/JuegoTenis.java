package untref.dysac.Tenis;

public class JuegoTenis{

    private Jugador[] jugadores;
    private int[] games;
    private boolean hayEstadoDeuce;

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
    // debería chequear si hay ventajas
    // dependiendo de cual tenga ventaja se le saca al otro O gana el game
    // si gana un game puede ganar un set-> posibilidad de tie break
    // si gana 3 sets gana el partido?
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
                jugador.setPuntaje(40);//jugador tiene 40 puntos
                break;
            case 40:
                if(this.estaEnEstadoDeuce()){ //si el estado de juego es Deuce, entonces jugador entra en ventaja
                    this.cambiarEstadoDeVentaja(jugador);
                }else{
                    jugador.sumarGameGanado();//Si un jugador llega a los 40 puntos y vuelve a obtener una pelota exitosa, ganará un game
                   this.reiniciarPuntosDeJugadores();//reinicia el juego
                }
                break;
        }
    }

    /**
     * verifica si juego está en estado deuce(ambos jugadores tienen 40 puntos)
     * @return
     */
    public boolean estaEnEstadoDeuce(){
        int puntajeJugador1 = this.jugadores[0].getPuntaje();
        int puntajeJugador2 = this.jugadores[1].getPuntaje();
        if(( puntajeJugador1 == puntajeJugador2) &&
                puntajeJugador2==40){
            this.hayEstadoDeuce = true;
        } else {
            this.hayEstadoDeuce = false;
        }
        return hayEstadoDeuce;
    }

    public void cambiarEstadoDeVentaja(Jugador jugador) {
        jugador.setVentaja(true);
    }

    public String obtenerJugadorConVentaja() {
        return this.jugadores[0].hasVentaja()? this.jugadores[0].conseguirNombre(): this.jugadores[1].conseguirNombre();
    }

    /**
     * Cada set se gana si un jugador llega a 6 games, siempre y cuando tenga diferencia de 2 games con su contrincante.
     * @return
     */
    public String obtenerJugadorConMasGames()
    {
        int gamesJugador1 =this.jugadores[0].obtenerGamesGanados();
        int gamesJugador2 =this.jugadores[1].obtenerGamesGanados();
        return gamesJugador1 > gamesJugador2? this.jugadores[0].conseguirNombre():this.jugadores[1].conseguirNombre();
    }

    /**
     * reinicia el juego, coloca los puntos de los jugadores a 0
     */
    public void reiniciarPuntosDeJugadores() {
        jugadores[0].setPuntaje(0);
        jugadores[1].setPuntaje(0);
    }
}
