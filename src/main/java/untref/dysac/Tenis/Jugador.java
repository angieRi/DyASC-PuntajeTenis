package untref.dysac.Tenis;

public class Jugador{

    private int puntaje;

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
        }
    }
}
