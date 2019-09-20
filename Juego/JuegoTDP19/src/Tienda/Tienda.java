package Tienda;

import java.util.LinkedList;

import Entidad.Aliado;

public class Tienda {

	private static Tienda instance=null;
	private LinkedList<Aliado> aliados;
	private Jugador jugador;
	//private LinkedList<ObjetoPrecioso> objetos;

	private Tienda(Jugador jugador){
		this.jugador=jugador;
	}
	public  static Tienda crearTienda(Jugador jugador){
		if (instance==null){
			instance=new Tienda(jugador);
		}
		return instance;
	}





	
	
}
