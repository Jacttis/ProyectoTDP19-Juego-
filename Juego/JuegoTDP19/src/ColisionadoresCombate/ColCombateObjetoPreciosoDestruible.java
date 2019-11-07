package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColCombateObjetoPreciosoDestruible implements ColisionadorCombate {

    public void verificarColisionando() {

    }


    public void detectoAliado(Aliado chocada) {

    }


    public void detectoEnemigo(Enemigo chocada) {
        chocada.getEstado().cambiarAAtacando();
    }


    public void detectoDisparo(Disparo chocada) {

    }


    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }


    public void detectoObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }
}
