package Entidad.PowerUp;

import Entidad.*;
import FabricaBotones.BotonesObjetos.BotonAgujeroNegro;
import Graficos.Grafico;
import Graficos.SpriteEntidad;

import javax.swing.*;
import java.awt.*;

public class AgujeroNegro extends ObjetoPrecioso {


    public AgujeroNegro() {
        super(1750);

        this.width=120;
        this.height=103;

        imagen[0] = new ImageIcon("Sprites/Objetos/Aguajero/augNegro.gif");

        Grafico sprite = new SpriteEntidad(this,imagen,0,0);
        componentesGraficas.agregarGrafico(sprite);

    }

    public void posicionar(Point pos){

        this.pos.setLocation(pos.x-(width/2),pos.y-(height/2)-20);
        hilo.start();
    }

    public void caerEnMapa(Point pos){
        BotonAgujeroNegro.getBotonAgujeroNegro().setEnabled(true);
    }

    public void afectar(Personaje personaje) {
        personaje.getPos().setLocation(personaje.getPos().x+500,personaje.getPos().y);
    }


    public Entidad clone() {
        return null;
    }
}
