package Entidad;

import java.awt.*;
import java.util.LinkedList;

import Colisionadores.Colisionador;
import ColisionadoresCombate.ColCombateNulo;
import ColisionadoresCombate.ColisionadorCombate;
import Estados.*;
import javax.swing.*;

import Graficos.Grafico;
import Inteligencia.Inteligencia;
import Juego.Mapa;


public abstract class Entidad {

	protected Point pos;
	protected int width=140,height=159;
	protected Inteligencia IA;
	protected Icon imagen[];
	protected JLabel [] graficos;
	protected double velocidad;
	protected int damage;
	protected Colisionador colisionador;
	protected ColisionadorCombate colisionadorCombate;
	protected LinkedList<Grafico> listaGraficos;

	
	
	public Entidad(Point pos,double velocidad, int damage) {

		this.velocidad=velocidad;
		this.pos=pos;
		this.damage=damage;

		colisionadorCombate=new ColCombateNulo();

		imagen=new ImageIcon[1];
		listaGraficos=new LinkedList<Grafico>();
	
	}

	public LinkedList<Grafico> getListaGraficos(){
		return listaGraficos;
	}

	public void actualizarGraficos(){
		for(Grafico grafico : listaGraficos)
			grafico.actualizarGrafico();
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

	public ColisionadorCombate getColisionadorCombate(){
		return colisionadorCombate;
	}
	
	public Point getPos() {
		return pos;
	}

	public double getVelocidad() {
		return velocidad;
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

	public abstract Entidad clone();

	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width,height);
	}

	public Rectangle getRangoCombate(){
		return getHitBox();
	}
}
