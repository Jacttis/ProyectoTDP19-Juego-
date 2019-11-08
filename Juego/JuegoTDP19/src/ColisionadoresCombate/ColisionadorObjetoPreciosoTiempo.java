package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.Personaje;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPrecioso;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoTiempo;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

import java.util.LinkedList;

public class ColisionadorObjetoPreciosoTiempo implements ColisionadorCombate {

    protected ObjetoPreciosoTiempo objetoPreciosoTiempo;

    public ColisionadorObjetoPreciosoTiempo(ObjetoPreciosoTiempo objetoPrecioso){
        this.objetoPreciosoTiempo=objetoPrecioso;
    }

    /**
     * Metodo que se ejecutara constantemente (en actualizarEntidad()) que verificara
     * si los Personajes que haya detectado el ObjetoMapaTiempo siguen colisionando con el mismo (los Personajes
     * detectados pertenecen a una lista que es atributo de ObjetoPreciosoTiempo).
     * Si no es el caso, realiza determinada accion, en este caso, remueve el Personaje de la lista de afectados.
     *
     */

    public void verificarColisionando(){

        LinkedList<Personaje> yaNoAfectados = new LinkedList<Personaje>();

        for(Personaje p : objetoPreciosoTiempo.getAlcanzados())
            if(!p.getHitBox().intersects(objetoPreciosoTiempo.getHitBox()))
                yaNoAfectados.add(p);

        for( Personaje p : yaNoAfectados)
            objetoPreciosoTiempo.getAlcanzados().remove(p);

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
     * En este caso si chocada no se encuentra en la lista de los Personajes afectados del objetoPreciosoTiempo,
     * agrega a chocada a la lista.
     *
     * @param chocada
     */

    public void detectoEnemigo(Enemigo chocada) {

        boolean esta=false;

        for( Personaje p : objetoPreciosoTiempo.getAlcanzados() )
            if(p.equals(chocada)) {
                esta = true;
                break;
            }

        if(!esta)
            objetoPreciosoTiempo.getAlcanzados().add(chocada);

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
