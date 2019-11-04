package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.Personaje;

import java.util.LinkedList;

public class ColisionadorObjetoMapa implements Colisionador {

    protected ObjetoMapa objeto;

    public ColisionadorObjetoMapa(ObjetoMapa objeto){
        this.objeto=objeto;
    }

    public void afectarAliado(Aliado chocada) {

    }


    public void afectarEnemigo(Enemigo chocada) {
       // objeto.afectar(chocada);
    }


    public void afectarDisparo(Disparo chocada) {

    }


    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }


    public void afectarObjetoMapa(ObjetoMapa chocada) {

    }
}
