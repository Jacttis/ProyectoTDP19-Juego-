package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColisionadorNulo implements Colisionador {
    @Override
    public void afectarAliado(Aliado chocada) {

    }

    @Override
    public void afectarEnemigo(Enemigo chocada) {

    }

    @Override
    public void afectarDisparo(Disparo chocada) {

    }

    @Override
    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }

    @Override
    public void afectarObjetoMapaDestruible(ObjetoMapa chocada) {

    }

    @Override
    public void afectarObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }
}
