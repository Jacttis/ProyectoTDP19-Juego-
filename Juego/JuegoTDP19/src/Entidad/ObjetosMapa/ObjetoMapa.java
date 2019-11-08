package Entidad.ObjetosMapa;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorObjetoMapaDestruible;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Inteligencia.InteligenciaObjetoMapa;

import java.awt.*;

public abstract class ObjetoMapa extends Entidad {

    /**
     * Crea un ObjetoMapa
     *
     * Inicializa el atributo IA como un nuevo objeto InteligenciaObjetoMapa
     * con este mismo ObjetoMapa parametrizado.
     *
     * @param pos
     */

    public ObjetoMapa(Point pos) {
        super(pos, 0, 0);
        IA = new InteligenciaObjetoMapa(this);
    }

    /**
     * Implementa el metodo abstracto de Entidad
     *
     * Envia al colisionador parametrizado el mensaje afectarObjetoMapaDestruible
     * con este mismo ObjetoMapa parametrizado.
     *
     * @param colisionador
     */

    public void serChocado(Colisionador colisionador){
        colisionador.afectarObjetoMapaDestruible(this);
    }

    /**
     * Implementa el metodo abstracto de Entidad
     *
     * @param colisionadorCombate
     */

    public void serDetectado(ColisionadorCombate colisionadorCombate) {

    }

    /**
     * Metodos abstractos a ser implementados por ObjetosMapa mas especificos.
     * @param entidad
     */

    public abstract void afectarPersonaje(Personaje entidad);
    public abstract void desafectarPersonaje(Personaje entidad);
    public abstract void serAfectado(Entidad entidad);








}
