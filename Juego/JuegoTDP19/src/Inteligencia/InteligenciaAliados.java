package Inteligencia;

import java.util.Random;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Entidad;
import Graficos.Grafico;

public class InteligenciaAliados extends Inteligencia {

	
	
	public InteligenciaAliados(Aliado e) {
		super(e);
		
	}


	public void actualizarEntidad() {

		entidad.actualizarGraficos();
		
	}
	
	
}
