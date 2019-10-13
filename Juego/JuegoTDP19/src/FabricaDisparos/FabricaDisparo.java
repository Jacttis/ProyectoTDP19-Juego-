package FabricaDisparos;

import Entidad.*;
import Juego.Mapa;
import java.awt.Point;
public abstract class FabricaDisparo {

	protected HiloPrueba hiloPuedeAtacar;
	protected Personaje disparador;
	
	public FabricaDisparo(Personaje disparador) {
		this.disparador=disparador;
		hiloPuedeAtacar=new HiloPrueba(disparador);
	}



	/**
	 * Hace que el aliado que pasa como parametro genere
	 * un disparo y despues utiliza el comando
	 * agregarEntidad de Mapa para agregar el disparo al mapa
	 * 
	 *
	 */

	public abstract void generarDisparo();





}
