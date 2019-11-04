package Entidad.ObjetosMapa;

import ColisionadoresCombate.ColCombateObjetoMapaDestruible;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.Entidad;

import java.awt.*;

public abstract class ObjetoMapaVida extends ObjetoMapa {

    protected int vida,vidaInicial;

    public ObjetoMapaVida(Point pos, int vida) {
        super(pos);
        this.vida=vida;
        this.vidaInicial=vida;
        colisionadorCombate = new ColCombateObjetoMapaDestruible(this);
    }

    public void actualizarEntidad() {
        colisionadorCombate.verificarColisionando();
    }

    public boolean fueDestruido(){
        return vida<=0;
    }

    public void serAfectado(Entidad entidad) {
        this.vida-=entidad.getDamage();

        if(fueDestruido())
            this.eliminarse();

    }

    public void serDetectado(ColisionadorCombate colisionadorCombate){
        colisionadorCombate.detectoObjetoMapaDestruible(this);
    }

}
