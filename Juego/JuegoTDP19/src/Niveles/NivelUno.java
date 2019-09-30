package Niveles;

import java.awt.Point;

import Entidad.ArqueroHumano;
import Entidad.DisparoArqueroHumano;
import Entidad.EnemigoGolemHielo;
import Entidad.Entidad;
import Entidad.MagoHielo;
import Juego.Mapa;
import Entidad.*;

public class NivelUno extends Nivel {

	public NivelUno(Mapa mapa) {
		super(mapa);
	}

	/**
	 * Genera los enemigos y utiliza agregarEntidad de mapa
	 * para insertarlos en el mismo
	 * 
	 */
	
	public void generarEnemigos() {

		Entidad enemigo1=fabricaEnemigos.generarGolemHielo();
		enemigo1.posicionar(new Point(1800,600));
		mapa.agregarEntidad(enemigo1);

		Entidad enemigo2=fabricaEnemigos.generarGolemHielo();
		enemigo2.posicionar(new Point(1800,495));
		mapa.agregarEntidad(enemigo2);


	}
	


	
	
	
	
}
