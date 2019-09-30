package FabricaDisparos;

import Entidad.*;
import Juego.Mapa;
import java.awt.Point;
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

	public  static FabricaDisparo crearFabricaDisparos(Mapa mapa){
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


	public void generarDisparoArqueroHumano(Aliado aliado){
		Disparo disparo=new DisparoArqueroHumano(new Point(aliado.getPos().x+30,aliado.getPos().y+50),15,aliado.getDamage());

		mapa.agregarEntidad(disparo);
		hilo=new HiloPrueba(aliado);
		hilo.start();

	}

	public void generarDisparoMagoHielo(Aliado aliado){
		Disparo disparo=new DisparoMagoHielo(new Point(aliado.getPos().x+28,aliado.getPos().y+40),12,aliado.getDamage());
		mapa.agregarEntidad(disparo);
		hilo=new HiloPrueba(aliado);
		hilo.start();

	}




}
