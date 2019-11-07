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

    public void verificarColisionando(){

        LinkedList<Personaje> yaNoAfectados = new LinkedList<Personaje>();

        for(Personaje p : objetoPreciosoTiempo.getAlcanzados())
            if(!p.getHitBox().intersects(objetoPreciosoTiempo.getHitBox()))
                yaNoAfectados.add(p);

        for( Personaje p : yaNoAfectados)
            objetoPreciosoTiempo.getAlcanzados().remove(p);

    }




    public void detectoAliado(Aliado chocada) {

    }


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


    public void detectoDisparo(Disparo chocada) {

    }



    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }


    public void detectoObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }

}
