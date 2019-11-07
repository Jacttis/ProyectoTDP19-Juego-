package Entidad.PowerUp.ObjetosPreciosos;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorObjetoPreciosoVida;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.Entidad;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPrecioso;

public abstract class ObjetoPreciosoVida extends ObjetoPrecioso {

    protected int vidaActual,vidaTotal;

    public ObjetoPreciosoVida(int vida, String descripcion) {
        super(0, descripcion);
        this.vidaActual=vida;
        this.vidaTotal=vida;
        colisionador = new ColisionadorObjetoPreciosoVida(this);
    }

    public boolean fueDestruido(){
        return vidaActual<=0;
    }

    public void serAfectado(Entidad entidad) {
        this.vidaActual-=entidad.getDamage();

        if(fueDestruido())
            this.eliminarse();

    }

    public void serChocado(Colisionador colisionador){
        colisionador.afectarObjetoPreciosoDestruible(this);
    }

    public void serDetectado(ColisionadorCombate colisionadorCombate){
        colisionadorCombate.detectoObjetoPreciosoDestruible(this);
    }
}
