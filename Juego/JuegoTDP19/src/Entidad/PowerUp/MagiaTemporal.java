package Entidad.PowerUp;

import Colisionadores.Colisionador;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Entidad.Aliados.Aliado;
import Graficos.Grafico;
import Juego.Mapa;

import java.awt.*;

public abstract class MagiaTemporal extends PowerUp {

    protected HiloPowers tiempoAfecto;
    protected Grafico graficoRepresentativo;

    public MagiaTemporal(int duracion){
        super(0,duracion);
    }


    public void caerEnMapa(Point pos){
        this.posicionar(pos);
        Mapa.getMapa().agregarEntidad(this);
    }

    public abstract void afectarPersonaje(Aliado personaje);
    public abstract void desafectarPersonaje(Aliado personaje);

    public HiloPowers getTiempoAfecto(){
        return tiempoAfecto;
    }

}
