package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.*;
import Juego.Mapa;


import java.util.LinkedList;
import java.util.Random;

public abstract class Nivel extends Thread {

	protected Nivel nivelSiguiente;
	protected LinkedList<Enemigo> enemigosGenerados;
	protected LinkedList<FabricaEnemigo> listaEnemigosSpawn;
	protected int oroPremio;
	
	public Nivel() {
		enemigosGenerados=new LinkedList<Enemigo>();
		oroPremio=5;
		listaEnemigosSpawn=new LinkedList<FabricaEnemigo>();
		this.llenarListaEnemigosSpawn();
	}

	public abstract void run();

	protected int obtenerPosicionAleatoriaEnY(){
		Random r=new Random();
		int n=(r.nextInt(6));
		return Constantes.ENEMIGO_Y1 +(Constantes.ENEMIGO_Y2*n);
	}

	public abstract void llenarListaEnemigosSpawn();


	public void agregarEnemigo(Enemigo enemigo){
		enemigosGenerados.add(enemigo);
		Mapa.getMapa().agregarEntidad(enemigo);
	}

	public LinkedList<Enemigo> getEnemigosGenerados(){
		return enemigosGenerados;
	}

	public void removerEnemigo(Enemigo e){
		enemigosGenerados.remove(e);
	}

	public boolean verificarEnemigos(){

		boolean enemigoGano=false;

		for(Enemigo enemigo : enemigosGenerados){
			if(enemigo.getPos().getX()<-100) {
				enemigoGano = true;
				break;
			}
		}

		return enemigoGano;
	}

	public boolean murieronTodosLosEnemigos(){
		return enemigosGenerados.size()==0;
	}

	public int getOroPremio(){
		return oroPremio;
	}

	public Nivel getNivelSiguiente(){
		return nivelSiguiente;
	}







}