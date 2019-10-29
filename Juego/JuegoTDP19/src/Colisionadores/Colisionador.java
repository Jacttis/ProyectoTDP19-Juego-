package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.PowerUp.PowerUp;

public interface Colisionador {

    public void afectarAliado(Aliado chocada);
    public void afectarEnemigo(Enemigo chocada);
    public void afectarDisparo(Disparo chocada);
    public void afectarGolpeEnemigo(GolpeEnemigo chocada);
    public void afectarPowerUp(PowerUp chocada);

}
