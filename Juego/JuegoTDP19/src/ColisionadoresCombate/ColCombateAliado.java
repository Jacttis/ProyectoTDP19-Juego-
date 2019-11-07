package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

public class ColCombateAliado implements ColisionadorCombate {

    protected Aliado aliado;
    protected Enemigo enemigoDetectado;

    public ColCombateAliado(Aliado aliado){
        this.aliado=aliado;
    }

    public void verificarColisionando(){

        if(enemigoDetectado!=null){
            if((!enemigoDetectado.getHitBox().intersects(aliado.getRangoCombate()))) {
                aliado.getEstado().cambiarAQuieto();
                enemigoDetectado = null;
            }

        }
    }

    public void detectoAliado(Aliado chocada) {

    }


    public void detectoEnemigo(Enemigo chocada) {
        aliado.getEstado().cambiarAAtacando();

        if(enemigoDetectado!=null) {
            if (!enemigoDetectado.equals(chocada))
                enemigoDetectado = chocada;
        }
        else enemigoDetectado=chocada;

    }


    public void detectoDisparo(Disparo chocada) {

    }



    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }

    @Override
    public void detectoObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }

}
