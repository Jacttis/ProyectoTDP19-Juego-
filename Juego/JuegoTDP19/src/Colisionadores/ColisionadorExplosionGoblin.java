package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.PowerUp;

import java.util.LinkedList;

public class ColisionadorExplosionGoblin implements Colisionador {

    private Disparo explosion;
    private LinkedList<Enemigo> enemigosAfectados;

    public ColisionadorExplosionGoblin(Disparo explosion){
        this.explosion=explosion;
        enemigosAfectados=new LinkedList<Enemigo>();
    }

    public void afectarAliado(Aliado chocada) {

    }


    public void afectarEnemigo(Enemigo chocada) {
        boolean yaFueAfectado=false;

        for(Enemigo e : enemigosAfectados)
            if (e.equals(chocada)) {
                yaFueAfectado = true;
                break;
            }

        if(!yaFueAfectado) {
            explosion.afectarPersonaje(chocada);
            enemigosAfectados.add(chocada);
        }
    }


    public void afectarDisparo(Disparo chocada) {

    }


    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }


    public void afectarObjetoMapa(ObjetoMapa chocada) {

    }
}
