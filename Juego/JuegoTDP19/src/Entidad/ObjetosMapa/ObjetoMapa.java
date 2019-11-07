package Entidad.ObjetosMapa;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorObjetoMapaDestruible;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Inteligencia.InteligenciaObjetoMapa;

import java.awt.*;

public abstract class ObjetoMapa extends Entidad {


    public ObjetoMapa(Point pos) {
        super(pos, 0, 0);
        colisionador=new ColisionadorObjetoMapaDestruible(this);
        IA = new InteligenciaObjetoMapa(this);
    }

    public void serChocado(Colisionador colisionador){
        colisionador.afectarObjetoMapaDestruible(this);
    }

    public abstract void afectar(Personaje entidad);
    public abstract void desafectar(Personaje entidad);

    public abstract void serAfectado(Entidad entidad);

    public void serDetectado(ColisionadorCombate colisionadorCombate) {

    }




}
