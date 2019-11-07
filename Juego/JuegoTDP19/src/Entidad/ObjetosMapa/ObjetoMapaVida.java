package Entidad.ObjetosMapa;

import ColisionadoresCombate.ColCombateObjetoMapaDestruible;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.Entidad;

import java.awt.*;

public abstract class ObjetoMapaVida extends ObjetoMapa {

    protected int vidaActual,vidaInicial;

    public ObjetoMapaVida(Point pos, int vida) {
        super(pos);
        this.vidaActual=vida;
        this.vidaInicial=vida;
        colisionadorCombate = new ColCombateObjetoMapaDestruible(this);
    }

    public void actualizarEntidad() {
        colisionadorCombate.verificarColisionando();
    }

    public boolean fueDestruido(){
        return vidaActual<=0;
    }

    public void serAfectado(Entidad entidad) {
        this.vidaActual-=entidad.getDamage();

        if(fueDestruido())
            this.eliminarse();

    }

    public void serDetectado(ColisionadorCombate colisionadorCombate){
        colisionadorCombate.detectoObjetoMapaDestruible(this);
    }

}
