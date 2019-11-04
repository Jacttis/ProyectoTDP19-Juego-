package Entidad.PowerUp;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorObjetoMapa;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.Entidad;

import java.awt.*;

public abstract class ObjetoPrecioso extends PowerUp {

    public ObjetoPrecioso(Point pos, double velocidad){
        super(pos,velocidad);
    }

    public void serDetectado(ColisionadorCombate colisionadorCombate) {

    }

    public void serChocado(Colisionador colisionador){

    }

}
