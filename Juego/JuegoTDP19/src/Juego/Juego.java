package Juego;

import GUI.GUI;

public class Juego {

	private static Juego instance=null;
	private GUI gui;
	private Mapa mapa;
	//private Jugador jugador;
	
	
	/**
	 * Inicializa el mapa y ejecuta el comando mover de este mismo
	 *  
	 * @param gui
	 */
	
	private Juego(GUI gui) {
		
		
		this.gui=gui;
		mapa=Mapa.crearMapa(this,gui);
		mapa.generar();
		
	}

	public static Juego crearJuego(GUI gui){
		if(instance==null) {
			instance = new Juego(gui);
		}
		return instance;
	}
	public void mover() {
		
		mapa.mover();
		
		
	}
	
	
}
