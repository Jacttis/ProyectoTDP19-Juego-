package GUI;

import Juego.Juego;


public class HiloTiempo extends Thread{
	private Juego juego;
	private boolean fin=true;
	
	public HiloTiempo(Juego j) {
		juego=j;
		
	}
	
	public void run() {
		while(fin){
			try {
				
				juego.mover();
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void terminate() {
		fin=false;
	}

}
