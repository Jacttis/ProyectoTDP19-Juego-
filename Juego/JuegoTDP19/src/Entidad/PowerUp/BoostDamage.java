package Entidad.PowerUp;

import Colisionadores.Colisionador;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Graficos.Grafico;
import Graficos.SpriteEntidad;

import javax.swing.*;
import java.awt.*;

public class BoostDamage extends MagiaTemporal {

    protected int damageAumento;

    public BoostDamage(Point pos, double velocidad,int duracion, int damageAumento){
        super(pos,velocidad,duracion);
        this.damageAumento=damageAumento;

        imagen[0]=new ImageIcon("Sprites/Golems/Golem_2/PNG/Vector Parts/Sword.png");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        listaGraficos.add(sprites);

    }

    public void afectarPotador(Enemigo portador){
        portador.setDamage(portador.getDamage()+damageAumento);
    }

    public void serChocado(Colisionador colisionador) {
        colisionador.afectarPowerUp(this);
    }

    public void afectarPersonaje(Personaje personaje){
        personaje.setDamage(personaje.getDamage()+damageAumento);
        tiempoAfecto=new HiloPowers(this,personaje);
        tiempoAfecto.start();

    }

    public void desafectarPersonaje(Personaje personaje){
        personaje.setDamage(personaje.getDamage()-damageAumento);
    }



    public Entidad clone() {
        return new BoostDamage(pos,velocidad,duracion,damageAumento);
    }
}
