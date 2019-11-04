package Entidad.ObjetosMapa;

import Entidad.*;
import Entidad.PowerUp.ObjetoPrecioso;
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
        entidad.getEstado().cambiarAAtacando();
    }


    public void serAfectado(Entidad entidad) {
        this.vida-=entidad.getDamage();

        if((vida<100)&&(vida>50))
            componentesGraficas.cambiarGrafico(1);
        else
            if(vida<50)
                componentesGraficas.cambiarGrafico(2);

        if(fueDestruido())
            this.eliminarse();

    }



    public Entidad clone() {
        return new ObjetoPiedra(pos,vida);
    }


}
