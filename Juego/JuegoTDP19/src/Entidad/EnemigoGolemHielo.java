package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import Inteligencia.Inteligencia;

public class EnemigoGolemHielo extends Enemigo {

	public EnemigoGolemHielo(Point pos, int vida, int damage, float velocidadAtaque, int velocidad, int puntos) {

		super(pos, vida, damage, velocidadAtaque, velocidad, puntos);
		imagen[0] = new ImageIcon("Sprites\\Golems\\GolemHieloGIF\\aaa4.gif");

	}

	@Override
	protected int getOro() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
