package Juego;

import GUI.GUI;

public class Juego {

	
	private GUI gui;
	private Mapa mapa;
	//private Jugador jugador;
	
	public Juego(GUI gui) {
		
		mapa=new Mapa(this,gui);
		this.gui=gui;
		
		
		
	}
	
	public void mover() {
		
		mapa.mover();
		
	}
	
	
}
