package Entidad.Disparos;

import Entidad.*;
import Inteligencia.InteligenciaDisparoAliado;

import java.awt.*;

public class GolpeCaballeroEscudo extends Disparo {

    public GolpeCaballeroEscudo(Point pos, double velocidad, int damage, Personaje disparador){
        super(pos, velocidad, damage, disparador);

        IA=new InteligenciaDisparoAliado(this);
        this.width=disparador.getWidth();
        this.height=disparador.getHeight();


    }

    public Entidad clone(){return new GolpeCaballeroEscudo(pos,velocidad,damage,disparador);}

}
