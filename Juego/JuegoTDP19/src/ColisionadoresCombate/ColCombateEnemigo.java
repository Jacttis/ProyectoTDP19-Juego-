package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Entidad;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColCombateEnemigo implements ColisionadorCombate {

    protected Enemigo enemigo;
    protected Entidad entidadDetectada;

    public ColCombateEnemigo(Enemigo enemigo){
        this.enemigo=enemigo;
    }

    /**
     * Metodo que se ejecutara constantemente (en actualizarEntidad()) que verificara
     * si la entidad que haya detectado el Enemigo sigue colisionando con el mismo.
     * Si no es el caso, realiza determinada accion, en este caso, cambiar el estado
     * del Enemigo a Caminando.
     *
     */

    public void verificarColisionando(){

         if(entidadDetectada!=null){
            if((!entidadDetectada.getHitBox().intersects(enemigo.getRangoCombate()))) {
                enemigo.getEstado().cambiarACaminando();
                entidadDetectada = null;
            }
         }
    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un Aliado
     *
     * En este caso cambia el estado del Enemigo que tiene como atributo a Atacando
     * y luego asigna a Chocada a entidadDetectada (Si entidadDetectada ya es chocada no realiza la asignacion).
     *
     * @param chocada
     */


    public void detectoAliado(Aliado chocada) {
        enemigo.getEstado().cambiarAAtacando();

        if(entidadDetectada!=null) {
            if (!entidadDetectada.equals(chocada))
                entidadDetectada = chocada;
        }
        else entidadDetectada=chocada;
    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un Enemigo
     *
     * @param chocada
     */

    public void detectoEnemigo(Enemigo chocada) {

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
        enemigo.getEstado().cambiarAAtacando();

        if (entidadDetectada != null){
            if (!entidadDetectada.equals(chocada))
                entidadDetectada = chocada;
        }
        else
            entidadDetectada=chocada;
    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un ObjetoPreciosoVida
     *
     * En este caso cambia el estado del Enemigo que tiene como atributo a Atacando
     * y luego asigna a Chocada a entidadDetectada (Si entidadDetectada ya es chocada no realiza la asignacion).
     *
     * @param chocada
     */

    public void detectoObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {
        enemigo.getEstado().cambiarAAtacando();

        if(entidadDetectada!=null) {
            if (!entidadDetectada.equals(chocada))
                entidadDetectada = chocada;
        }
        else
            entidadDetectada = chocada;

    }
}
