package Niveles;

import java.awt.Point;

import Entidad.ArqueroHumano;
import Entidad.DisparoArqueroHumano;
import Entidad.EnemigoGolemHielo;
import Entidad.Entidad;
import Juego.Mapa;

public class NivelUno extends Nivel {

	public NivelUno(Mapa mapa) {
		super(mapa);
	}

	
	
	public void generarEnemigos() {
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,620),10,10,10,1,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,510),10,10,10,1,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,410),10,10,10,1,10));
	}
	
	public void generarAliados() {
		
		ArqueroHumano aliado1 = new ArqueroHumano(new Point(300,400),10,10,10,""); //agrega un aliado
		mapa.agregarEntidad(aliado1);
		
		Point posicionAliado=aliado1.getPos(); //Consulta la posicion del aliado y se guarda
		
		posicionAliado.setLocation(aliado1.getPos().getX(), aliado1.getPos().getY()+50); /* Modifica los Valores de Y para que la posicion 
																						sea la indicada */
		
		mapa.agregarEntidad(new DisparoArqueroHumano(posicionAliado,15,aliado1)); /* Se crea una identidad disparo,se le asigna Posicion del dispara
																					  su velocidad y el disparador */			
	
	}
	
	
	
	
}
