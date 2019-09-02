package Niveles;

import Juego.Mapa;

public abstract class Nivel {

	protected Mapa mapa;
	
	public Nivel(Mapa mapa) {
		this.mapa=mapa;
	} 


	/**
	 * Crea los enemigos correspondientes al nivel y los agrega al mapa
	 * 
	 */
	public abstract void generarEnemigos();










}