package Entidad.PowerUp;

import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;

import javax.swing.*;
import java.awt.*;

public class BoostDamage extends MagiaTemporal {

    protected int damageAumento;

    public BoostDamage(Point pos, double velocidad,int duracion, int damageAumento){
        super(pos,velocidad,duracion);
        this.damageAumento=damageAumento;

        imagen[0]=new ImageIcon("Sprites/Golems/Golem_2/PNG/Vector Parts/Sword.png");

    }

    public void serDetectado(ColisionadorCombate colisionadorCombate) {

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
