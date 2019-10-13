package Colisionadores;

import Entidad.*;

public interface Colisionador {

    public void afectarAliado(Aliado chocada);
    public void afectarEnemigo(Enemigo chocada);
    public void afectarDisparo(Disparo chocada);
    public void afectarGolpeEnemigo(GolpeEnemigo chocada);

}
