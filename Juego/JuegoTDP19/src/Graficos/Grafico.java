package Graficos;

import Entidad.*;

import javax.swing.*;

public abstract class Grafico {

    protected JLabel grafico;
    protected int modificadorX=0,modificadorY=0;
    protected HiloDuracion duracionGrafico;
    protected Entidad portador;

    public Grafico(){
        grafico=new JLabel();
    }


    public abstract void actualizarGrafico();

    public abstract void cambiarGrafico(int dir);


    public JLabel getGrafico(){
        return grafico;
    }


}
