package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.PowerUp.PowerUp;

public class ColisionadorEnemigo implements Colisionador {

    protected Enemigo enemigo;

    public ColisionadorEnemigo(Enemigo enemigo){
        this.enemigo=enemigo;
    }



    /**
     * Afecta al aliado parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarAliado(Aliado chocada) {

    }

    /**
     * Afecta al GolpeEnemigo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }

    /**
     * Afecta al Disparo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */


    public void afectarDisparo(Disparo chocada) {


    }

    /**
     * Afecta al Enemigo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarEnemigo(Enemigo chocada) {

    }

    public void afectarPowerUp(PowerUp chocada){

    }
}
