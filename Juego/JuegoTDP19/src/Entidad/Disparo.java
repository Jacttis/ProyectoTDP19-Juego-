package Entidad;

import Estados.EstadoNulo;

import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class Disparo extends Entidad {

	
	
	public Disparo(Point pos, int velocidad, int damage) {
		
		super(pos,velocidad,damage);
		
		estado=new EstadoNulo(this);
		imagen=new ImageIcon [1];
		
		
	}

	public void afectar(int n){

	}
}
