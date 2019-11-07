package Graficos;

import Entidad.Enemigos.Enemigo;
import Entidad.Personaje;

import javax.swing.*;

public class PoseeObjeto extends Grafico {

    private Personaje portador;

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
