package Juego;

import java.awt.*;
import java.util.LinkedList;

import Entidad.*;
import FabricaDisparos.FabricaDisparo;
import GUI.GUI;
import Niveles.Nivel;
import Niveles.NivelUno;
import Tienda.PosicionadorDeAliado;

public class Mapa {

	private static Mapa instance=null;
	protected LinkedList<Entidad> entidades,entidadesAAgregar;
	protected Juego juego;
	protected Nivel nivel;
	protected GUI gui;
	protected FabricaDisparo fabricaDisparos;
	private PosicionadorDeAliado posicionadorDeAliados;
	
	
	/**
	 * Crea lista de entidades y entidadesAAgregar
	 * Inicializa el nivel
	 * @param juego 
	 * @param gui pantalla prinpal del juego
	 */
	
	private Mapa(Juego juego, GUI gui) {
		this.juego=juego;
		nivel=new NivelUno(this);
		this.gui=gui;
		entidades=new LinkedList<Entidad>();
		entidadesAAgregar=new LinkedList<Entidad>();
		fabricaDisparos=FabricaDisparo.crearFabrica(this);
		posicionadorDeAliados=new PosicionadorDeAliado(this);
	}
	public  static Mapa crearMapa(Juego juego, GUI gui){
		if(instance==null){
			instance=new Mapa(juego,gui);
		}
		return instance;
	}
	
	
	public void generar() {
		nivel.generarEnemigos();
		nivel.generarAliados();

		posicionadorDeAliados.posicionarAliado(new Point(170,305),new ArqueroHumano(10,10,1500,"",fabricaDisparos));
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
		
		
		for(Entidad eAAgregar : entidadesAAgregar) {
			entidades.add(eAAgregar);
			gui.add(eAAgregar.getGrafico());
		}
		
		entidadesAAgregar=new LinkedList<Entidad>();
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
	
	public LinkedList<Entidad> getEntidades() {
		return entidades;
	}
	
	public void showEntidades() {
		for(Entidad e :this.getEntidades()) {
			System.out.println(e.getPos()+"\n");
		}
	}
	
	/**
	 * Getter de la fabrica de disparos de Aliados
	 * 
	 * @return fabricaDisparos
	 */
	
	public FabricaDisparo getFabricaDisparos() {
		return fabricaDisparos;
	}
	
}
