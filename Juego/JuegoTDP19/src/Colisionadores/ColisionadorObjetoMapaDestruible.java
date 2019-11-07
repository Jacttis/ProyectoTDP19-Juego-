package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColisionadorObjetoMapaDestruible implements Colisionador {

    protected ObjetoMapa objeto;

    public ColisionadorObjetoMapaDestruible(ObjetoMapa objeto){
        this.objeto=objeto;
    }

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
