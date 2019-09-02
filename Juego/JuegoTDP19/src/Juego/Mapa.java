package Juego;

import java.util.LinkedList;

import Entidad.Entidad;
import GUI.GUI;
import Niveles.Nivel;
import Niveles.NivelUno;

public class Mapa {

	protected LinkedList<Entidad> entidades;
	protected Juego juego;
	protected Nivel nivel;
	protected GUI gui;
	
	
	public Mapa(Juego juego, GUI gui) {
		this.juego=juego;
		nivel=new NivelUno(this);
		this.gui=gui;
		entidades=new LinkedList<Entidad>();
	}
	
	public void mover() {
		nivel.generarEnemigos();
	}
	
	public void agregarEntidad(Entidad e) {
		gui.add(e.getGrafico());
		entidades.add(e);
		
	}
	
}
