package Colisionadores;

import Entidad.*;
import Entidad.PowerUp.PowerUp;

public interface Colisionador {

    public void afectarAliado(Aliado chocada);
    public void afectarEnemigo(Enemigo chocada);
    public void afectarDisparo(Disparo chocada);
    public void afectarGolpeEnemigo(GolpeEnemigo chocada);
    public void afectarPowerUp(PowerUp chocada);

}
