package Niveles;

import Juego.Mapa;

public abstract class Nivel {

	protected Mapa mapa;
	
	public Nivel(Mapa mapa) {
		this.mapa=mapa;
	} 


	//genera los enemigos

	public abstract void generarEnemigos();










}