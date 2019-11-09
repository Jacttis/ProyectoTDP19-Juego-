package Entidad.ObjetosMapa;

import Entidad.*;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;

import javax.swing.*;
import java.awt.*;

public class ObjetoPiedra extends ObjetoMapaVida {


    /**
     *  Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad para
     *  luego agregarlos a la lista de graficos componentesGraficas.
     *
     * @param pos
     * @param vida
     */

    public ObjetoPiedra(Point pos, int vida) {
        super(pos,vida);

        imagen = new ImageIcon [3];

        width=190;
        height=200;

        imagen[0] = new ImageIcon("src/Sprites/Objetos/piedraCompleta.png");
        imagen[1] = new ImageIcon("src/Sprites/Objetos/piedraMediana.png");
        imagen[2] = new ImageIcon("src/Sprites/Objetos/piedraCasiRota.png");

        Grafico sprite = new SpriteEntidad(this, imagen, 0, 0);
        componentesGraficas.agregarNuevoGrafico(sprite);

    }

    /**
     * Implementa el metodo afectarPersonaje de ObjetoMapa
     *
     * @param entidad
     */

    public void afectarPersonaje(Personaje entidad) {

    }


    /**
     * Implementa el metodo afectarPersonaje de ObjetoMapa
     * @param entidad
     */

    public void desafectarPersonaje(Personaje entidad) {

    }

    /**
     * Implementa el metodo serAfectado de ObjetoMapa
     *
     *
     * @param entidad
     */

    public void serAfectado(Entidad entidad) {
        this.vidaActual-=entidad.getDamage();

        int porcentaje = (vidaActual * 100) / vidaTotal;

        if((porcentaje<70)&&(porcentaje>40))
            componentesGraficas.cambiarGrafico(1);
        else
        if(porcentaje<40)
            componentesGraficas.cambiarGrafico(2);

        if(fueDestruido())
            this.eliminarse();

    }


    /**
     * Redefinicion del getHitbox mas general
     *
     * Devuelve un rectangulo que reprensenta el hitbox del ObjetoPiedra.
     *
     * @return Rectangle
     */

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y-20,width,height-40);
    }

    /**
     * Redefinicion del getRangoCombate mas general
     *
     * Devuelve un rectangulo que reprensenta el RangoCombate del ObjetoPiedra.
     *
     * @return Rectangle
     */

    public Rectangle getRangoCombate(){
        return getHitBox();
    }








}
