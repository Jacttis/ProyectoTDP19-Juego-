package Entidad;

import java.awt.*;

import javax.swing.*;

import Inteligencia.Inteligencia;




public abstract class Entidad {

	protected Point pos;
	protected int width,height;
	protected Inteligencia IA;
	protected Icon imagen[];
	protected JLabel grafico;
	
	public Entidad(Point pos, int width, int height, Inteligencia ia) {
		IA=ia;
		this.pos=pos;
		this.width=width;
		this.height=height;
	
	}
	
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(imagen[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
			
		}
		
		return this.grafico;
	}
	
	public void cambiarGrafico(int dir) {
		if(this.grafico!=null) {
			this.grafico.setIcon(this.imagen[dir]);
			this.grafico.setBounds(this.pos.x,this.pos.y,width,height);
			
		}
	}
	
	public Inteligencia getInteligencia() {
		return IA;
	}
	
	
	
}