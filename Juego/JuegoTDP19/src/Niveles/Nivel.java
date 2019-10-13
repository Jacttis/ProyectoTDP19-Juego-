package Niveles;

import Entidad.Enemigo;
import Juego.Mapa;

import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public abstract class Nivel {

	protected Mapa mapa;
	protected FabricaEnemigos fabricaEnemigos;
	protected HiloNivel hiloNivel;
	protected LinkedList<Enemigo> enemigosGenerados;
	protected int oroPremio;
	
	public Nivel(Mapa mapa) {
		this.mapa=mapa;
		fabricaEnemigos=new FabricaEnemigosNormales();
		enemigosGenerados=new LinkedList<Enemigo>();
		oroPremio=5;
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

	public void agregarEnemigo(Enemigo enemigo){
		enemigosGenerados.add(enemigo);
		mapa.agregarPersonaje(enemigo);
	}

	public LinkedList<Enemigo> getEnemigosGenerados(){
		return enemigosGenerados;
	}

	public void removerEnemigo(Enemigo e){
		enemigosGenerados.remove(e);
		if(murieronTodosLosEnemigos()){
			mapa.cambiarNivel(new NivelUno(mapa));
			System.out.println("CAMBIARARRRRRRRRRRRRRRR MAPAAAAAAAAAAAAAAAAAAAA");
		}
	}

	public boolean murieronTodosLosEnemigos(){
		return enemigosGenerados.size()==0;
	}

	public int getOroPremio(){
		return oroPremio;
	}







}