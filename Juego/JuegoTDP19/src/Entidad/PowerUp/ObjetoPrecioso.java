package Entidad.PowerUp;

import Colisionadores.Colisionador;
import ColisionadoresCombate.ColisionadorCombate;
import ColisionadoresCombate.ColisionadorObjetoPrecioso;
import Entidad.*;
import Graficos.Grafico;
import Graficos.PoseeObjeto;

import java.awt.*;
import java.util.LinkedList;

public abstract class ObjetoPrecioso extends PowerUp {


    protected LinkedList<Personaje> alcanzados;
    protected HiloObjetoPrecioso hilo;
    protected String descripcion;

    public ObjetoPrecioso(int duracion , String descripcion){
        super(0,duracion);

        this.descripcion = descripcion;
        alcanzados = new LinkedList<Personaje>();

        colisionadorCombate = new ColisionadorObjetoPrecioso(this);
        hilo = new HiloObjetoPrecioso(this);
    }

    public LinkedList<Personaje> getAlcanzados(){
        return alcanzados;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void actualizarEntidad(){
        IA.actualizarEntidad();
        colisionadorCombate.verificarColisionando();

    }

    public abstract void afectar(Personaje personaje);

    public void afectarPortador(Personaje portador){
        Grafico graficoPoseeObjeto = new PoseeObjeto(portador,120,20);
        portador.getComponentesGraficas().agregarNuevoGrafico(graficoPoseeObjeto);
    }

    public void serDetectado(ColisionadorCombate colisionadorCombate) {

    }

    public void serChocado(Colisionador colisionador){

    }

}
