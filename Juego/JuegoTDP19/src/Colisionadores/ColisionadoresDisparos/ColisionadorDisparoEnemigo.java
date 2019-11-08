package Colisionadores.ColisionadoresDisparos;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColisionadorDisparoEnemigo extends ColisionadorDisparo {

    public ColisionadorDisparoEnemigo(Disparo disparo){
        super(disparo);
    }

    /**
     * Redefinicion del afectarAliado en ColisionadorDisparo
     *
     *
     * @param chocada
     */

    public void afectarAliado(Aliado chocada) {
        System.out.println("Golpeando aliado");
        disparo.afectarPersonaje(chocada);
        disparo.eliminarse();
    }

    /**
     * Redefinicion de afectarEnemigo en ColisionadorDisparo
     * Afecta al Enemigo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarEnemigo(Enemigo chocada) {

    }

    /**
     * Redefinicion de afectarDisparo en ColisionadorDisparo
     * Afecta al Disparo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */


    public void afectarDisparo(Disparo chocada) {


    }


    /**
     * Redefinicion de afectarGolpeEnemigo en ColisionadorDisparo
     * Afecta al GolpeEnemigo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */
    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }

    /**
     *
     * Redefinicion de afectarObjetoPreciosoDestruible en ColisionadorDisparo
     * Afecta al ObjetoPreciosoVida parametrizado, de la forma que corresponda.
     * en este caso mandandole al objeto su mensaje serAfectado parametrizando el atributo disparo
     * y luego se elimina
     *
     * @param chocada
     */

    public void afectarObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {
        chocada.serAfectado(disparo);
        disparo.eliminarse();
    }

    /**
     * Redefinicion de afectarObjetoMapaDestruible en ColisionadorDisparo
     * Afecta al ObjetoMapaVida parametrizado, de la forma que corresponda.
     * en este caso mandandole al objeto su mensaje serAfectado parametrizando el atributo disparo
     * y luego se elimina
     *
     * @param chocada
     */

    public void afectarObjetoMapaDestruible(ObjetoMapa chocada) {
        chocada.serAfectado(disparo);
        disparo.eliminarse();
    }
}
