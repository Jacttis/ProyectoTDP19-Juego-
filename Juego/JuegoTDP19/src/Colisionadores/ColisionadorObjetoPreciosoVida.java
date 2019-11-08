package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColisionadorObjetoPreciosoVida implements Colisionador {

    protected ObjetoPreciosoVida objetoPreciosoVida;

    public ColisionadorObjetoPreciosoVida(ObjetoPreciosoVida objetoPreciosoVida){
        this.objetoPreciosoVida=objetoPreciosoVida;
    }

    /**
     * Afecta al Aliado parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarAliado(Aliado chocada) {

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
     *
     * @param chocada
     */

    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }

    /**
     * Afecta al objetoMapaVida parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarObjetoMapaDestruible(ObjetoMapa chocada) {

    }

    /**
     * Afecta al objetoPreciosoVida parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }
}
