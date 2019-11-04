package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.*;
import GUI.GUI;
import Juego.Juego;
import Juego.Mapa;
import Niveles.Oleada.Oleada;
import Niveles.Oleada.PrimerOleada;


import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public abstract class Nivel extends Thread {

	protected Nivel nivelSiguiente;
	protected LinkedList<FabricaEnemigo> listaEnemigosSpawn;
	protected int oroPremio;
	protected Oleada oleada;
	protected JLabel cartelOleada;
	
	public Nivel() {
		oroPremio=5;
		listaEnemigosSpawn=new LinkedList<FabricaEnemigo>();
		this.llenarListaEnemigosSpawn();
		oleada = new PrimerOleada(this);

	}

	public abstract void run();

	protected int obtenerPosicionAleatoriaEnY(){
		Random r=new Random();
		int n=(r.nextInt(6));
		return Constantes.ENEMIGO_Y1 +(Constantes.ENEMIGO_Y2*n);
	}

	public abstract void llenarListaEnemigosSpawn();


	public LinkedList<FabricaEnemigo> getListaEnemigosSpawn(){
		return listaEnemigosSpawn;
	}


	public int getOroPremio(){
		return oroPremio;
	}

	public Nivel getNivelSiguiente(){
		return nivelSiguiente;
	}

	public abstract String getDireccionImagenFondoNivel();

	public void inicializarCartelPrimerOleada(){
		cartelOleada = new JLabel("PRIMER OLEADA!");
		cartelOleada.setForeground(Color.RED);
		cartelOleada.setBounds(500,300,300,300);

		Juego.getJuego().getGUI().add(cartelOleada);
	}

	public void inicializarCartelSegundaOleada(){
		cartelOleada = new JLabel("SEGUNDA OLEADA!");
		cartelOleada.setForeground(Color.RED);
		cartelOleada.setBounds(600,300,300,200);

		Juego.getJuego().getGUI().add(cartelOleada);
	}

	public void inicializarCartelTercerOleada(){
		cartelOleada = new JLabel("TERCER OLEADA!");
		cartelOleada.setForeground(Color.RED);
		cartelOleada.setBounds(600,300,300,200);

		Juego.getJuego().getGUI().add(cartelOleada);
	}

	public void removerCartelOleada(){
		Juego.getJuego().getGUI().remove(cartelOleada);
	}


}