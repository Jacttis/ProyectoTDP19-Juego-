package Entidad.ObjetosMapa;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorObjetoMapa;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Inteligencia.InteligenciaObjetoMapa;

import java.awt.*;

public abstract class ObjetoMapa extends Entidad {


    public ObjetoMapa(Point pos) {
        super(pos, 0, 0);
        colisionador=new ColisionadorObjetoMapa(this);
        IA = new InteligenciaObjetoMapa(this);
    }

    public void serChocado(Colisionador colisionador){
        colisionador.afectarObjetoMapa(this);
    }

    public abstract void afectar(Personaje entidad);
    public abstract void desafectar(Personaje entidad);

    public abstract void serAfectado(Entidad entidad);

    public void serDetectado(ColisionadorCombate colisionadorCombate) {

    }




}
