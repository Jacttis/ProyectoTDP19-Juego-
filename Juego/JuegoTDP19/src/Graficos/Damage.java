package Graficos;

import Entidad.Disparos.Disparo;
import Entidad.Personaje;

import javax.swing.*;
import java.awt.*;

public class Damage extends Grafico {

    protected Disparo disparador;

    public Damage (Disparo disparador, int modificadorX, int modificadorY){

        this.modificadorX=modificadorX;
        this.modificadorY=modificadorY;

        this.grafico.setBounds(modificadorX,modificadorY,80,80);
        this.grafico.setText(disparador.getDamage()+"");
        this.grafico.setForeground(Color.RED);

    }

    public void actualizarGrafico() {
        this.grafico.setBounds(modificadorX,modificadorY+1,40,40);
    }


    public void cambiarGrafico(int dir) {

    }
}
