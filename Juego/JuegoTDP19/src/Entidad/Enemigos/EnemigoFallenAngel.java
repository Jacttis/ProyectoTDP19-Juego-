package Entidad.Enemigos;

import javax.swing.*;

import FabricaDisparos.FabricaDisparoGolpeEnemigo;
import Graficos.TiposGrafico.BarraDeVida;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;

public class EnemigoFallenAngel extends Enemigo {

    /**
     * Inicializa un EnemigoFallenAngel con sus correspondientes atributos y utilizando el constructor mas general
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

    public EnemigoFallenAngel(int vida, int damage, float velocidadAtaque, int rango, double velocidad, int puntos){

        super(vida, damage, velocidadAtaque, rango, velocidad, puntos);

        this.oroPremio = 3;

        this.setWidth(160);

        imagen[0] = new ImageIcon("src/Sprites/EnemiesSprites/FallenAngel/caminandoTrue.gif");
        imagen[1] = new ImageIcon("src/Sprites/EnemiesSprites/FallenAngel/atacandoTrue.gif");
        imagen[2] = new ImageIcon("src/Sprites/EnemiesSprites/FallenAngel/muerteTrue.gif");
        imagen[3] = new ImageIcon("src/Sprites/EnemiesSprites/FallenAngel/muerteTrue.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        Grafico barraVida=new BarraDeVida(this,40,-15);
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
            FabricaDisparoGolpeEnemigo.getFabricaDisparoGolpeEnemigo().generarDisparo(this);
    }


}
