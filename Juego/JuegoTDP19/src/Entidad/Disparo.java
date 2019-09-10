package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class Disparo extends Entidad {

	
	
	public Disparo(Point pos, int velocidad, int damage) {
		
		super(pos,velocidad,damage);
		
		
		imagen=new ImageIcon [1];
		
		
	}
}
