package Niveles;

import java.awt.Point;

import Entidad.EnemigoGolemHielo;
import Juego.Mapa;

public class NivelUno extends Nivel {

	public NivelUno(Mapa mapa) {
		super(mapa);
	}

	
	
	public void generarEnemigos() {
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(300,300),10,10,10,10,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(300,500),10,10,10,10,10));
		
	}
}
