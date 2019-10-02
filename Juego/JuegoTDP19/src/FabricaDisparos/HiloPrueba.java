package FabricaDisparos;

import Entidad.*;

public class HiloPrueba extends Thread {

	protected Personaje personajeQueDispara;
	
	public HiloPrueba(Personaje a) {
		personajeQueDispara=a;
	}
	
	/**
	 *  Hace que el aliado no pueda disparar y segun la velocidad de ataque del aliado
	 *  espera el tiempo correspondiente y lo vuelve a habilitar para disparar.
	 * 
	 */
	
	public void run() {
		try {
			
			personajeQueDispara.setPuedeAtacar(false);
			//System.out.println("Espera 1,5 segundos para disparar");
			Thread.sleep((long) personajeQueDispara.getVelocidadAtaque());
			personajeQueDispara.setPuedeAtacar(true);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
