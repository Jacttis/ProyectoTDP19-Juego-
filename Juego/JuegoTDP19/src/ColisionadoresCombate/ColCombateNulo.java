package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.ObjetosMapa.ObjetoMapaVida;

public class ColCombateNulo implements ColisionadorCombate {

    public void verificarColisionando(){

    }

    public void detectoAliado(Aliado chocada) {

    }


    public void detectoEnemigo(Enemigo chocada) {

    }


    public void detectoDisparo(Disparo chocada) {

    }

    public void detectoGolpeEnemigo(GolpeEnemigo chocada) {

    }

    @Override
    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }
}
