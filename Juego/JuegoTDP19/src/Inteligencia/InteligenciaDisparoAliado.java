package Inteligencia;

import Entidad.Entidad;

public class InteligenciaDisparoAliado extends Inteligencia {

	public InteligenciaDisparoAliado(Entidad e) {
		super(e);
		
	}
	
	public void actualizarEntidad() {
		
		entidad.getPos().setLocation(entidad.getPos().x+entidad.getVelocidad(),entidad.getPos().y);

		entidad.actualizarGraficos();

		if(entidad.getPos().x>2000)
			entidad.eliminarse();
	}

}
