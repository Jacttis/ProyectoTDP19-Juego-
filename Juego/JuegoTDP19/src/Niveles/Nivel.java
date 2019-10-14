package Niveles;

import Constantes.Constantes;
import Entidad.Enemigo;
import FabricaEnemigo.*;
import Juego.Mapa;


import java.util.LinkedList;
import java.util.Random;

public abstract class Nivel {

	protected HiloNivel hiloNivel;
	protected LinkedList<Enemigo> enemigosGenerados;
	protected int oroPremio;
	
	public Nivel() {
		enemigosGenerados=new LinkedList<Enemigo>();
		oroPremio=5;
	}

	protected int obtenerPosicionAleatoriaEnY(){
		Random r=new Random();
		int n=(r.nextInt(6));
		return Constantes.ENEMIGO_Y1 +(Constantes.ENEMIGO_Y2*n);
	}

	/**
	 * Empieza la ejecucion del nivel.
	 */

	public abstract void empezarNivel();

	/**
	 * Crea los enemigos correspondientes al nivel y los agrega al mapa
	 * 
	 */
	public abstract void generarEnemigos();

	public void agregarEnemigo(Enemigo enemigo){
		enemigosGenerados.add(enemigo);
		Mapa.getMapa().agregarPersonaje(enemigo);
	}

	public LinkedList<Enemigo> getEnemigosGenerados(){
		return enemigosGenerados;
	}

	public void removerEnemigo(Enemigo e){
		enemigosGenerados.remove(e);
		if(murieronTodosLosEnemigos()){
			Mapa.getMapa().cambiarNivel(new NivelDos());
			System.out.println("CAMBIARARRRRRRRRRRRRRRR MAPAAAAAAAAAAAAAAAAAAAA");
		}
	}

	public boolean verificarEnemigos(){

		boolean enemigoGano=false;

		for(Enemigo enemigo : enemigosGenerados){
			if(enemigo.getPos().getX()<-100)
				enemigoGano=true;
		}

		return enemigoGano;
	}

	public boolean murieronTodosLosEnemigos(){
		return enemigosGenerados.size()==0;
	}

	public int getOroPremio(){
		return oroPremio;
	}







}