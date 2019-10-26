package Graficos;

import Entidad.Entidad;

import javax.swing.*;
import java.util.LinkedList;

public class Graficos {

    private LinkedList<Grafico> listaGraficos;

    public Graficos(){
        listaGraficos=new LinkedList<Grafico>();
    }

    public void actualizarGraficos(){
        for(Grafico g : listaGraficos)
            g.actualizarGrafico();
    }

    public void cambiarGrafico(int dir){
        for(Grafico g : listaGraficos)
            g.cambiarGrafico(dir);
    }

    public void agregarNuevoGrafico(Grafico nuevoGrafico){
        listaGraficos.add(nuevoGrafico);
    }

    public LinkedList<Grafico> getListaGraficos(){
        return listaGraficos;
    }
}
