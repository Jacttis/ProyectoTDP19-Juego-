package Inteligencia;

import Entidad.Entidad;


public class InteligenciaEnemigos extends Inteligencia {

	public InteligenciaEnemigos(Entidad e) {
		super(e);
	}

	@Override
	public void moverEntidad() {
		
		entidad.getPos().setLocation(entidad.getPos().x-1, entidad.getPos().y);
		entidad.cambiarGrafico(0);
		
	}
}
