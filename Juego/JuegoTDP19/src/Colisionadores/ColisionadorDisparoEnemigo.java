package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.ObjetosMapa.ObjetoMapa;

public class ColisionadorDisparoEnemigo extends ColisionadorDisparo{

    public ColisionadorDisparoEnemigo(Disparo disparo){
        super(disparo);
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

    }

    public void afectarObjetoMapa(ObjetoMapa chocada) {
        chocada.serAfectado(disparo);
        disparo.eliminarse();
    }
}
