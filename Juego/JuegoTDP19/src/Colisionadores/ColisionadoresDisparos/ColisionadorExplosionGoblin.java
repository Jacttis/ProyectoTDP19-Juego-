package Colisionadores.ColisionadoresDisparos;

import Colisionadores.Colisionador;
import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

import java.util.LinkedList;

public class ColisionadorExplosionGoblin implements Colisionador {

    private Disparo explosion;
    private LinkedList<Enemigo> enemigosAfectados;

    public ColisionadorExplosionGoblin(Disparo explosion){
        this.explosion=explosion;

        //La lista de enemigos afectados determinara si la explosion ya afecto a un enemigo, para no afectarlo dos veces.
        enemigosAfectados=new LinkedList<Enemigo>();
    }

    /**
     * Afecta al aliado parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarAliado(Aliado chocada) {

    }

    /**
     * Afecta al Enemigo parametrizado, de la forma que corresponda.
     * En este caso si el enemigo no fue afectado todavia, lo afecta y lo agrega en la lista enemigosAfectados
     * Si ya fue afectado, no realiza ninguna accion.
     *
     * @param chocada
     */

    public void afectarEnemigo(Enemigo chocada) {
        boolean yaFueAfectado=false;

        //Recorre la lista enemigosAfectados para verificar si chocada esta en la lista
        for(Enemigo e : enemigosAfectados)
            if (e.equals(chocada)) {
                yaFueAfectado = true;
                break;
            }

        //El if observa si chocada no esta en la lista, en este caso la afecta y la mete a la lista.
        if(!yaFueAfectado) {
            explosion.afectarPersonaje(chocada);
            enemigosAfectados.add(chocada);
        }
    }

    /**
     * Afecta al disparo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarDisparo(Disparo chocada) {

    }

    /**
     * Afecta al GolpeEnemigo parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }

    /**
     * Afecta al ObjetoMapaVida parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */

    public void afectarObjetoMapaDestruible(ObjetoMapa chocada) {

    }

    /**
     * Afecta al objetoPreciosoVida parametrizado, de la forma que corresponda.
     *
     * @param chocada
     */
    public void afectarObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }
}
