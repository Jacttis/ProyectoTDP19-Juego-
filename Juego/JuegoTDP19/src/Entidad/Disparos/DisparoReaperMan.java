package Entidad.Disparos;

import Colisionadores.ColisionadoresDisparos.ColisionadorDisparoEnemigo;
import Entidad.*;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;
import Inteligencia.InteligenciaDisparoEnemigo;

import javax.swing.*;
import java.awt.*;

public class DisparoReaperMan extends Disparo {

    /**
     * Crea un DisparoReaperMan.
     *
     * Asigna los atributos correspondientes.
     *
     * Inicializa el atributo IA como una nueva Inteligencia InteligenciaDisparoEnemigo
     * con este mismo DisparoReaperMan parametrizado.
     *
     * Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad para
     * luego agregarlo a la lista de graficos componentesGraficas.
     *
     * @param pos
     * @param velocidad
     * @param damage
     * @param disparador
     */

    public DisparoReaperMan(Point pos, double velocidad, int damage, Personaje disparador) {
        super(pos, velocidad, damage, disparador);
        IA=new InteligenciaDisparoEnemigo(this);

        width=60;
        height=53;

        imagen[0]=new ImageIcon("Sprites/CharacterSprites/ReaperMan/dReaperTRUE.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        componentesGraficas.agregarNuevoGrafico(sprites);

        colisionador=new ColisionadorDisparoEnemigo(this);


    }

    /**
     * Redefinicion del getHitbox mas general
     *
     * Devuelve un rectangulo que reprensenta el hitbox del Disparo.
     *
     * @return Rectangle
     */


    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-30,height-20);
    }
}
