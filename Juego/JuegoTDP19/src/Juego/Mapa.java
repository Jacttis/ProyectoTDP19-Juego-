package Juego;

import java.awt.*;
import java.util.LinkedList;

import Entidad.*;
import GUI.GUI;
import Graficos.TiposGrafico.Grafico;
import Niveles.Nivel;
import Niveles.NivelNulo;
import Niveles.NivelUno;
import Tienda.Tienda;
import Menu.Menu;

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
	 * Inicializa las listas entidades, entidadesAAgregar y entidadesAEliminar
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

	public static Mapa getMapa(){
		if(instance==null){
			System.out.println("Mapa nulo.");
		}
		return instance;
	}


	public void generar() {
		nivel.comenzarNivel();

	}


	/**
	 * Actualiza todas las entidades dentro de la lista entidades.
	 *
	 * Mediante listas auxiliares elimina o agrega nuevas entidades.
	 *
	 * Ejecuta el metodo colisionar
	 */

	public void mover() {

		for(Entidad e : entidades) {
			e.actualizarEntidad();

		}

		LinkedList<Entidad> entidadesAEliminarTemporal = new LinkedList<Entidad>();

		if(!entidadesAEliminar.isEmpty()) {

			//entidadesAEliminarTemporal.addAll(entidadesAEliminar); anterior linea de abajo es la nueva
			for(Entidad e:entidadesAEliminar){
				if(e!=null)
					entidadesAEliminarTemporal.add(e);
			}

			for (Entidad eAEliminar : entidadesAEliminarTemporal) {
				eliminarEntidadGrafica(eAEliminar);
				entidades.remove(eAEliminar);
			}

		}

		entidadesAEliminar.removeAll(entidadesAEliminarTemporal);

		LinkedList<Entidad> entidadesAAgregarTemporal= new LinkedList<Entidad>();

		if(!entidadesAAgregar.isEmpty()) {
			entidadesAAgregarTemporal.addAll(entidadesAAgregar);


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

	/**
	 * Inserta la Entidad parametrizada a la lista entidadesAEliminar para
	 * despues ser agregado al mapa.
	 *
	 * @param entidadAEliminar
	 */

	public void eliminarEntidad(Entidad entidadAEliminar){
		System.out.println(entidadAEliminar);
		entidadesAEliminar.add(entidadAEliminar);

	}

	/**
	 *
	 * Agrega los graficos de la entidad parametrizada
	 *
	 * @param entidad
	 */

	public void agregarEntidadGrafica(Entidad entidad){

		if(entidad!=null) {
			LinkedList<Grafico> listaGraficos = entidad.getComponentesGraficas().getListaGraficos();

			for (Grafico grafico : listaGraficos)
				gui.add(grafico.getGrafico());

			gui.repaint();
		}

	}

	/**
	 * Elimina los graficos de la entidad parametrizada
	 *
	 * @param entidad
	 */


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
	 * Ejecuta el metodo limpiarMapa, luego le asigna al atributo nivel
	 * el nivel siguiente (resultado del mensaje getNivelSiguiente a nivel)
	 * Cambia el fondo de la gui mediante el metodo cambiarFondo y parametrizando la imagen del nivel
	 * correspondiente
	 * Ejecuta el metodo generar de Mapa.
	 *
	 * @param nivelNuevo
	 */
	public void cambiarNivel(Nivel nivelNuevo){
		limpiarMapa();
		this.nivel=nivel.getNivelSiguiente();
		gui.cambiarFondo(nivel.getDireccionImagenFondoNivel());
		generar();
	}


	/**
	 * Termina el Juego indicando que pediste la partida y volviendo al menu principal.
	 */
	public void perdio(){
		this.nivel = new NivelNulo();
		gui.cambiarFondo(nivel.getDireccionImagenFondoNivel());
		Juego.getJuego().gameOver("GAME OVER");
	}

	/**
	 * Elimina todas las entidades
	 *
	 */

	private void limpiarMapa(){
		for(Entidad entidad : entidades){
			entidad.eliminarse();
		}
	}

	/**
	 * Remueve un Grafico parametrizado de la gui
	 *
	 * @param graficoARemover
	 */

	public void removerGrafico(Grafico graficoARemover){
		gui.remove(graficoARemover.getGrafico());
		gui.repaint();
	}

	/**
	 * Agrega un Grafico parametrizado a la gui
	 *
	 * @param graficoAAgregar
	 */

	public void agregarGrafico(Grafico graficoAAgregar){
		gui.add(graficoAAgregar.getGrafico());
		gui.repaint();
	}

	/**
	 * Retorna la gui
	 * @return  GUI
	 */

	public GUI getGui(){
		return gui;
	}

	/**
	 * Vuelve la instancia null asi al ejecutarse el juego devuelta
	 * se inicializa la instancia denuevo.
	 *
	 */

	public void gameOver(){
		instance=null;
	}
}
