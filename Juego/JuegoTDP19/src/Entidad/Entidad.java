package Entidad;

import java.awt.*;
import java.util.LinkedList;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorNulo;
import ColisionadoresCombate.ColCombateNulo;
import ColisionadoresCombate.ColisionadorCombate;
import Estados.*;
import javax.swing.*;

import Graficos.Grafico;
import Graficos.Graficos;
import Inteligencia.Inteligencia;
import Juego.Mapa;


public abstract class Entidad {

	protected Point pos;
	protected int width=140,height=160;
	protected Inteligencia IA;
	protected Icon imagen[];
	protected Graficos componentesGraficas;
	protected double velocidad;
	protected int damage;
	protected Colisionador colisionador;
	protected ColisionadorCombate colisionadorCombate;

	/**
	 * Inicializa la entidad asignandole la posicion, velocidad y damage parametrizados
	 * a sus atributos correspondientes.
	 *
	 * Inicializa la el atributo componentesGraficas el cual es de clase Graficos (lista de Graficos)
	 * Inicializa parcialmente a la entidad con ColisionadorNulo y ColCombateNulo
	 * Por ultimo inicializa parcialmente el arreglo de imagenes (la cantidad de sprites distintos que tendra) como un
	 * arreglo de 1 componente.
	 *
	 *
	 * @param pos
	 * @param velocidad
	 * @param damage
	 */
	
	public Entidad(Point pos,double velocidad, int damage) {

		this.velocidad=velocidad;
		this.pos=pos;
		this.damage=damage;

		componentesGraficas = new Graficos();

		colisionador = new ColisionadorNulo();
		colisionadorCombate=new ColCombateNulo();

		imagen=new ImageIcon[1];

	}

	/**
	 * Setters y getters de atributos.
	 *
	 */

	public Graficos getComponentesGraficas(){
		return componentesGraficas;
	}

	public void actualizarGraficos(){
		componentesGraficas.actualizarGraficos();
	}


	public Inteligencia getInteligencia() {
		return IA;
	}


	public int getWidth(){ return width; }

	public int getHeight(){ return height; }
	
	public void setWidth(int Width) {
		width=Width;
	}
	
	public void setHeight(int Height) {
		height=Height;
	}


	public Colisionador getColisionador(){
		return colisionador;
	}

	public void setColisionador(Colisionador nuevoColisionador){
		colisionador=nuevoColisionador;
	}

	public ColisionadorCombate getColisionadorCombate(){
		return colisionadorCombate;
	}
	
	public Point getPos() {
		return pos;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double nuevaVelocidad){
		velocidad=nuevaVelocidad;
	}

	public void setDamage(int nuevoDamage) {
		damage=nuevoDamage;
	}

	public int getDamage() {
		return damage;
	}


	/**
	 * Actualiza la entidad.
	 * En este caso enviandole el mensaje actualizarEntidad a la Inteligencia
	 *
	 */
	
	public void actualizarEntidad() {
      	IA.actualizarEntidad();
	}

	/**
	 * Posiciona a la entidad en el mapa
	 * Le asigna la posicion parametrizada al atributo pos.
	 *
	 * @param pos
	 */
	
	public void posicionar(Point pos){
		this.pos=pos;
	}

	/**
	 *	Desposiciona a la entidad del mapa.
	 *	Cambia su posicion por una nuevo posicion ubicada fuera del
	 *	mapa (0,0)
	 *
	 */

	public void desposicionarDelMapa(){
		this.pos = new Point(0,0);
	}

	/**
	 * La entidad se elimina del mapa llamando al eliminarEntidad de Mapa con esta misma
	 * entidad parametrizada.
	 */

	public void eliminarse(){
		Mapa.getMapa().eliminarEntidad(this);

	}

	/**
	 * Metodo abstracto que recibe un colisionador como parametro
	 * para luego enviarle un mensaje dependiendo de que entidad se trate
	 * (VISITOR)
	 *
	 * @param colisionador
	 */

	public abstract void serChocado(Colisionador colisionador);

	/**
	 * Metodo abstracto que recibe un colisionadorCombate como parametro
	 * para luego enviarle un mensaje dependiendo de que entidad se trate
	 * (VISITOR)
	 *
	 * @param colisionadorCombate
	 */

	public abstract void serDetectado(ColisionadorCombate colisionadorCombate);


	/**
	 * Retorna un Rectangle con las dimensiones (x,y,width,height)
	 * de la entidad.
	 *
	 * @return
	 */

	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width,height);
	}

	/**
	 * Retorna un Rectangle con las dimensiones del Rango de Combate
	 * de la entidad (En este caso como Entidad no tiene rango devuelve el hitbox normal)
	 *
	 * @return
	 */

	public Rectangle getRangoCombate(){
		return getHitBox();
	}

}
