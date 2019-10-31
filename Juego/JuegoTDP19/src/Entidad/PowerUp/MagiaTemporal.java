package Entidad.PowerUp;

import Colisionadores.Colisionador;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Entidad.Aliados.Aliado;
import Graficos.Grafico;

import java.awt.*;

public abstract class MagiaTemporal extends PowerUp {

    protected HiloPowers tiempoAfecto;
    protected int duracion;
    protected Grafico graficoRepresentativo;

    public MagiaTemporal(Point pos,int duracion){
        super(pos,0);
        this.duracion=duracion;
    }


    public abstract void afectarPersonaje(Aliado personaje);
    public abstract void desafectarPersonaje(Aliado personaje);

    public int getDuracion(){
        return duracion;
    }

    public HiloPowers getTiempoAfecto(){
        return tiempoAfecto;
    }

}
