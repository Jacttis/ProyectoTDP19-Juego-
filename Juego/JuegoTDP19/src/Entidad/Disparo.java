package Entidad;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorDisparo;
import Estados.EstadoNulo;

import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class Disparo extends Entidad {

	
	
	public Disparo(Point pos, int velocidad, int damage) {
		
		super(pos,velocidad,damage);
		imagen=new ImageIcon [1];
		colisionador=new ColisionadorDisparo(this);
		
		
	}

	public void afectarPersonaje(Personaje personajeAfectado){
		personajeAfectado.disminuirVida(this.damage);
	}



	public void serChocado(Colisionador colisionador){
		colisionador.afectarDisparo(this);
	}
}
