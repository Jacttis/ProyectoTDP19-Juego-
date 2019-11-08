package Graficos;

import Entidad.Personaje;

import javax.swing.*;
import java.awt.*;

public class Potenciado extends Grafico {



    public Potenciado (Personaje portador, int modificadorX, int modificadorY){
        this.portador=portador;
        this.grafico=new JLabel(new ImageIcon("Sprites/Fuego/fuegoTRUE.gif"));

        this.modificadorX=modificadorX;
        this.modificadorY=modificadorY;

        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y-portador.getHeight()+modificadorY,80,40);
    }

    public void actualizarGrafico() {
        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+modificadorY,80,40);
    }


    public void cambiarGrafico(int dir) {

    }
}
