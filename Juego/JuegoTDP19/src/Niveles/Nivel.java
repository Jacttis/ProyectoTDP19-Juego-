package Niveles;

import Juego.Mapa;

import java.awt.*;
import java.util.Random;

public abstract class Nivel {

	protected Mapa mapa;
	protected FabricaEnemigos fabricaEnemigos;
	protected HiloNivel hiloNivel;
	
	public Nivel(Mapa mapa) {
		this.mapa=mapa;
		fabricaEnemigos=new FabricaEnemigosNormales();
	}

	protected int obtenerPosicionAleatoriaEnY(){
		Random r=new Random();
		int n=(r.nextInt(6));
		return 285+(105*n);
	}


	/**
	 * Crea los enemigos correspondientes al nivel y los agrega al mapa
	 * 
	 */
	public abstract void generarEnemigos();











}