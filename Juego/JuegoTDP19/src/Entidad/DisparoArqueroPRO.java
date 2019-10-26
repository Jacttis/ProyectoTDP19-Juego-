package Entidad;

import java.awt.*;

import javax.swing.ImageIcon;

import Colisionadores.ColisionadorDisparoArqueroPro;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

public class DisparoArqueroPRO extends Disparo {

    public DisparoArqueroPRO(Point pos, double velocidad, int damage, Personaje disparador) {
        super(pos, velocidad, damage, disparador);
        IA=new InteligenciaDisparoAliado(this);

        width=100;
        height=38;

        imagen=new ImageIcon [2];
        imagen[0]=new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/DisparoArqueroTRUE.gif");
        imagen[1]=new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/DisparoArqueroTRUE.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        componentesGraficas.agregarNuevoGrafico(sprites);

        colisionador=new ColisionadorDisparoArqueroPro(this);


    }

    public Entidad clone(){
        return new DisparoArqueroPRO(pos,velocidad,damage,disparador);
    }

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-30,height-20);
    }

}
