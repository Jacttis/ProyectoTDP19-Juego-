package Juego;

import Entidad.*;
import Entidad.Aliados.Aliado;
import FabricaEnemigo.FabricaEnemigoGolemHielo;
import FabricaEnemigo.FabricaEnemigoGolemTierra;
import GUI.GUI;
import Tienda.*;
import Menu.Menu;
import javax.swing.*;
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

	public static Juego getJuego(){
		return instance;
	}

	public void mover() {

		Mapa.getMapa().mover();
		gui.actualizaEtiquetas();
		
		
	}

	public GUI getGUI(){
		return gui;
	}


	public void gameOver(String motivo){  // Juego
		instance=null;

		JLabel gameOver = new JLabel(motivo);
		JLabel gameOver2 = new JLabel(motivo);

		gameOver.setBounds(650,280,3000,400);
		gameOver.setForeground(Color.red);

		gameOver2.setBounds(654,284,3000,400);
		gameOver2.setForeground(Color.WHITE);

		Mapa.getMapa().getGui().add(gameOver);
		Mapa.getMapa().getGui().add(gameOver2);

		gameOver.setFont(new Font("Times New Roman", 2,100));
		gameOver2.setFont(new Font("Times New Roman", 2,100));

		try{
			Thread.sleep(2000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		Mapa.getMapa().getGui().getTiempo().terminate();
		Mapa.getMapa().getGui().dispose();
		Tienda.getTienda().gameOver();
		Mapa.getMapa().gameOver();
		Menu.getMenu();

	}
	
	
}
