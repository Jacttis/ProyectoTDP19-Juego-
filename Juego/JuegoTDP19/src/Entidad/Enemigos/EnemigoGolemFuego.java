package Entidad.Enemigos;

import javax.swing.*;

import FabricaDisparos.FabricaDisparoGolpeEnemigo;
import Graficos.TiposGrafico.BarraDeVida;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;


public class EnemigoGolemFuego extends Enemigo {

    /**
     * Inicializa un EnemigoGolemFuego con sus correspondientes atributos y utilizando el constructor mas general
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
     * @param oro
     * @param puntos
     */

    public EnemigoGolemFuego(int vida, int damage, float velocidadAtaque,int rango, double velocidad, int puntos, int oro) {

        super(vida, damage, velocidadAtaque, rango, velocidad, puntos, oro);


        this.setWidth(165);

        imagen[0] = new ImageIcon("Sprites/Golems/GolemFuegoGIF/caminandoTRUEN2.gif");
        imagen[1] = new ImageIcon("Sprites/Golems/GolemFuegoGIF/atacandoTRUE3.gif");
        imagen[2] = new ImageIcon("Sprites/Golems/GolemFuegoGIF/GolemFuegoMuerte5.gif");
        imagen[3] = new ImageIcon("Sprites/Golems/GolemFuegoGIF/GolemFuegoMuerte5.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        Grafico barraVida=new BarraDeVida(this,45,-10);

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

