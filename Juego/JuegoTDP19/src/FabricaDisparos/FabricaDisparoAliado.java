package FabricaDisparos;

import Entidad.Aliado;
import Entidad.Disparo;
import Juego.Mapa;

public class FabricaDisparoAliado extends FabricaDisparo {

	public FabricaDisparoAliado(Mapa mapa) {
		super(mapa);
	}
	
	
	
	
	
	public void generarDisparo(Aliado aliado) {
		
	
		
		mapa.agregarEntidad(aliado.disparar());
		
		
		

	}

}
