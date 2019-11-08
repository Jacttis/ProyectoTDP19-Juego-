package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColisionadorNulo implements Colisionador {

    /**
     * Redefiniciones de metodos generales para que cuando se este en este
     * Colisionador no produzcan ninguna funcion.
     *
     */

    public void afectarAliado(Aliado chocada) {

    }


    public void afectarEnemigo(Enemigo chocada) {

    }


    public void afectarDisparo(Disparo chocada) {

    }


    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }


    public void afectarObjetoMapaDestruible(ObjetoMapa chocada) {

    }


    public void afectarObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }
}
