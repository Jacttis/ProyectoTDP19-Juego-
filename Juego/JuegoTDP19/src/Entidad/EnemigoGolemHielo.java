package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import Inteligencia.Inteligencia;

public class EnemigoGolemHielo extends Enemigo {

	public EnemigoGolemHielo(Point pos, int vida, int damage, float velocidadAtaque, int velocidad, int puntos) {

		super(pos, vida, damage, velocidadAtaque, velocidad, puntos);
		imagen[0] = new ImageIcon("Sprites/Golems/GolemHieloGIF/CaminandoTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/Golems/GolemHieloGIF/AtacandoTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/Golems/GolemHieloGIF/ASDF.gif");

	}

	@Override
	protected int getOro() {
	
		return 0;
	}

	
}
