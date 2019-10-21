package Entidad;

import java.awt.*;

import Colisionadores.Colisionador;
import ColisionadoresCombate.ColCombateNulo;
import ColisionadoresCombate.ColisionadorCombate;
import Estados.*;
import javax.swing.*;

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

	
	
	public Entidad(Point pos,double velocidad, int damage) {

		this.velocidad=velocidad;
		this.pos=pos;
		this.damage=damage;

		colisionadorCombate=new ColCombateNulo();

	
	}
	
	/**
	 * Si todavia no se creo el grafico de la entidad, lo inicializa como un JLabel con imagen o GIF dentro
	 * y luego lo posiciona segun corresponda utilizando la posicion del point, y establece el ancho y alto
	 * segun los atributos width y height. 
	 * 
	 * @return JLabel con gif/imagen (grafico de la entidad)
	 */
	
	public JLabel [] getGraficos(){
		if(this.graficos == null){
			this.graficos=new JLabel [1];
			this.graficos[0] = new JLabel(imagen[0]);
			this.graficos[0].setBounds(this.pos.x, this.pos.y, width, height);
			
		}
		
		return this.graficos;
	}
	
	/**
	 * Cambia la imagen/gif del grafico por otra almacenada en el arreglo de Icon
	 * 
	 * @param dir posicion del arreglo para elegir la imagen/gif para cambiar
	 */
	
	public void cambiarGrafico(int dir) {
		if(this.graficos !=null) {
			this.graficos[0].setIcon(this.imagen[dir]);
			this.graficos[0].setBounds(this.pos.x,this.pos.y,width,height);
			
		}
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
		//System.out.println("Eliminarse entidad");
	}

	public abstract void serChocado(Colisionador colisionador);

	public abstract void serDetectado(ColisionadorCombate colisionadorCombate);

	public abstract Entidad clone();

	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width,height);
	}

	public Rectangle getHitBoxCombate(){
		return getHitBox();
	}
}
