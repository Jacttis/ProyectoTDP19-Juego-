package Juego;

import Entidad.*;
import FabricaDisparos.FabricaDisparo;
import FabricaEnemigo.FabricaEnemigoGolemHielo;
import FabricaEnemigo.FabricaEnemigoGolemTierra;
import GUI.GUI;

import Tienda.*;


import java.awt.*;
import java.util.LinkedList;

public class Juego {

	private static Juego instance=null;
	private GUI gui;





	
	
	/**
	 * Inicializa el mapa y ejecuta el comando mover de este mismo
	 *  
	 * @param gui
	 */
	
	private Juego(GUI gui) {


		this.gui=gui;


		FabricaEnemigoGolemHielo.getFabricaGolemHielo();
		FabricaEnemigoGolemTierra.getFabricaGolemTierra();
		Mapa.crearMapa(this,gui);
		Mapa.getMapa().generar();


		Tienda.getTienda();






		
	}

	public static Juego crearJuego(GUI gui){
		if(instance==null) {
			instance = new Juego(gui);
		}
		return instance;
	}
	public void mover() {
		
		Mapa.getMapa().mover();
		gui.actualizaEtiquetas();
		
		
	}

	public LinkedList<Entidad> getListaMapa(){
		return Mapa.getMapa().getEntidades();
	}


	/**
	 * Este llamado se produce desde GUI TIENDA y envia a
	 * tienda la posicion y el aliado a agregar
	 *
	 * @param pos
	 * @param aliadoAAgregar
	 */

	public void comprarAliado(Point pos, Aliado aliadoAAgregar){

		Tienda.getTienda().comprarAliado(pos,aliadoAAgregar);

	}

	public void gameOver(){
		gui.getTiempo().interrupt();
	}
	
	
}
