package Graficos;

import Entidad.Personaje;

import javax.swing.*;

public class PotenciadoBarrera extends Grafico {

    private Personaje portador;

    public PotenciadoBarrera(Personaje portador,int modificadorX, int modificadorY, boolean lado){
        this.portador=portador;
        if(lado)
            this.grafico=new JLabel(new ImageIcon("Sprites/CampoProteccion/campoProteccionEnemigo.png"));
        else
            this.grafico=new JLabel(new ImageIcon("Sprites/CampoProteccion/campoProteccionAliado.png"));

        this.modificadorX=modificadorX;
        this.modificadorY=modificadorY;

        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+modificadorY,100,portador.getHeight());
    }

    public void actualizarGrafico() {
        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+modificadorY,100,portador.getHeight());
    }


    public void cambiarGrafico(int dir) {

    }
}
