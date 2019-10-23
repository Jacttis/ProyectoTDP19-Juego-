package Entidad;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorDisparoEnemigo;
import Colisionadores.ColisionadorGolpeEnemigo;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoEnemigo;

import javax.swing.*;
import java.awt.*;

public class DisparoReaperMan extends Disparo {

    public DisparoReaperMan(Point pos, double velocidad, int damage, Personaje disparador) {
        super(pos, velocidad, damage, disparador);
        IA=new InteligenciaDisparoEnemigo(this);

        width=60;
        height=53;

        imagen[0]=new ImageIcon("Sprites/CharacterSprites/ReaperMan/DReaper.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        listaGraficos.add(sprites);

        colisionador=new ColisionadorDisparoEnemigo(this);


    }

    public Entidad clone(){
        return new DisparoReaperMan(pos,velocidad,damage,disparador);
    }

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-30,height-20);
    }
}
