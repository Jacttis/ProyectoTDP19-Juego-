package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class Disparo extends Entidad {

	
	
	public Disparo(Point pos, int velocidad, Entidad disparador) {
		
		super(pos,velocidad,disparador.getDamage());
		
		
		imagen=new ImageIcon [1];
		
		
	}
}
