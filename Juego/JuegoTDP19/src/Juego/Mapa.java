package Juego;

import java.awt.*;
import java.util.LinkedList;

import Entidad.*;
import Entidad.Enemigos.Enemigo;
import GUI.GUI;
import Graficos.Grafico;
import Niveles.Nivel;
import Niveles.NivelUno;
import Tienda.Tienda;

import javax.swing.*;

public class Mapa {

	private static Mapa instance=null;
	protected LinkedList<Entidad> entidades,entidadesAAgregar,entidadesAEliminar;
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
		gui.cambiarFondo(nivel.getDireccionImagenFondoNivel());

		entidades=new LinkedList<Entidad>();
		entidadesAAgregar=new LinkedList<Entidad>();
		entidadesAEliminar=new LinkedList<Entidad>();


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
		nivel.comenzarNivel();

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

		LinkedList<Entidad> entidadesAEliminarTemporal = new LinkedList<Entidad>();

		if(!entidadesAEliminar.isEmpty()) {

			for (Entidad en : entidadesAEliminar)
				entidadesAEliminarTemporal.add(en);


			for (Entidad eAEliminar : entidadesAEliminarTemporal) {
				entidades.remove(eAEliminar);
				eliminarEntidadGrafica(eAEliminar);
			}

		}

		entidadesAEliminar.removeAll(entidadesAEliminarTemporal);

		LinkedList<Entidad> entidadesAAgregarTemporal= new LinkedList<Entidad>();

		if(!entidadesAAgregar.isEmpty()) {
			for (Entidad e : entidadesAAgregar)
				entidadesAAgregarTemporal.add(e);


			for (Entidad eAAgregar : entidadesAAgregarTemporal) {
				entidades.add(eAAgregar);
				agregarEntidadGrafica(eAAgregar);
			}

		}

		entidadesAAgregar.removeAll(entidadesAAgregarTemporal);



		colisionar();

	}
	
	/**
	 * Agrega una entidad a la lista de entidades A agregar para que despues se agregue
	 * a la lista de entidades en la funcion mover()
	 * 
	 * @param entidadAAgregar entidad que se agregara al mapa
	 */
	
	public void agregarEntidad(Entidad entidadAAgregar) {
		entidadAAgregar.actualizarGraficos();
		entidadesAAgregar.add(entidadAAgregar);
	}

	public void eliminarEntidad(Entidad entidadAEliminar){
		entidadesAEliminar.add(entidadAEliminar);

	}


	public void agregarEntidadGrafica(Entidad entidad){

		LinkedList<Grafico> listaGraficos=entidad.getComponentesGraficas().getListaGraficos();

		for(Grafico grafico : listaGraficos)
			gui.add(grafico.getGrafico());

		gui.repaint();
	}


	public void eliminarEntidadGrafica(Entidad entidad){

		LinkedList<Grafico> listaGraficos=entidad.getComponentesGraficas().getListaGraficos();

		for(Grafico grafico : listaGraficos)
			gui.remove(grafico.getGrafico());

		entidad.desposicionarDelMapa();

		gui.repaint();
	}



	/**
	 *  Recorre la lista de entidades y toma de a dos entidades para
	 *  verificar si colisionan entre si.
	 *
	 *
	 */


	private void colisionar() {
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

		Rectangle r3= e1.getRangoCombate();

		if(r3.intersects(r2)){
			e2.serDetectado(e1.getColisionadorCombate());
		}

		Rectangle r4 = e2.getRangoCombate();

		if(r4.intersects(r1)){
			e1.serDetectado(e2.getColisionadorCombate());
		}

	}


	/**
	 * Cuando se eliminen todos los enemigos, se generara el siguiente nivel.
	 * Este metodo es llamado desde nivel.
	 * @param nivelNuevo
	 */
	public void cambiarNivel(Nivel nivelNuevo){
		limpiarMapa();
		this.nivel=nivel.getNivelSiguiente();
		gui.cambiarFondo(nivel.getDireccionImagenFondoNivel());
		generar();
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
	}


	public void removerGrafico(Grafico graficoARemover){
		gui.remove(graficoARemover.getGrafico());
		gui.repaint();
	}

	public void agregarGrafico(Grafico graficoAAgregar){
		gui.add(graficoAAgregar.getGrafico());
		gui.repaint();
	}

	public GUI getGui(){
		return gui;
	}

}
