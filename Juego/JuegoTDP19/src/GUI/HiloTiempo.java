package GUI;

import com.sun.glass.ui.Timer;

import Juego.Juego;


public class HiloTiempo extends Thread{
	private Juego juego;
	private boolean fin=true;
	
	public HiloTiempo(Juego juego) {
		this.juego=juego;
		
		
	}
	/**
	 * Luego de que la GUI llama al metodo start se ejecuta el metodo run
	 */
	public void run() {
		while(fin){
			try {
				
				juego.mover();
				
				
				
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void terminate() {
		fin=false;
	}
	


}
