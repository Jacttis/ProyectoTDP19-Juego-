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
		hiloNivel=new HiloNivel(this);
	}

	/**
	 * Genera los enemigos y utiliza agregarEntidad de mapa
	 * para insertarlos en el mismo
	 * 
	 */
	
	public void generarEnemigos() {

		Enemigo enemigo1=fabricaEnemigos.generarGolemHielo();
		enemigo1.posicionar(new Point(1800,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo1);

		Enemigo enemigo2=fabricaEnemigos.generarGolemHielo();
		enemigo2.posicionar(new Point(1970,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo2);

		Enemigo enemigo3=fabricaEnemigos.generarGolemHielo();
		enemigo3.posicionar(new Point(2140,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo3);

		Enemigo enemigo4=fabricaEnemigos.generarGolemHielo();
		enemigo4.posicionar(new Point(2310,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo4);



		hiloNivel.start();

	}
	


	
	
	
	
}
