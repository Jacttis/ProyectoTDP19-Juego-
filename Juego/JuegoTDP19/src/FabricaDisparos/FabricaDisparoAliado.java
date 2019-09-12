package FabricaDisparos;

import Entidad.Aliado;
import Entidad.Disparo;
import Juego.Mapa;

public class FabricaDisparoAliado extends FabricaDisparo {

	public FabricaDisparoAliado(Mapa mapa) {
		super(mapa);
	}
	
	
	
	
	
	/**
	 * Si el aliado puede disparar genera un disparo y lo inserta en el mapa
	 * 
	 * Crea una instancia de HiloPrueba la cual si se dispara, no deja que el aliado dispare por
	 * n segundos (dependiendo de la velocidad de ataque del mismo).
	 * 
	 */
	
	public void generarDisparo(Aliado aliado) {
		

		Disparo disparo=aliado.disparar();
		if(disparo!=null) {
			mapa.agregarEntidad(disparo);
			hilo=new HiloPrueba(aliado);
			hilo.start();
		
		}
		
		
		
		

	}

}
