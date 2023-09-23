package untref.dysac.Tenis;

import untref.dysac.Tenis.interfaces.JuegoTenisInterface;

public class JuegoTenis implements JuegoTenisInterface {

    public int puntos = 0;

    /**
     * incrementa puntos del jugador
     * @return puntos del jugador
     */
    @Override
    public int sumarPuntos() {
        switch (this.puntos){
            case 0:
                this.puntos +=15;
                break;
            case 15:
                this.puntos +=15;
                break;
            case 30:
                this.puntos +=10;
                break;
        }
        return this.puntos;
    }
}
