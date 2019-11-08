package Graficos.TiposGrafico;

import Entidad.Personaje;
import Graficos.Graficos;
import Graficos.TiposGrafico.Grafico;

import javax.swing.*;

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
