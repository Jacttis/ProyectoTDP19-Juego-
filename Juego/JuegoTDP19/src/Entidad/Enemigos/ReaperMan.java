package Entidad.Enemigos;

import FabricaDisparos.*;
import Graficos.TiposGrafico.BarraDeVida;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;

import javax.swing.*;

public class ReaperMan extends Enemigo {

    /**
     * Inicializa un ReaperMan con sus correspondientes atributos y utilizando el constructor mas general
     * de Enemigo.
     *
     * Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad y BarraDeVida para
     * luego agregarlos a la lista de graficos componentesGraficas.
     *
     * @param vida
     * @param damage
     * @param velocidadAtaque
     * @param rango
     * @param velocidad
     * @param puntos
     */

    public ReaperMan(int vida,int damage, float velocidadAtaque,int rango,double velocidad,int puntos){

        super(vida,damage,velocidadAtaque,rango,velocidad,puntos);

        this.oroPremio = 3;

        imagen[0] = new ImageIcon("src/Sprites/CharacterSprites/ReaperMan/walkingReaperMan2.gif");
        imagen[1] = new ImageIcon("src/Sprites/CharacterSprites/ReaperMan/slashingReaperMan3.gif");
        imagen[2] = new ImageIcon("src/Sprites/CharacterSprites/ReaperMan/dyingReaperMan3.gif");
        imagen[3] = new ImageIcon("src/Sprites/CharacterSprites/ReaperMan/dyingReaperMan3.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        Grafico barraVida=new BarraDeVida(this,30,-15);
        componentesGraficas.agregarGrafico(sprites);
        componentesGraficas.agregarGrafico(barraVida);

    }

    /**
     *
     * Implementacion del metodo abstracto atacar ubicado en Personaje.
     * Si puede atacar genera un golpe mediante la fabrica de Disparos la cual lo insertara en el mapa.
     *
     */

    public void atacar(){

        if(puedeAtacar)
            FabricaDisparoReaperMan.getFabricaDisparoReaperMan().generarDisparo(this);
    }



}
