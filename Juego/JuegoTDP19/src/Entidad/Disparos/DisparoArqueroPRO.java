package Entidad.Disparos;

import java.awt.*;

import javax.swing.ImageIcon;

import Colisionadores.ColisionadoresDisparos.ColisionadorDisparoArqueroPro;
import Entidad.*;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

public class DisparoArqueroPRO extends Disparo {

    /**
     * Crea un DisparoArqueroPRO.
     *
     * Asigna los atributos correspondientes.
     *
     * Inicializa el atributo IA como una nueva Inteligencia InteligenciaDisparoAliado
     * con este mismo DisparoArqueroPRO parametrizado.
     *
     * Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad para
     * luego agregarlo a la lista de graficos componentesGraficas.
     *
     * @param pos
     * @param velocidad
     * @param damage
     * @param disparador
     */

    public DisparoArqueroPRO(Point pos, double velocidad, int damage, Personaje disparador) {
        super(pos, velocidad, damage, disparador);
        IA=new InteligenciaDisparoAliado(this);

        width=90;
        height=26;

        imagen=new ImageIcon [2];
        imagen[0]=new ImageIcon("Sprites/CharacterSprites/Archer/gifs/FlechaPROPrimer.gif");
        imagen[1]=new ImageIcon("Sprites/CharacterSprites/Archer/gifs/FlechaPROSegundo.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,80);
        componentesGraficas.agregarNuevoGrafico(sprites);

        colisionador = new ColisionadorDisparoArqueroPro(this);


    }

    /**
     * Redefinicion del getHitbox mas general
     *
     * Devuelve un rectangulo que reprensenta el hitbox del personaje.
     *
     * @return Rectangle
     */

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-30,height-20);
    }

}
