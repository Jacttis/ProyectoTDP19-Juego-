package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColCombateAliado implements ColisionadorCombate {

    protected Aliado aliado;
    protected Enemigo entidadDetectada;

    public ColCombateAliado(Aliado aliado){
        this.aliado=aliado;
    }

    /**
     * Metodo que se ejecutara constantemente (en actualizarEntidad()) que verificara
     * si la entidad que haya detectado el Aliado sigue colisionando con el mismo.
     * Si no es el caso, realiza determinada accion, en este caso, cambiar el estado
     * del Aliado a Quieto.
     *
     */

    public void verificarColisionando(){

        if(entidadDetectada!=null){
            if((!entidadDetectada.getHitBox().intersects(aliado.getRangoCombate()))) {
                aliado.getEstado().cambiarAQuieto();
                entidadDetectada = null;
            }

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
     * En este caso cambia el estado del Aliado que tiene como atributo a Atacando
     * y luego asigna a Chocada a entidadDetectada (Si entidadDetectada ya es chocada no realiza la asignacion).
     *
     * @param chocada
     */


    public void detectoEnemigo(Enemigo chocada) {
        aliado.getEstado().cambiarAAtacando();

        if(entidadDetectada!=null) {
            if (!entidadDetectada.equals(chocada))
                entidadDetectada = chocada;
        }
        else entidadDetectada=chocada;

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
