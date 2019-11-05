package Entidad;

import java.awt.*;
import java.util.LinkedList;

import Colisionadores.Colisionador;
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
	protected LinkedList<Grafico> listaGraficos;

	
	
	public Entidad(Point pos,double velocidad, int damage) {

		this.velocidad=velocidad;
		this.pos=pos;
		this.damage=damage;

		componentesGraficas = new Graficos();

		colisionadorCombate=new ColCombateNulo();

		imagen=new ImageIcon[1];
		listaGraficos=new LinkedList<Grafico>();
	
	}


	public Graficos getComponentesGraficas(){
		return componentesGraficas;
	}

	public void actualizarGraficos(){
		componentesGraficas.actualizarGraficos();
	}


	public Inteligencia getInteligencia() {
		return IA;
	}
	
	/**
	 * Setter y getter de width y height
	 */


	public int getWidth(){ return width; }

	public int getHeight(){ return height; }
	
	public void setWidth(int Width) {
		width=Width;
	}
	
	public void setHeight(int Height) {
		height=Height;
	}



	/**
	 * Getter de colisionador
	 *
	 * @return colisionador
	 */

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
	
	/**
	 * Actualiza la posicion de la entidad 
	 *
	 */
	
	public void actualizarEntidad() {
      	IA.actualizarEntidad();
	}

	public void setDamage(int nuevoDamage) {
		damage=nuevoDamage;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void posicionar(Point pos){

	}


	public int getPuntos(){
		return 0;
	}


	public void eliminarse(){
		Mapa.getMapa().eliminarEntidad(this);

	}

	public abstract void serChocado(Colisionador colisionador);

	public abstract void serDetectado(ColisionadorCombate colisionadorCombate);


	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width,height);
	}

	public Rectangle getRangoCombate(){
		return getHitBox();
	}

}
