package Colisionadores.ColisionadoresAliados;

import Colisionadores.Colisionador;
import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColisionadorAliado implements Colisionador {

    protected Aliado aliado;

    public ColisionadorAliado(Aliado aliado){
        this.aliado=aliado;
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
     * En este caso, cambiandole el estado a Atacando.
     *
     * @param chocada
     */

    public void afectarEnemigo(Enemigo chocada) {

    }


    public void afectarObjetoMapaDestruible(ObjetoMapa chocada){

    }

    @Override
    public void afectarObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }
}
