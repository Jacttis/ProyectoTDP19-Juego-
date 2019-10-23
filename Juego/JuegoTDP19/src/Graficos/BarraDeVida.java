package Graficos;

import Entidad.*;

import javax.swing.*;
import java.awt.*;

public class BarraDeVida extends Grafico {

    protected Personaje portador;

    public BarraDeVida(Personaje portador,int modificadorX, int modificadorY){
        super();

        this.modificadorX=modificadorX;
        this.modificadorY=modificadorY;

        this.portador=portador;

        this.grafico=new JLabel();
        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+portador.getHeight()+modificadorY,80,5);
        this.grafico.setOpaque(true);
        this.grafico.setBackground(Color.GREEN);
    }

    public void actualizarGrafico() {

        this.grafico.setBounds(portador.getPos().x+modificadorX, portador.getPos().y+portador.getHeight()+modificadorY , portador.getVida()*80/portador.getVidaTotal(),5);

            if (portador.getVida() < 70) {
                if (portador.getVida() < 40)
                    grafico.setBackground(Color.RED);
                else grafico.setBackground(Color.YELLOW);
            }
    }



    public void cambiarGrafico(int dir) {

    }
}
