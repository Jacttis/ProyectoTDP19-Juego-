package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.Personaje;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

import java.util.LinkedList;

public class ColCombateObjetoMapaDestruible implements ColisionadorCombate {

    protected ObjetoMapaVida objeto;
    protected LinkedList<Enemigo> detectados;

    public ColCombateObjetoMapaDestruible(ObjetoMapaVida objeto){
        this.objeto=objeto;

        //Tiene una lista de todos los enemigos detectados
        detectados = new LinkedList<Enemigo>();
    }

    /**
     * Metodo que se ejecutara constantemente (en actualizarEntidad()) que verificara
     * si el ObjetoMapaVida fue destruido, si este es el caso, para todos los enemigos que
     * estaban colisionando con el mismo, se les cambia el estado a Caminando.
     *
     */

    public void verificarColisionando() {
        if(objeto.fueDestruido()) {
            for (Personaje p : detectados)
                p.getEstado().cambiarACaminando();
        }
    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un Aliado
     *
     * @param chocada
     */

    public void detectoAliado(Aliado chocada) {

    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un Enemigo
     *
     * En este caso al objetoMapaVida que hay como atributo se le envia el mensaje afectarPersonaje con chocoada parametrizada
     * y se agrega Chocada a la lista de detectados.
     *
     * @param chocada
     */

    public void detectoEnemigo(Enemigo chocada) {
        objeto.afectarPersonaje(chocada);
        detectados.add(chocada);
    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un Disparo
     *
     * @param chocada
     */

    public void detectoDisparo(Disparo chocada) {

    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un ObjetoMapaVida
     *
     * @param chocada
     */

    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }


    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un ObjetoPreciosoVida
     *
     * @param chocada
     */

    public void detectoObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }

}
