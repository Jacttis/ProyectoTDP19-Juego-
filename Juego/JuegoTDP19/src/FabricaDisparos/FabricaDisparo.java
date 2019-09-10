package FabricaDisparos;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Personaje;
import Juego.Mapa;

public abstract class FabricaDisparo {

	protected Mapa mapa;
	
	
	public FabricaDisparo(Mapa mapa) {
		this.mapa=mapa;
		
	}
	
	
	/**
	 * Hace que el aliado que pasa como parametro genere
	 * un disparo y despues utiliza el comando
	 * agregarEntidad de Mapa para agregar el disparo al mapa
	 * 
	 * @param aliado
	 */
	
	public abstract void generarDisparo(Aliado aliado);
		
		
	
}
