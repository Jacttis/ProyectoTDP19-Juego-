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

    public void verificarColisionando(){

         if(entidadDetectada!=null){
            if((!entidadDetectada.getHitBox().intersects(enemigo.getRangoCombate()))) {
                enemigo.getEstado().cambiarACaminando();
                entidadDetectada = null;
            }
         }
    }

    public void detectoAliado(Aliado chocada) {
        enemigo.getEstado().cambiarAAtacando();

        if(entidadDetectada!=null) {
            if (!entidadDetectada.equals(chocada))
                entidadDetectada = chocada;
        }
        else entidadDetectada=chocada;
    }


    public void detectoEnemigo(Enemigo chocada) {

    }

    public void detectoDisparo(Disparo chocada) {

    }



    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {
        enemigo.getEstado().cambiarAAtacando();

        if (entidadDetectada != null){
            if (!entidadDetectada.equals(chocada))
                entidadDetectada = chocada;
        }
        else
            entidadDetectada=chocada;
    }


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
