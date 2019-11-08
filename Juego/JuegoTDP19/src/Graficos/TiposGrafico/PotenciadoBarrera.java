package Graficos.TiposGrafico;

import Entidad.Personaje;
import Graficos.Graficos;
import Graficos.TiposGrafico.Grafico;

import javax.swing.*;

public class PotenciadoBarrera extends Grafico {



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
