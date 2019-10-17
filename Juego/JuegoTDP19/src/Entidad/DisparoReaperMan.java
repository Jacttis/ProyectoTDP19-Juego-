package Entidad;

import Inteligencia.InteligenciaDisparoEnemigo;

import javax.swing.*;
import java.awt.*;

public class DisparoReaperMan extends Disparo {

    public DisparoReaperMan(Point pos, double velocidad, int damage, Personaje disparador) {
        super(pos, velocidad, damage, disparador);
        IA=new InteligenciaDisparoEnemigo(this);

        width=100;
        height=38;

        imagen[0]=new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/DisparoArqueroTRUE.gif");


    }

    public Entidad clone(){
        return new DisparoReaperMan(pos,velocidad,damage,disparador);
    }

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-30,height-20);
    }
}
