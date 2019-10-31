package Entidad.Enemigos;

import Entidad.*;
import FabricaDisparos.*;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;

import javax.swing.*;
import java.awt.*;

public class ReaperMan extends Enemigo {

    public ReaperMan(int vida,int damage, float velocidadAtaque,int rango,double velocidad,int puntos,int oro){

        super(vida,damage,velocidadAtaque,rango,velocidad,puntos,oro);
        fabricaDisparo=new FabricaDisparoReaperMan(this);

        imagen[0] = new ImageIcon("Sprites/CharacterSprites/ReaperMan/walkingReaperMan2.gif");
        imagen[1] = new ImageIcon("Sprites/CharacterSprites/ReaperMan/slashingReaperMan3.gif");
        imagen[2] = new ImageIcon("Sprites/CharacterSprites/ReaperMan/dyingReaperMan3.gif");
        imagen[3] = new ImageIcon("Sprites/CharacterSprites/ReaperMan/dyingReaperMan3.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        Grafico barraVida=new BarraDeVida(this,30,-15);
        componentesGraficas.agregarGrafico(sprites);
        componentesGraficas.agregarGrafico(barraVida);

    }



    public Entidad clone(){
        return new ReaperMan(vidaTotal,damage,velocidadAtaque,rango,velocidad,puntos,oroPremio);
    }
    /**
     *
     * Implementacion del metodo abstracto atacar ubicado en Personaje.
     * Si puede atacar genera un golpe mediante la fabrica de Disparos la cual lo insertara en el mapa.
     *
     */

    public void atacar(){

        if(puedeAtacar)
            fabricaDisparo.generarDisparo();
    }



    /**
     * Redefinicion del getHitbox mas general.
     *
     * Devuelve un rectangulo que reprensenta el hitbox del personaje.
     *
     * @return Rectangle
     */

    public Rectangle getHitBox(){
        return new Rectangle(pos.x+40,pos.y,width-30,height-70);
    }

}
