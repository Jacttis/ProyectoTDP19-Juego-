package Graficos.TiposGrafico;

import Entidad.Personaje;
import Graficos.Graficos;
import Graficos.TiposGrafico.Grafico;

import javax.swing.*;

public class PoseeObjeto extends Grafico {


    public PoseeObjeto(Personaje portador, int modificadorX, int modificadorY){
        this.portador=portador;
        this.grafico=new JLabel(new ImageIcon("Sprites/Objetos/PotenciadoObjeto1.png"));

        this.modificadorX=modificadorX;
        this.modificadorY=modificadorY;

        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+modificadorY,30,32);
    }

    public void actualizarGrafico() {
        this.grafico.setBounds(portador.getPos().x+modificadorX,portador.getPos().y+modificadorY,30,32);
    }


    public void cambiarGrafico(int dir) {

    }
}
