package Inteligencia;

import Entidad.Entidad;


public class InteligenciaEnemigos extends Inteligencia {

	public InteligenciaEnemigos(Entidad e) {
		super(e);
	}

	@Override
	public void actualizarEntidad() {
		
		entidad.getPos().setLocation(entidad.getPos().x-entidad.getVelocidad(), entidad.getPos().y);
		entidad.cambiarGrafico(0);
		
	}
}
