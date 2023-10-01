package untref.dysac.Tenis;

public class Jugador{


    private final String nombre;
    private int puntaje;
    private boolean ventaja;
    private int gamesGanados= 0; // game
    private int setsJugador;
    private int puntosTieBrake;
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Con cada pelota exitosa, el jugador gana más puntos de la siguiente manera: 0 → 15 → 30 → 40
     * Si un jugador llega a los 40 puntos y vuelve a obtener una pelota exitosa, ganará un game.
     * (En la medida que el otro jugador no tenga 40 puntos también).
     * Si un jugador se encuentra en ventaja y marca otra vez, ese jugador gana el game.
     * Si ambos jugadores alcanzan 40 puntos que se conoce como deuce.
     * @param puntaje
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    void sumarPuntos(){
        switch (this.puntaje){
            case 0:
                this.puntaje +=15;
                break;
            case 15:
                this.puntaje +=15;
                break;
            case 30:
                this.puntaje +=10;
                break;
            case 40:
                this.puntaje = 0;
                break;
        }
    }

    public boolean hasVentaja() {
        return ventaja;
    }

    public void setVentaja(boolean ventaja) {
        this.ventaja = ventaja;
    }

    /**
     * @return cantidad de Game obtenidos por el jugador
     */
    public int obtenerGamesGanados() {
        return gamesGanados;
    }
    /**
     * Si un jugador llega a los 40 puntos y vuelve a obtener una pelota exitosa, ganará un game.
     * (En la medida que el otro jugador no tenga 40 puntos también).
     * Si un jugador se encuentra en ventaja y marca otra vez, ese jugador gana el game.
     */
    public void sumarGameGanado() {
        this.gamesGanados++;
    }
    /**
     * @return cantidad de Sets obtenidos por el jugador
     */
    public int obtenerSets() {
        return this.setsJugador;
    }

    /**
     * Cada set se gana si un jugador llega a 6 games,
     * siempre y cuando tenga diferencia de 2 games con su contrincante.
     */
    public void ganaSet() {
        this.setsJugador++;
    }

    /**
     * @return cantidad de puntos Tie Brake obtenidos por el jugador
     */
    public int obtenerPuntosTieBrake() {
        return this.puntosTieBrake;
    }

    /**
     * Tie brake.
     * Aquí la secuencia de puntos es de 1 en 1.
     */
    public void ganaPuntoTieBrake() {
        this.puntosTieBrake++;
    }

    public String conseguirNombre() {
        return this.nombre;
    }
}
