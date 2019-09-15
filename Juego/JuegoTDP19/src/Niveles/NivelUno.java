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
		
		ArqueroHumano aliado1 = new ArqueroHumano(new Point(300,400),10,10,1500,"",mapa.getFabricaDisparos()); //agrega un aliado
		mapa.agregarEntidad(aliado1);
		
		Point posicionAliado=aliado1.getPos(); //Consulta la posicion del aliado y se guarda
		
		posicionAliado.setLocation(aliado1.getPos().getX(), aliado1.getPos().getY()+90); /* Modifica los Valores de Y para que la posicion 
																						sea la indicada */
		
		
		
		MagoHielo aliado2 = new MagoHielo(new Point(600,400),10,10,1500,"",mapa.getFabricaDisparos());
		mapa.agregarEntidad(aliado2);
	
		
		
																				
	
	}
	
	
	
	
}
