package FabricaDisparos;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Personaje;
import Juego.Mapa;

public  class FabricaDisparo {
	private static FabricaDisparo instance=null;
	protected Mapa mapa;
	protected HiloPrueba hilo;
	
	private FabricaDisparo(Mapa mapa) {
		this.mapa=mapa;
		
	}

	public static FabricaDisparo getFabricaDisparos(){
		return instance;
	}

	public  static FabricaDisparo crearFabrica(Mapa mapa){
		if(instance==null) {
			instance=new FabricaDisparo(mapa);
		}
		return instance;
	}
	
	/**
	 * Hace que el aliado que pasa como parametro genere
	 * un disparo y despues utiliza el comando
	 * agregarEntidad de Mapa para agregar el disparo al mapa
	 * 
	 * @param aliado
	 */
	
	public void generarDisparo(Aliado aliado){
		Disparo disparo=aliado.disparar();
		if(disparo!=null) {
			mapa.agregarEntidad(disparo);
			hilo=new HiloPrueba(aliado);
			hilo.start();
		}
	}


}
