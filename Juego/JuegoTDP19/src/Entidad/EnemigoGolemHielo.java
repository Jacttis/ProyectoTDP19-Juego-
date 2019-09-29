package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import Inteligencia.Inteligencia;

public class EnemigoGolemHielo extends Enemigo {

	public EnemigoGolemHielo(int vida, int damage, float velocidadAtaque, int velocidad, int puntos) {

		super(vida, damage, velocidadAtaque, velocidad, puntos);
		imagen[0] = new ImageIcon("Sprites/Golems/GolemHieloGIF/CaminandoTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/Golems/GolemHieloGIF/AtacandoTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/Golems/GolemHieloGIF/ASDF.gif");

	}

	@Override
	protected int getOro() {
	
		return 0;
	}


	@Override
	public void atacar() {

	}

	public Entidad clone(){
		return new EnemigoGolemHielo(vida,damage,velocidadAtaque,velocidad,puntos);
	}
}
