package Inteligencia;

import Entidad.*;


public class InteligenciaEnemigos extends Inteligencia {

	public InteligenciaEnemigos(Entidad e) {
		super(e);
	}


	public void actualizarEntidad() {

		entidad.getPos().setLocation(entidad.getPos().x-entidad.getVelocidad(), entidad.getPos().y);


		
	}
}
