package Entidad.Enemigos;

import java.awt.*;
import javax.swing.*;

import Entidad.Entidad;
import FabricaDisparos.FabricaDisparoGolpeEnemigo;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;

public class EnemigoFallenAngel extends Enemigo {

    public EnemigoFallenAngel(int vida, int damage, float velocidadAtaque, int rango, double velocidad, int puntos, int oro){

        super(vida, damage, velocidadAtaque, rango, velocidad, puntos, oro);

        fabricaDisparo = new FabricaDisparoGolpeEnemigo(this);

        this.setWidth(160);

        imagen[0] = new ImageIcon("Sprites/EnemiesSprites/FallenAngel/caminandoTrue.gif");
        imagen[1] = new ImageIcon("Sprites/EnemiesSprites/FallenAngel/atacandoTrue.gif");
        imagen[2] = new ImageIcon("Sprites/EnemiesSprites/FallenAngel/muerteTrue.gif");
        imagen[3] = new ImageIcon("Sprites/EnemiesSprites/FallenAngel/muerteTrue.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        Grafico barraVida=new BarraDeVida(this,40,-15);
        componentesGraficas.agregarGrafico(sprites);
        componentesGraficas.agregarGrafico(barraVida);




    }






    /**
     * Implementacion del metodo abstracto clone en Entidad.
     *
     * Clona a la entidad y la devuelve.
     *
     * @return Entidad
     */

    public Entidad clone(){
        return new EnemigoFallenAngel(vidaTotal,damage,velocidadAtaque,rango,velocidad,puntos,oroPremio);
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


}
