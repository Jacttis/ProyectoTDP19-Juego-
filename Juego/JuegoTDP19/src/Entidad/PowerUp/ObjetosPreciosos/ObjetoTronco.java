package Entidad.PowerUp.ObjetosPreciosos;

import Entidad.Entidad;
import FabricaBotones.BotonesObjetos.BotonTronco;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;

import javax.swing.*;
import java.awt.*;

public class ObjetoTronco extends ObjetoPreciosoVida {

    public ObjetoTronco(int vida){
        super(vida,"Un tronco que retiene enemigos");

        this.width=130;
        this.height=250;

        imagen = new ImageIcon [3];

        imagen[0] = new ImageIcon("src/Sprites/Objetos/ObjetoTronco/troncovich.png");
        imagen[1] = new ImageIcon("src/Sprites/Objetos/ObjetoTronco/troncovich.png");
        imagen[2] = new ImageIcon("src/Sprites/Objetos/ObjetoTronco/troncovich.png");

        Grafico sprite = new SpriteEntidad(this, imagen, 0, 0);
        componentesGraficas.agregarGrafico(sprite);

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

    public void caerEnMapa(Point pos) {
        BotonTronco.getBotonTronco().setEnabled(true);
    }

    public void posicionar(Point pos){
        this.pos.setLocation(pos.x-50,pos.y-140);
    }

    public Rectangle getHitbox(){
        return new Rectangle(pos.x,pos.y,width-50,height);
    }


    public Entidad clone() {
        return new ObjetoTronco(vidaTotal);
    }
}
