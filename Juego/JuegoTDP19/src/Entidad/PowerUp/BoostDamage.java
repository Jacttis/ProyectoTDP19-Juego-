package Entidad.PowerUp;

import Colisionadores.Colisionador;
import Entidad.*;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Graficos.Grafico;
import Graficos.Potenciado;
import Graficos.SpriteEntidad;
import Juego.Mapa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoostDamage extends MagiaTemporal {

    protected int damageAumento;

    public BoostDamage(int duracion, int damageAumento){
        super(duracion);
        this.damageAumento=damageAumento;

        imagen[0]=new ImageIcon("Sprites/Fuego/FuegoDropTrue2.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);

        sprites.getGrafico().addMouseListener(new MouseOyenteMagiaCaida(this));

        componentesGraficas.agregarGrafico(sprites);

    }

    public void afectarPortador(Personaje portador){

        graficoRepresentativo=new Potenciado(portador,0,20);
        portador.getComponentesGraficas().agregarGrafico(graficoRepresentativo);

        portador.setDamage(portador.getDamage()+damageAumento);
    }



    public void afectarPersonaje(Aliado personaje){

        graficoRepresentativo=new Potenciado(personaje,-20,0);
        personaje.getComponentesGraficas().agregarNuevoGrafico(graficoRepresentativo);
        Mapa.getMapa().agregarEntidadGrafica(personaje);

        personaje.setDamage(personaje.getDamage()+damageAumento);
        System.out.println("Damage aliado despues : "+personaje.getDamage());
        tiempoAfecto=new HiloPowers(this,personaje);
        tiempoAfecto.start();

    }

    public void desafectarPersonaje(Aliado personaje){
        personaje.setDamage(personaje.getDamage()-damageAumento);
        personaje.getComponentesGraficas().eliminarGrafico(graficoRepresentativo);

        System.out.println("Damage aliado despues del efecto : "+personaje.getDamage());
    }



    public Entidad clone() {
        return new BoostDamage(duracion,damageAumento);
    }
}
