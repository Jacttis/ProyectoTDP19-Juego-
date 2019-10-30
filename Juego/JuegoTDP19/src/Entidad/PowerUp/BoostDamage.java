package Entidad.PowerUp;

import Colisionadores.Colisionador;
import Entidad.*;
import Entidad.Enemigos.Enemigo;
import Graficos.Grafico;
import Graficos.Potenciado;
import Graficos.SpriteEntidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoostDamage extends MagiaTemporal {

    protected int damageAumento;

    public BoostDamage(Point pos, double velocidad,int duracion, int damageAumento){
        super(pos,velocidad,duracion);
        this.damageAumento=damageAumento;

        imagen[0]=new ImageIcon("Sprites/Fuego/FuegoDropTrue2.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);

        sprites.getGrafico().addMouseListener(new MouseOyentePowerUp(this));

        componentesGraficas.agregarNuevoGrafico(sprites);

    }

    public void afectarPortador(Enemigo portador){

        Grafico etiquetaPotenciado=new Potenciado(portador,0,20);
        portador.getComponentesGraficas().agregarNuevoGrafico(etiquetaPotenciado);

        portador.setDamage(portador.getDamage()+damageAumento);
    }

    public void serChocado(Colisionador colisionador) {
        colisionador.afectarPowerUp(this);
    }

    public void afectarPersonaje(Personaje personaje){

        Grafico etiquetaPotenciado=new Potenciado(personaje,-20,0);
        personaje.getComponentesGraficas().agregarNuevoGrafico(etiquetaPotenciado);

        personaje.setDamage(personaje.getDamage()+damageAumento);
        System.out.println("Damage aliado despues : "+personaje.getDamage());
        tiempoAfecto=new HiloPowers(this,personaje);
        tiempoAfecto.start();

    }

    public void desafectarPersonaje(Personaje personaje){
        personaje.setDamage(personaje.getDamage()-damageAumento);
        System.out.println("Damage aliado despues del efecto : "+personaje.getDamage());
    }



    public Entidad clone() {
        return new BoostDamage(pos,velocidad,duracion,damageAumento);
    }
}
