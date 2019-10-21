package Entidad.PowerUp;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorPowerUp;
import Entidad.*;
import Inteligencia.InteligenciaPowerUp;

import java.awt.*;

public abstract class PowerUp extends Entidad {

    public PowerUp(Point pos, double velocidad) {
        super(pos, velocidad, 0);
        IA=new InteligenciaPowerUp(this);
        colisionador=new ColisionadorPowerUp(this);

    }


    public void serChocado(Colisionador colisionador) {
        colisionador.afectarPowerUp(this);
    }
}
