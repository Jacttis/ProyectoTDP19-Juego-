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



    public void detectoAliado(Aliado chocada) {

    }


    public void detectoEnemigo(Enemigo chocada) {
        boolean esta=false;

        for(Enemigo e : objetoMapaTiempo.getEnemigosAfectados())
            if(e.equals(chocada)){
                esta=true;
                break;
            }
         if(!esta) {
             objetoMapaTiempo.getEnemigosAfectados().add(chocada);
             objetoMapaTiempo.afectar(chocada);
         }
    }


    public void detectoDisparo(Disparo chocada) {

    }




    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }


    public void detectoObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }

}
