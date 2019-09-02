package  Entidades;

import Inteligencia.Inteligencia;

import java.awt.*;

public class Aliado extends Entidades.Personaje {


    public Aliado(Point pos, int vida, int damage, int width, int height, float velocidadAtaque, Inteligencia IA) {
        super(pos, vida, damage, width, height, velocidadAtaque, IA);
    }
}
