package Graficos.TiposGrafico;

import Entidad.*;
import Graficos.HiloDuracion;

import javax.swing.*;

public abstract class Grafico {

    protected JLabel grafico;
    protected int modificadorX=0,modificadorY=0;
    protected HiloDuracion duracionGrafico;
    protected Entidad portador;

    public Grafico(){
        grafico=new JLabel();
    }

    /**
     * Actualiza el JLabel grafico que tiene como atributo
     *
     */

    public abstract void actualizarGrafico();

    /**
     * Cambia el tipo de grafico dependiendo de que tipo de Grafico se trate
     * a partir de dir
     *
     * @param dir
     */

    public abstract void cambiarGrafico(int dir);


    /**
     * Retorna el JLabel grafico que es atributo de Grafico
     *
     * @return
     */

    public JLabel getGrafico(){
        return grafico;
    }


}
