package Colisionadores;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Enemigo;
import Entidad.GolpeEnemigo;

public class ColisionadorDisparo implements Colisionador {

    protected Disparo disparo;

    public ColisionadorDisparo(Disparo disparo){
        this.disparo=disparo;
    }


    @Override
    public void afectarAliado(Aliado chocada) {

    }

    @Override
    public void afectarEnemigo(Enemigo chocada) {
        disparo.afectarPersonaje(chocada);
        disparo.eliminarse();
    }

    @Override
    public void afectarDisparo(Disparo chocada) {

    }

    @Override
    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }
}
