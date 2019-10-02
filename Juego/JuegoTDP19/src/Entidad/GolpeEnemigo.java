package Entidad;


import Colisionadores.ColisionadorEnemigo;
import Colisionadores.ColisionadorGolpeEnemigo;
import Inteligencia.InteligenciaDisparoAliado;
import Inteligencia.InteligenciaGolpeEnemigo;

import javax.swing.*;
import java.awt.*;

public class GolpeEnemigo extends Disparo {

    public GolpeEnemigo(Point pos, int damage,int width,int height) {
        super(pos, 0, damage);
        IA=new InteligenciaGolpeEnemigo(this);
        colisionador=new ColisionadorGolpeEnemigo(this);

        this.width=width;
        this.height=height;

        imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/DisparoMagoHieloTR.gif");


    }

    public Entidad clone() {
        return new GolpeEnemigo(pos,damage,width,height);
    }
}
