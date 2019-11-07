package Entidad.ObjetosMapa;

import Entidad.Entidad;
import Entidad.Personaje;
import Graficos.Grafico;
import Graficos.Relantizado;
import Graficos.SpriteEntidad;

import javax.swing.*;
import java.awt.*;

public class ObjetoLago extends ObjetoMapaTiempo {

    protected int relantizacion;

    public ObjetoLago(Point pos , int duracion , int relantizacion) {
        super(pos,duracion);
        this.relantizacion=relantizacion;

        imagen[0] = new ImageIcon("Sprites/Objetos/Rio/lago.gif");

        Grafico sprite = new SpriteEntidad(this,imagen,0,0);
        componentesGraficas.agregarGrafico(sprite);

        hilo.start();
    }

    public void afectar(Personaje entidad) {
        entidad.setVelocidad(entidad.getVelocidad()-relantizacion);

    }

    public void desafectar(Personaje entidad){
        entidad.setVelocidad(entidad.getVelocidad()+relantizacion);
    }

    public void serAfectado(Entidad entidad) {

    }
}
