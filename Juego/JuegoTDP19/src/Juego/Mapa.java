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
	
	
	/**
	 * Crea lista de entidades
	 * Inicializa el nivel
	 * @param juego 
	 * @param gui pantalla prinpal del juego
	 */
	
	public Mapa(Juego juego, GUI gui) {
		this.juego=juego;
		nivel=new NivelUno(this);
		this.gui=gui;
		entidades=new LinkedList<Entidad>();
	}
	
	
	public void generar() {
		nivel.generarEnemigos();
	}
	
	public void mover() {
		for(Entidad e : entidades) {
			e.moverEntidad();
			
		}
	}
	
	/**
	 * agregar una entidad al mapa y a la lista de entidades
	 * 
	 * @param entidadAAgregar entidad que se agregara al mapa
	 */
	
	public void agregarEntidad(Entidad entidadAAgregar) {
		
		entidades.add(entidadAAgregar);
		gui.add(entidadAAgregar.getGrafico());
		
	}
	
}
