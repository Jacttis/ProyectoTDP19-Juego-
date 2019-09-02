package Juego;

import java.util.LinkedList;

import Entidad.Entidad;
import GUI.GUI;
import Niveles.Nivel;

public class Mapa {

	protected LinkedList<Entidad> entidades;
	protected Juego juego;
	protected Nivel nivel;
	protected GUI gui;
	
	public Mapa(Juego juego, Nivel nivel, GUI gui) {
		this.juego=juego;
		this.nivel=nivel;
		this.gui=gui;
	}
	
	public void agregarEntidad(Entidad e) {
		entidades.add(e);
		gui.add(e.getGrafico());
	}
	
}
