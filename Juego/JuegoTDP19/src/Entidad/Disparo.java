package Entidad;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorDisparo;
import Estados.EstadoNulo;

import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class Disparo extends Entidad {

	protected Personaje disparador;
	
	public Disparo(Point pos, int velocidad, int damage,Personaje disparador) {
		
		super(pos,velocidad,damage);
		imagen=new ImageIcon [1];
		colisionador=new ColisionadorDisparo(this);
		this.disparador=disparador;
		
		
	}

	public void afectarPersonaje(Personaje personajeAfectado){
		personajeAfectado.disminuirVida(this.damage);

	}

	public Personaje getDisparador(){
		return disparador;
	}

	public void serChocado(Colisionador colisionador){
		colisionador.afectarDisparo(this);
	}
}
