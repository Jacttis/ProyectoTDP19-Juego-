package Juego;

import Entidad.*;
import GUI.GUI;

import Tienda.*;

import javax.rmi.CORBA.Tie;
import java.awt.*;
import java.util.LinkedList;

public class Juego {

	private static Juego instance=null;
	private GUI gui;
	private Mapa mapa;
	private Tienda tienda;
	public ComunicadorEntidadMapa comunicadorEntidadMapa;



	
	
	/**
	 * Inicializa el mapa y ejecuta el comando mover de este mismo
	 *  
	 * @param gui
	 */
	
	private Juego(GUI gui) {


		this.gui=gui;
		mapa=Mapa.crearMapa(this,gui);
		comunicadorEntidadMapa.getComunicadorEntidadMapa(mapa);
		mapa.generar();


		tienda = tienda.crearTienda(new PosicionadorDeAliado(mapa));






		
	}

	public static Juego crearJuego(GUI gui){
		if(instance==null) {
			instance = new Juego(gui);
		}
		return instance;
	}
	public void mover() {
		
		mapa.mover();
		
		
	}

	public LinkedList<Entidad> getListaMapa(){
		return mapa.getEntidades();
	}


	public void comprarAliado(Point pos, Aliado aliadoAAgregar){

		tienda.agregarAliado(pos,aliadoAAgregar);


	}
	
	
}
