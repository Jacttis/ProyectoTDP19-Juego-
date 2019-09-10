package Juego;

import java.util.LinkedList;

import Entidad.Entidad;
import FabricaDisparos.FabricaDisparo;
import FabricaDisparos.FabricaDisparoAliado;
import GUI.GUI;
import Niveles.Nivel;
import Niveles.NivelUno;

public class Mapa {

	protected LinkedList<Entidad> entidades,entidadesAAgregar;
	protected Juego juego;
	protected Nivel nivel;
	protected GUI gui;
	protected FabricaDisparo fabricaDisparos;
	
	
	/**
	 * Crea lista de entidades y entidadesAAgregar
	 * Inicializa el nivel
	 * @param juego 
	 * @param gui pantalla prinpal del juego
	 */
	
	public Mapa(Juego juego, GUI gui) {
		this.juego=juego;
		nivel=new NivelUno(this);
		this.gui=gui;
		entidades=new LinkedList<Entidad>();
		entidadesAAgregar=new LinkedList<Entidad>();
		fabricaDisparos=new FabricaDisparoAliado(this);
	}
	
	
	public void generar() {
		nivel.generarEnemigos();
		nivel.generarAliados();
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
	 * agrega una entidad a la lista de entidades A agregar para que despues se agregue
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
	 * retorna la fabrica de disparos de Aliados
	 * 
	 * @return fabricaDisparos
	 */
	
	public FabricaDisparo getFabricaDisparos() {
		return fabricaDisparos;
	}
	
}
