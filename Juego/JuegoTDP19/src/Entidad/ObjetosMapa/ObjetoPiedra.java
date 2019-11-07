package Entidad.ObjetosMapa;

import Entidad.*;
import Graficos.Grafico;
import Graficos.SpriteEntidad;

import javax.swing.*;
import java.awt.*;

public class ObjetoPiedra extends ObjetoMapaVida {


    public ObjetoPiedra(Point pos, int vida) {
        super(pos,vida);

        imagen = new ImageIcon [3];

        width=190;
        height=200;

        imagen[0] = new ImageIcon("Sprites/Objetos/piedraCompleta.png");
        imagen[1] = new ImageIcon("Sprites/Objetos/piedraMediana.png");
        imagen[2] = new ImageIcon("Sprites/Objetos/piedraCasiRota.png");

        Grafico sprite = new SpriteEntidad(this, imagen, 0, 0);
        componentesGraficas.agregarNuevoGrafico(sprite);

    }

    public void afectar(Personaje entidad) {

    }


    public void desafectar(Personaje entidad) {

    }

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y-20,width,height-40);
    }

    public Rectangle getRangoCombate(){
        return getHitBox();
    }



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


}
