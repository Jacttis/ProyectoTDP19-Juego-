package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;

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
    public void afectarObjetoMapa(ObjetoMapa chocada) {

    }
}
