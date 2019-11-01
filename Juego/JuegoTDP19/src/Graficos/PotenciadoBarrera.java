package Graficos;

import Entidad.Personaje;

import javax.swing.*;

public class PotenciadoBarrera extends Grafico {

    private Personaje portador;

    public PotenciadoBarrera(Personaje portador,int modificadorX, int modificadorY){
        this.portador=portador;
        this.grafico=new JLabel(new ImageIcon("Sprites/Magia/BarreraPotenciado/Escudo2.png"));

        this.modificadorX=modificadorX;
        this.modificadorY=modificadorY;

        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+modificadorY,120,140);
    }

    public void actualizarGrafico() {
        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+modificadorY,120,140);
    }


    public void cambiarGrafico(int dir) {

    }
}
