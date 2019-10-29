package Entidad.PowerUp;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorPowerUp;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Entidad.Enemigos.Enemigo;
import Inteligencia.InteligenciaPowerUp;

import javax.swing.*;
import java.awt.*;

public abstract class PowerUp extends Entidad {


    public PowerUp(Point pos, double velocidad) {
        super(pos, velocidad, 0);
        IA=new InteligenciaPowerUp(this);
        colisionador=new ColisionadorPowerUp(this);

        imagen= new ImageIcon[1];



    }

    public void afectarPortador(Enemigo portador){

    }

    public void serChocado(Colisionador colisionador) {
        colisionador.afectarPowerUp(this);
    }

    public void serDetectado(ColisionadorCombate colisionadorCombate){

    }
}
