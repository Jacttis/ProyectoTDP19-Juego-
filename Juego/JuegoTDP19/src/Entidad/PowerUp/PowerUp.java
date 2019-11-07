package Entidad.PowerUp;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorNulo;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Inteligencia.InteligenciaPowerUp;
import Juego.Mapa;

import javax.swing.*;
import java.awt.*;

public abstract class PowerUp extends Entidad {

    protected int duracion;

    public PowerUp(double velocidad, int duracion) {
        super(new Point(-300,-300) ,velocidad, 0);
        IA=new InteligenciaPowerUp(this);

        this.duracion=duracion;

        colisionador= new ColisionadorNulo();

        imagen= new ImageIcon[1];



    }

    public int getDuracion(){
        return duracion;
    }

    public void serChocado(Colisionador colisionador){

    }

    public abstract void afectarPortador(Personaje portador);

    public abstract void caerEnMapa(Point pos);



    public void serDetectado(ColisionadorCombate colisionadorCombate){

    }

    public abstract Entidad clone();
}
