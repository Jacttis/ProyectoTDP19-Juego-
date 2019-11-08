package Colisionadores.ColisionadoresEnemigos;

import Colisionadores.Colisionador;
import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

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

    /**
     * Afecta al objetoMapaVida parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarObjetoMapaDestruible(ObjetoMapa chocada){
    }

    /**
     * Afecta al objetoPreciosoVida parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }
}
