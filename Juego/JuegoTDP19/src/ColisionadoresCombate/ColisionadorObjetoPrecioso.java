package ColisionadoresCombate;

import Colisionadores.Colisionador;
import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.Personaje;
import Entidad.PowerUp.ObjetoPrecioso;

import java.util.LinkedList;

public class ColisionadorObjetoPrecioso implements ColisionadorCombate {

    protected ObjetoPrecioso objetoPrecioso;

    public ColisionadorObjetoPrecioso(ObjetoPrecioso objetoPrecioso){
        this.objetoPrecioso=objetoPrecioso;
    }

    public void verificarColisionando(){

        LinkedList<Personaje> yaNoAfectados = new LinkedList<Personaje>();

        for(Personaje p : objetoPrecioso.getAlcanzados())
            if(!p.getHitBox().intersects(objetoPrecioso.getHitBox()))
                yaNoAfectados.add(p);

        for( Personaje p : yaNoAfectados)
            objetoPrecioso.getAlcanzados().remove(p);

    }



    @Override
    public void detectoAliado(Aliado chocada) {

    }

    @Override
    public void detectoEnemigo(Enemigo chocada) {

        boolean esta=false;

        for( Personaje p : objetoPrecioso.getAlcanzados() )
            if(p.equals(chocada)) {
                esta = true;
                break;
            }

        if(!esta)
            objetoPrecioso.getAlcanzados().add(chocada);

    }

    @Override
    public void detectoDisparo(Disparo chocada) {

    }

    @Override
    public void detectoGolpeEnemigo(GolpeEnemigo chocada) {

    }

    @Override
    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }

}
