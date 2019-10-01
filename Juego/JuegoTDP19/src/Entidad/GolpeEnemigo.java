package Entidad;


import Inteligencia.InteligenciaDisparoAliado;
import Inteligencia.InteligenciaGolpeEnemigo;

import javax.swing.*;
import java.awt.*;

public class GolpeEnemigo extends Disparo {

    public GolpeEnemigo(Point pos, int damage) {
        super(pos, 0, damage);
        IA=new InteligenciaGolpeEnemigo(this);

        width=60;
        height=45;

        imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/DisparoMagoHieloTR.gif");


    }

    public Entidad clone() {
        return new GolpeEnemigo(pos,damage);
    }
}
