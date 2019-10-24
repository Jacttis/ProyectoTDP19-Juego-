package Entidad;

import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

import javax.swing.*;
import java.awt.*;

public class GolpeCaballeroEscudo extends Disparo {

    public GolpeCaballeroEscudo(Point pos, double velocidad, int damage,Personaje disparador){
        super(pos, velocidad, damage, disparador);

        IA=new InteligenciaDisparoAliado(this);
        this.width=100;
        this.height=38;

        imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/slash.png");
        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        listaGraficos.add(sprites);

    }

    public Entidad clone(){return new GolpeCaballeroEscudo(pos,velocidad,damage,disparador);}

    public Rectangle getHitBox(){return new Rectangle(pos.x,pos.y,width-30,height-20);}
}
