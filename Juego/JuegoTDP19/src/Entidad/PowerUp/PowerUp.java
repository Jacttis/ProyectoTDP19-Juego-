package Entidad.PowerUp;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorNulo;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Inteligencia.InteligenciaPowerUp;

import javax.swing.*;
import java.awt.*;

public abstract class PowerUp extends Entidad {


    public PowerUp(Point pos, double velocidad) {
        super(pos, velocidad, 0);
        IA=new InteligenciaPowerUp(this);

        colisionador= new ColisionadorNulo();

        imagen= new ImageIcon[1];



    }

    public void serChocado(Colisionador colisionador){

    }

    public void afectarPortador(Enemigo portador){

    }

    public void afectarPersonaje(Aliado personaje){

    }


    public void serDetectado(ColisionadorCombate colisionadorCombate){

    }

    public abstract Entidad clone();
}
