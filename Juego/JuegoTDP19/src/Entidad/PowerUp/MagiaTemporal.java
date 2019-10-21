package Entidad.PowerUp;

import Colisionadores.Colisionador;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;

import java.awt.*;

public abstract class MagiaTemporal extends PowerUp {

    protected HiloPowers tiempoAfecto;
    protected int duracion;

    public MagiaTemporal(Point pos, double velocidad,int duracion){
        super(pos,velocidad);
        this.duracion=duracion;
    }

    public abstract void afectarPersonaje(Personaje personaje);
    public abstract void desafectarPersonaje(Personaje personaje);

    public int getDuracion(){
        return duracion;
    }

}
