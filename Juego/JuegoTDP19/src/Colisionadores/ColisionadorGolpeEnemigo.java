package Colisionadores;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Enemigo;
import Entidad.GolpeEnemigo;
import Entidad.PowerUp.PowerUp;
import Estados.Caminando;

public class ColisionadorGolpeEnemigo extends ColisionadorDisparo {


    public ColisionadorGolpeEnemigo(GolpeEnemigo golpeEnemigo){
        super(golpeEnemigo);
    }

    /**
     * Afecta al aliado parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarAliado(Aliado chocada) {
        System.out.println("Golpeando aliado");
        disparo.afectarPersonaje(chocada);
        disparo.eliminarse();
    }

    /**
     * Afecta al Enemigo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarEnemigo(Enemigo chocada) {

    }

    /**
     * Afecta al Disparo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */


    public void afectarDisparo(Disparo chocada) {


    }


    /**
     * Afecta al GolpeEnemigo parametrizado, de la forma que corresponda.
     * En este caso, se elimina chocada y el atributo disparo, y se le cambia
     * el estado a caminando al disparador de chocada.
     *
     * @param chocada
     */
    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {
        disparo.eliminarse();
        chocada.eliminarse();

    }

    public void afectarPowerUp(PowerUp chocada){

    }
}
