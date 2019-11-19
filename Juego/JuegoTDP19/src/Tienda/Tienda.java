package Tienda;

import java.awt.*;
import java.util.LinkedList;

import Entidad.Aliados.Aliado;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPrecioso;
import Juego.Mapa;

public class Tienda {

	private static Tienda instance=null;
	private LinkedList<Aliado> aliados;
	private int oro;
	private int puntos;
	private Aliado nextToAdd = null;
	private ObjetoPrecioso nextObjectToAdd = null;

	private PosicionadorDeAliado posicionadorDeAliados;
	//private LinkedList<ObjetoPrecioso> objetos;

	private Tienda(){
		puntos=0;
		oro=12000;
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
		else
			if(nextObjectToAdd!=null)
				colocarObjeto(posicion);

	}

	public void setNextObjectToAdd(ObjetoPrecioso objectToAdd){
		this.nextObjectToAdd = objectToAdd;
	}

	public void setNextToAdd(Aliado nextToAdd){
		if(oro>= nextToAdd.getPrecio()) {
			this.nextToAdd = nextToAdd;
		}
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

	public void colocarObjeto(Point pos){
		nextObjectToAdd.posicionar(pos);
		Mapa.getMapa().agregarEntidad(nextObjectToAdd);
		nextObjectToAdd=null;
	}


	public void disminuirOro(int costo){
		oro-=costo;
	}

	public void borrarNextToAdd(){
		nextToAdd=null;
	}

	public void venderAliado(Aliado aliado){
		if(aliado.getVida()==aliado.getVidaTotal())
			aumentarOro(aliado.getPrecio());
		else
			aumentarOro(aliado.getPrecio()/2);


		aliado.getPos().setLocation(0,0);
	}
	public void gameOver(){
		instance=null;
	}
	
}
