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

    /**
     *  Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad para
     *  luego agregarlos a la lista de graficos componentesGraficas.
     *
     *  Inicia el hiloDuracionObjetoMapa
     *
     * @param pos
     * @param duracion
     * @param relantizacion
     */

    public ObjetoLago(Point pos , int duracion , int relantizacion) {
        super(pos,duracion);
        this.relantizacion=relantizacion;

        imagen[0] = new ImageIcon("Sprites/Objetos/Rio/lago.gif");

        Grafico sprite = new SpriteEntidad(this,imagen,0,0);
        componentesGraficas.agregarGrafico(sprite);

        hilo.start();
    }

    /**
     * Implementa el metodo afectarPersonaje de ObjetoMapa
     *
     * Le envia el mensaje setVelocidad al PErsonaje parametrizado
     * (Le disminuye la velocidad por el valor de relantizacion)
     *
     * @param entidad
     */

    public void afectarPersonaje(Personaje entidad) {
        entidad.setVelocidad(entidad.getVelocidad()-relantizacion);

    }

    /**
     * Implementa el metodo afectarPersonaje de ObjetoMapa
     *
     * Le vuelve a establecer la velocidad anterior enviandole el mensaje
     * setVelocidad al Personaje parametrizado con su velocidad sumandole el valor de relantizacion
     *
     * @param entidad
     */

    public void desafectarPersonaje(Personaje entidad){
        entidad.setVelocidad(entidad.getVelocidad()+relantizacion);
    }

    /**
     * Implementa serAfectado de ObjetoMapa
     *
     * @param entidad
     */

    public void serAfectado(Entidad entidad) {

    }
}
