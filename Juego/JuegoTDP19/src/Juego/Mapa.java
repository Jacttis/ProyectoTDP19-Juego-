package Juego;

import java.awt.*;
import java.util.LinkedList;

import Entidad.*;
import FabricaDisparos.FabricaDisparo;
import GUI.GUI;
import Niveles.Nivel;
import Niveles.NivelDos;
import Niveles.NivelUno;
import Tienda.PosicionadorDeAliado;
import Tienda.Tienda;

import javax.swing.*;

public class Mapa {

	private static Mapa instance=null;
	protected LinkedList<Entidad> entidades,entidadesAAgregar,entidadesAEliminar;
	protected LinkedList<Personaje> personajesAAgregar,personajesAEliminar;
	protected Juego juego;
	protected Nivel nivel;
	protected GUI gui;
	
	
	/**
	 * Crea lista de entidades y entidadesAAgregar
	 * Inicializa el nivel
	 * @param juego 
	 * @param gui pantalla prinpal del juego
	 */
	
	private Mapa(Juego juego, GUI gui) {
		this.juego=juego;
		nivel=new NivelUno();
		this.gui=gui;
		entidades=new LinkedList<Entidad>();
		entidadesAAgregar=new LinkedList<Entidad>();
		entidadesAEliminar=new LinkedList<Entidad>();

		personajesAAgregar=new LinkedList<Personaje>();
		personajesAEliminar=new LinkedList<Personaje>();


	}
	public  static Mapa crearMapa(Juego juego, GUI gui){
		if(instance==null){
			instance=new Mapa(juego,gui);
		}
		return instance;
	}

	public  static Mapa getMapa(){
		if(instance==null){
			System.out.println("Mapa nulo.");
		}
		return instance;
	}
	
	
	public void generar() {
		nivel.empezarNivel();

	}
	
	
	/**
	 * Recorre la lista de entidades para actualizarlas
	 * 
	 * Luego de terminar de recorrer entidades, recorre entidadesAAgregar
	 * para agregarlas a la lista de entidades
	 * 
	 */
	
	public void mover() {
		
		for(Entidad e : entidades) {
			e.actualizarEntidad();

		}

		for(Entidad eAEliminar : entidadesAEliminar){
			entidades.remove(eAEliminar);
			eliminarEntidadGrafica(eAEliminar);
			//System.out.println("Entidades : "+entidades.size());
		}
		
		for(Entidad eAAgregar : entidadesAAgregar) {
			entidades.add(eAAgregar);
			agregarEntidadGrafica(eAAgregar);
			//System.out.println("Entidades : "+entidades.size());
		}

		for(Personaje pAAgregar : personajesAAgregar){
			entidades.add(pAAgregar);
			agregarPersonajeGrafica(pAAgregar);

		}

		for(Personaje pAEliminar : personajesAEliminar){
			entidades.remove(pAEliminar);
			eliminarPersonajeGrafica(pAEliminar);

		}

		entidadesAAgregar=new LinkedList<Entidad>();
		entidadesAEliminar=new LinkedList<Entidad>();
		personajesAEliminar=new LinkedList<Personaje>();
		personajesAAgregar=new LinkedList<Personaje>();

		colisionar();

		verificarDerrota();

	}
	
	/**
	 * Agrega una entidad a la lista de entidades A agregar para que despues se agregue
	 * a la lista de entidades en la funcion mover()
	 * 
	 * @param entidadAAgregar entidad que se agregara al mapa
	 */
	
	public void agregarEntidad(Entidad entidadAAgregar) {
		entidadesAAgregar.add(entidadAAgregar);
	}

	public void eliminarEntidad(Entidad entidadAEliminar){
		entidadesAEliminar.add(entidadAEliminar);

	}

	public void agregarPersonaje(Personaje personajeAAgregar){
		personajesAAgregar.add(personajeAAgregar);
	}

	public void eliminarPersonaje(Personaje personajeAEliminar){
		personajesAEliminar.add(personajeAEliminar);

		for(Enemigo e : nivel.getEnemigosGenerados()){
			if(e.equals(personajeAEliminar)) {
				nivel.removerEnemigo(e);
				break;
			}

		}
	}



	public void agregarPersonajeGrafica(Personaje personaje){
		gui.add(personaje.getGrafico());
		gui.add(personaje.getEtiquetaVida());
		gui.repaint();
	}

	public void eliminarPersonajeGrafica(Personaje personaje){
		gui.remove(personaje.getGrafico());
		gui.remove(personaje.getEtiquetaVida());
		gui.repaint();
	}

	public void agregarEntidadGrafica(Entidad entidad){
		gui.add(entidad.getGrafico());
		gui.repaint();
	}


	public void eliminarEntidadGrafica(Entidad entidad){
		gui.remove(entidad.getGrafico());
		gui.repaint();
	}
	
	public LinkedList<Entidad> getEntidades() {
		return entidades;
	}
	
	public void showEntidades() {
		for(Entidad e :this.getEntidades()) {
			System.out.println(e.getPos()+"\n");
		}
	}


	/**
	 *  Recorre la lista de entidades y toma de a dos entidades para
	 *  verificar si colisionan entre si.
	 *
	 *
	 */


	public void colisionar() {
		for(int i=0; i<entidades.size();i++) {
			Entidad e1= entidades.get(i);
			for(int j=i+1;j<entidades.size();j++) {
				Entidad e2=entidades.get(j);
				verificarColision(e1,e2);
			}
		}
	}

	/**
	 * Utilizando Rectangle crea rectangulos con la posicion de cada entidad y el ancho y alto,
	 * para luego mediante el comando intersects verificar si se estan chocando.
	 *
	 * Si se estan chocando, le manda a cada entidad el mensaje que fue chocado con el colisionador de la otra entidad.
	 *
	 * @param e1
	 * @param e2
	 */

	private void verificarColision(Entidad e1, Entidad e2) {
		//el rectangulo es mas chico que el tamanio real de la entidad para que las colisiones parezcan mas reales
		Rectangle r1= e1.getHitBox();
		Rectangle r2= e2.getHitBox();
		if(r1.intersects(r2)) {
			e1.serChocado(e2.getColisionador());
			e2.serChocado(e1.getColisionador());
		}

	}

	/**
	 * Cuando se eliminen todos los enemigos, se generara el siguiente nivel.
	 * Este metodo es llamado desde nivel.
	 * @param nivelNuevo
	 */
	public void cambiarNivel(Nivel nivelNuevo){
		limpiarMapa();
		this.nivel=nivelNuevo;
		generar();
	}

	//Los metodos de derrota deben pasarse a Juego despues.

	public void verificarDerrota(){
		if(nivel.verificarEnemigos())
			perdio();
	}

	public void perdio(){
		limpiarMapa();
		juego.gameOver();
		System.out.println("Perdiste pete.");
	}

	private void limpiarMapa(){
		for(Entidad entidad : entidades){
			entidad.eliminarse();
		}

		Tienda.getTienda().aumentarOro(nivel.getOroPremio());
	}

}
