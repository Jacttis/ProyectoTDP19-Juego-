package Inteligencia;

import Entidad.Entidad;

public class InteligenciaDisparoAliado extends Inteligencia {

	public InteligenciaDisparoAliado(Entidad e) {
		super(e);
		
	}
	
	public void actualizarEntidad() {
		
		entidad.getPos().x=entidad.getPos().x+entidad.getVelocidad();
		entidad.cambiarGrafico(0);
	}

}
