package Niveles;

import java.awt.Point;

import Entidad.EnemigoGolemHielo;
import Juego.Mapa;

public class NivelUno extends Nivel {

	public NivelUno(Mapa mapa) {
		super(mapa);
	}

	
	
	public void generarEnemigos() {
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,620),10,10,10,10,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,510),10,10,10,100,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,400),10,10,10,10,10));
		
		
		
	}
}
