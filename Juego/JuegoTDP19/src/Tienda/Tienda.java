package Tienda;

import java.awt.*;
import java.util.LinkedList;

import Entidad.Aliados.Aliado;

public class Tienda {

	private static Tienda instance=null;
	private LinkedList<Aliado> aliados;
	private int oro;
	private int puntos;
	private Aliado nextToAdd = null;

	private PosicionadorDeAliado posicionadorDeAliados;
	//private LinkedList<ObjetoPrecioso> objetos;

	private Tienda(){
		puntos=0;
		oro=4;
		posicionadorDeAliados=new PosicionadorDeAliado();
	}


	public  static Tienda getTienda(){
		if (instance==null){
			instance=new Tienda();
		}
		return instance;
	}

	public void intentoCompra(Point posicion){
		if(nextToAdd!=null)
			comprarAliado(posicion);
	}

	public void setNextToAdd(Aliado nextToAdd){
		if(oro>= nextToAdd.getPrecio()) {
			this.nextToAdd = nextToAdd;
		}
		else System.out.println("No tienes suficiente oro.");
	}

	//setters
	public void setPuntos(int puntos){
		this.puntos=puntos;
	}
	public void setOro(int oro){
		this.oro=oro;
	}
	public void aumentarOro(int oroAdicional){
		oro+=oroAdicional;
	}
	public void aumentarPuntos(int puntosAdicionales){puntos+=puntosAdicionales;}

	//getters
	public int getOro(){
		return oro;
	}
	public int getPuntos(){
		return puntos;
	}

	public void comprarAliado(Point pos){
		if(this.nextToAdd != null) {
			posicionadorDeAliados.posicionarAliado(pos, this.nextToAdd);
		}
	}

	public void eliminarAliadoDeGrilla(Aliado aliadoAEliminar){

		posicionadorDeAliados.desposicionarAliado(aliadoAEliminar);
	}


	public void disminuirOro(int costo){
		oro-=costo;
	}

	public void borrarNextToAdd(){
		nextToAdd=null;
	}



	
}
