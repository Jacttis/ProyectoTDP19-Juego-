package Entidad.PowerUp;

import ColisionadoresCombate.ColisionadorCombate;
import Entidad.Entidad;

import java.awt.*;

public class ObjetoPrecioso extends PowerUp {

    public ObjetoPrecioso(Point pos, double velocidad){
        super(pos,velocidad);
    }

    public void serDetectado(ColisionadorCombate colisionadorCombate) {

    }

    public Entidad clone() {
        return null;
    }
}
