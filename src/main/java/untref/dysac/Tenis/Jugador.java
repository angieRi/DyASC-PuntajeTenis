package untref.dysac.Tenis;

public class Jugador{

    private int puntaje;
    private boolean ventaja;

    public int getPuntaje() {
        return puntaje;
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
}
