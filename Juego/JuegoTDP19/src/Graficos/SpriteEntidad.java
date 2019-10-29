package Graficos;

import Entidad.Entidad;

import javax.swing.*;

public class SpriteEntidad extends Grafico {

    private Icon[] imagenes;
    private Entidad portador;

    public SpriteEntidad(Entidad portador, Icon[] imagenes, int modificadorX, int modificadorY){
        super();

        this.modificadorX=modificadorX;
        this.modificadorY=modificadorY;

        this.portador=portador;
        this.imagenes=imagenes;
        this.grafico=new JLabel(imagenes[0]);



        this.grafico.setBounds(portador.getPos().x + modificadorX, portador.getPos().y + modificadorY , portador.getWidth(), portador.getHeight() );

        //this.grafico.setHorizontalAlignment(JLabel.CENTER);

    }




    public void actualizarGrafico() {
        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+modificadorY,portador.getWidth(),portador.getHeight());
    }


    public void cambiarGrafico(int dir) {
        this.grafico.setIcon(imagenes[dir]);
    }


}
