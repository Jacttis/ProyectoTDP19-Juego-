package Niveles;

import Juego.Mapa;

public abstract class Nivel {

	protected Mapa mapa;
	protected FabricaEnemigos fabricaEnemigos;
	
	public Nivel(Mapa mapa) {
		this.mapa=mapa;
		fabricaEnemigos=new FabricaEnemigosNormales();
	} 


	/**
	 * Crea los enemigos correspondientes al nivel y los agrega al mapa
	 * 
	 */
	public abstract void generarEnemigos();
	
	public abstract void generarAliados();










}