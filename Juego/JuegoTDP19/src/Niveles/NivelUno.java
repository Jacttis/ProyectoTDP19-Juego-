package Niveles;

import java.awt.Point;

import Entidad.ArqueroHumano;
import Entidad.EnemigoGolemHielo;
import Juego.Mapa;

public class NivelUno extends Nivel {

	public NivelUno(Mapa mapa) {
		super(mapa);
	}

	
	
	public void generarEnemigos() {
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,620),10,10,10,1,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,510),10,10,10,1,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,410),10,10,10,1,10));
		
		mapa.agregarEntidad(new ArqueroHumano(new Point(300,400),10,10,10,"")); // aliado Prueba
	}
	
	public void generarAliados() {
		
		mapa.agregarEntidad(new ArqueroHumano(new Point(300,400),10,10,10,""));
	
	
	}
}
