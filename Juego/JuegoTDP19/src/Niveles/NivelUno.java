package Niveles;

import java.awt.Point;

import Entidad.ArqueroHumano;
import Entidad.DisparoArqueroHumano;
import Entidad.EnemigoGolemHielo;
import Entidad.Entidad;
import Entidad.MagoHielo;
import Juego.Mapa;

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
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,600),10,10,10,1,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,490),10,10,10,1,10));
		
		mapa.agregarEntidad(new EnemigoGolemHielo(new Point(1800,380),10,10,10,1,10));
	}
	
	
	/**
	 * Genera los aliados y utiliza agregarEntidad de mapa
	 * para insertarlos en el mismo
	 * 
	 */
	public void generarAliados() {
		
		ArqueroHumano aliado1 = new ArqueroHumano(new Point(235  ,345),10,10,1500,"",mapa.getFabricaDisparos()); //agrega un aliado
		mapa.agregarEntidad(aliado1);
		
		Point posicionAliado=aliado1.getPos(); //Consulta la posicion del aliado y se guarda
		

		ArqueroHumano aliado3 = new ArqueroHumano(new Point(490,255),10,10,1500,"",mapa.getFabricaDisparos());
		mapa.agregarEntidad(aliado3);
		
		MagoHielo aliado2 = new MagoHielo(new Point(660,510),10,10,1500,"",mapa.getFabricaDisparos());
		mapa.agregarEntidad(aliado2);
	
		
		
																				
	
	}
	
	
	
	
}
