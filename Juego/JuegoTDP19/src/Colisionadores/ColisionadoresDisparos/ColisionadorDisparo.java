package Colisionadores.ColisionadoresDisparos;

import Colisionadores.Colisionador;
import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColisionadorDisparo implements Colisionador {

    protected Disparo disparo;

    public ColisionadorDisparo(Disparo disparo){
        this.disparo=disparo;
    }


    /**
     * Afecta al aliado parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarAliado(Aliado chocada) {

    }

    /**
     * Afecta al Enemigo parametrizado, de la forma que corresponda.
     * Despues de afectarlo, disparo es eliminado.
     *
     *
     * @param chocada
     */
    public void afectarEnemigo(Enemigo chocada) {

        disparo.afectarPersonaje(chocada);
        disparo.eliminarse();
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
     * Afecta al objetoMapaVida del mapa parametrizado, de la forma que corresponda.
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
