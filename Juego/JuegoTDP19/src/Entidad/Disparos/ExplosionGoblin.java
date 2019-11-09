package Entidad.Disparos;

import Colisionadores.ColisionadoresDisparos.ColisionadorExplosionGoblin;
import Entidad.Aliados.HiloExplosion;
import Entidad.*;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

import javax.swing.*;
import java.awt.*;

public class ExplosionGoblin extends Disparo {

    private HiloExplosion hilo;

    /**
     * Crea un ExplosionGoblin.
     *
     * Asigna los atributos correspondientes.
     *
     * Inicializa el atributo IA como una nueva Inteligencia InteligenciaDisparoAliado
     * con este mismo ExplosionGoblin parametrizado.
     *
     * Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad para
     * luego agregarlo a la lista de graficos componentesGraficas.
     *
     * Inicializa el HiloExplosion con este mismo ExplosionGoblin parametrizado y lo comienza.
     *
     * @param pos
     * @param velocidad
     * @param damage
     * @param disparador
     */

    public ExplosionGoblin(Point pos, double velocidad, int damage, Personaje disparador){
        super(pos, velocidad, damage, disparador);

        this.width=250;
        this.height=240;


        IA=new InteligenciaDisparoAliado(this);

        imagen[0]=new ImageIcon("src/Sprites/Explosion/explosionGIF.gif");

        this.pos.y=pos.y-50;

        Grafico sprites=new SpriteEntidad(this,imagen,-50,-50);
        componentesGraficas.agregarNuevoGrafico(sprites);

        colisionador=new ColisionadorExplosionGoblin(this);

        hilo=new HiloExplosion(this);
        hilo.start();
    }

}
