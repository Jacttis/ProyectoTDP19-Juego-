package Inteligencia;

import Entidades.Entidad;

public abstract class Inteligencia {

	protected Entidad entidad;
	
	public Inteligencia(Entidad e) {
		entidad=e;
		
	}
	
	public abstract void mover();
}
