package Tienda;

import java.awt.*;
import java.util.LinkedList;

import Entidad.Aliado;

public class Tienda {

	private static Tienda instance=null;
	private LinkedList<Aliado> aliados;
	private int oro;
	private int puntos;

	private PosicionadorDeAliado posicionadorDeAliados;
	//private LinkedList<ObjetoPrecioso> objetos;

	private Tienda(){
		puntos=0;
		oro=4;
		posicionadorDeAliados=new PosicionadorDeAliado();
	}
	public  static Tienda crearTienda(){
		if (instance==null){
			instance=new Tienda();
		}
		return instance;
	}

	public  static Tienda getTienda(){
		if (instance==null){

		}
		return instance;
	}

	//setters
	public void setPuntos(int puntos){
		this.puntos=puntos;
	}
	public void setOro(int oro){
		this.oro=oro;
	}

	//getters
	public int getOro(){
		return oro;
	}
	public int getPuntos(){
		return puntos;
	}

	public void comprarAliado(Point pos,Aliado aliadoAAgregar){

		if(oro>=aliadoAAgregar.getPrecio()) {
			posicionadorDeAliados.posicionarAliado(pos, aliadoAAgregar);
			oro-=aliadoAAgregar.getPrecio();
		}
		else System.out.println("No tienes suficiente oro.");
	}

	public void eliminarAliadoDeGrilla(Aliado aliadoAEliminar){

		posicionadorDeAliados.desposicionarAliado(aliadoAEliminar);
	}




	
}
