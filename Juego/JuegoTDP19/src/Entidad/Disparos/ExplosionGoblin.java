package Entidad.Disparos;

import Colisionadores.ColisionadoresDisparos.ColisionadorExplosionGoblin;
import Entidad.Aliados.HiloExplosion;
import Entidad.*;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

import javax.swing.*;
import java.awt.*;

public class ExplosionGoblin extends Disparo {

    private HiloExplosion hilo;

    public ExplosionGoblin(Point pos, double velocidad, int damage, Personaje disparador){
        super(pos, velocidad, damage, disparador);

        this.width=250;
        this.height=240;


        IA=new InteligenciaDisparoAliado(this);

        imagen[0]=new ImageIcon("Sprites/Explosion/explosionGIF.gif");

        this.pos.y=pos.y-50;

        Grafico sprites=new SpriteEntidad(this,imagen,-50,-50);
        componentesGraficas.agregarNuevoGrafico(sprites);

        colisionador=new ColisionadorExplosionGoblin(this);

        hilo=new HiloExplosion(this);
        hilo.start();
    }

    public Entidad clone(){return new ExplosionGoblin(pos,velocidad,damage,disparador);}
}
