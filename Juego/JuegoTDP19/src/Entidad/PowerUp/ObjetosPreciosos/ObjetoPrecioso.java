package Entidad.PowerUp.ObjetosPreciosos;

import Colisionadores.Colisionador;
import ColisionadoresCombate.ColisionadorCombate;
import ColisionadoresCombate.ColisionadorObjetoPreciosoTiempo;
import Entidad.*;
import Entidad.PowerUp.PowerUp;
import Graficos.Grafico;
import Graficos.PoseeObjeto;

import java.util.LinkedList;

public abstract class ObjetoPrecioso extends PowerUp {



    protected String descripcion;

    public ObjetoPrecioso(int duracion , String descripcion){
        super(0,duracion);
        this.descripcion = descripcion;
    }


    public String getDescripcion(){
        return descripcion;
    }

    public void actualizarEntidad(){
        colisionadorCombate.verificarColisionando();
    }


    public void afectarPortador(Personaje portador){
        Grafico graficoPoseeObjeto = new PoseeObjeto(portador,120,20);
        portador.getComponentesGraficas().agregarNuevoGrafico(graficoPoseeObjeto);
    }



}
