package Inteligencia;

import Entidad.Entidad;

public abstract class Inteligencia {

	protected Entidad entidad;
	
	public Inteligencia(Entidad e) {
		entidad=e;
		
	}

	/**
	 * Metodo abstracto que determina como se actualizara la entidad dependiendo
	 * cada Inteligencia.
	 *
	 */

	public abstract void actualizarEntidad();
}
