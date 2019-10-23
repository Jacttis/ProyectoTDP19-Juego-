package Graficos;

import Entidad.Entidad;

import javax.swing.*;

public abstract class Grafico {

    protected JLabel grafico;
    protected int modificadorX,modificadorY;

    public Grafico(){
        grafico=new JLabel();
        modificadorX=0;
        modificadorY=0;
    }


    public abstract void actualizarGrafico();

    public abstract void cambiarGrafico(int dir);


    public JLabel getGrafico(){
        return grafico;
    }


}
