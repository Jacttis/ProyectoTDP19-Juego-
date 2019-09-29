package FabricaDisparos;

import Entidad.Aliado;

public class HiloPrueba extends Thread {

	protected Aliado aliadoQueDispara;
	
	public HiloPrueba(Aliado a) {
		aliadoQueDispara=a;
	}
	
	/**
	 *  Hace que el aliado no pueda disparar y segun la velocidad de ataque del aliado
	 *  espera el tiempo correspondiente y lo vuelve a habilitar para disparar.
	 * 
	 */
	
	public void run() {
		try {
			
			aliadoQueDispara.setPuedeDisparar(false);
			//System.out.println("Espera 1,5 segundos para disparar");
			Thread.sleep((long) aliadoQueDispara.getVelocidadAtaque());
			aliadoQueDispara.setPuedeDisparar(true);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
