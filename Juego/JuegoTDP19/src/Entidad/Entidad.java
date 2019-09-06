package Entidad;

import java.awt.*;

import javax.swing.*;

import Inteligencia.Inteligencia;




public abstract class Entidad {

	protected Point pos;
	protected int width=140,height=159;
	protected Inteligencia IA;
	protected Icon imagen[];
	protected JLabel grafico;
	protected double velocidad;
	
	public Entidad(Point pos,double velocidad) {
		
		this.velocidad=velocidad;
		this.pos=pos;
	
	}
	
	/**
	 * Si todavia no se creo el grafico de la entidad, lo inicializa como un JLabel con imagen o GIF dentro
	 * y luego lo posiciona segun corresponda utilizando la posicion del point, y establece el ancho y alto
	 * segun los atributos width y height. 
	 * 
	 * @return JLabel con gif/imagen (grafico de la entidad)
	 */
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(imagen[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
			
		}
		
		return this.grafico;
	}
	
	/**
	 * Cambia la imagen/gif del grafico por otra almacenada en el arreglo de Icon
	 * 
	 * @param dir posicion del arreglo para elegir la imagen/gif para cambiar
	 */
	
	public void cambiarGrafico(int dir) {
		if(this.grafico!=null) {
			this.grafico.setIcon(this.imagen[dir]);
			this.grafico.setBounds(this.pos.x,this.pos.y,width,height);
			
		}
	}
	
	public Inteligencia getInteligencia() {
		return IA;
	}
	
	/**
	 * Setter de width y height
	 */
	
	public void setWidth(int Width) {
		width=Width;
	}
	
	public void setHeight(int Height) {
		height=Height;
	}
	
	public Point getPos() {
		return pos;
	}
	public double getVelocidad() {
		return velocidad;
	}
	
	public void moverEntidad() {
		IA.moverEntidad();
	}
	
}
