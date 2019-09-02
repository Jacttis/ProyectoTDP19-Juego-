package Juego;

import GUI.GUI;

public class Juego {

	
	private GUI gui;
	private Mapa mapa;
	//private Jugador jugador;
	
	
	/**
	 * Inicializa el mapa y ejecuta el comando mover de este mismo
	 *  
	 * @param gui
	 */
	
	public Juego(GUI gui) {
		
		
		this.gui=gui;
		mapa=new Mapa(this,gui);
		
		
		mapa.generar();
		
	}
	
	public void mover() {
		
		mapa.mover();
		
		
	}
	
	
}
