package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaTiempo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

import java.util.LinkedList;

public class ColCombateObjetoMapaNoDestruible implements ColisionadorCombate {

    protected ObjetoMapaTiempo objetoMapaTiempo;

    public ColCombateObjetoMapaNoDestruible(ObjetoMapaTiempo objetoMapaTiempo){
        this.objetoMapaTiempo=objetoMapaTiempo;
    }

    /**
     * Metodo que se ejecutara constantemente (en actualizarEntidad()) que verificara
     * si los enemigos que haya detectado el ObjetoMapaTiempo siguen colisionando con el mismo (los enemigos detectados
     * pertenecen a una lista que es atributo de ObjetoMapaTiempo).
     * Si no es el caso, realiza determinada accion, en este caso, remueve el enemigo de la lista
     * y le envia el mensaje YaNoAfecta al atributo objetoMapaTiempo con el enemigo parametrizado.
     *
     */

    public void verificarColisionando() {

        LinkedList<Enemigo> enemigosARemover = new LinkedList<Enemigo>();

        for( Enemigo e : objetoMapaTiempo.getEnemigosAfectados() ){
            if(!e.getHitBox().intersects(objetoMapaTiempo.getHitBox())) {
                enemigosARemover.add(e);
                objetoMapaTiempo.yaNoAfecta(e);
            }
        }

        for( Enemigo e : enemigosARemover )
            objetoMapaTiempo.getEnemigosAfectados().remove(e);



    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un Aliado
     *
     * @param chocada
     */


    public void detectoAliado(Aliado chocada) {

    }

    /**
     * Realiza la accion correspondiente frente al hecho de haber detectado un Aliado
     *
     * En este caso si chocada no se encuentra en la lista de los enemigos afectados del objetoMapaTiempo,
     * agrega a chocada a la lista y envia el mensaje afectarPersonaje a objetoMapaTiempo con chocada parametrizado.
     *
     * @param chocada
     */

    public void detectoEnemigo(Enemigo chocada) {
        boolean esta=false;

        for(Enemigo e : objetoMapaTiempo.getEnemigosAfectados())
            if(e.equals(chocada)){
                esta=true;
                break;
            }
         if(!esta) {
             objetoMapaTiempo.getEnemigosAfectados().add(chocada);
             objetoMapaTiempo.afectarPersonaje(chocada);
         }
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
