package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.PowerUp.PowerUp;

public class ColisionadorDisparo implements Colisionador {

    protected Disparo disparo;

    public ColisionadorDisparo(Disparo disparo){
        this.disparo=disparo;
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
     * Despues de afectarlo, disparo es eliminado.
     *
     *
     * @param chocada
     */
    public void afectarEnemigo(Enemigo chocada) {

        disparo.afectarPersonaje(chocada);
        if(chocada.estaMuerto()){
            disparo.getDisparador().getEstado().cambiarAQuieto();
        }
        disparo.eliminarse();
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
     *
     * @param chocada
     */
    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }

    public void afectarPowerUp(PowerUp chocada){

    }
}
