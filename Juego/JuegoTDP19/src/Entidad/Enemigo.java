package Entidad;
import java.awt.*;

import javax.swing.ImageIcon;

import Inteligencia.Inteligencia;

public abstract class Enemigo extends Personaje{
	
	protected int velocidad;
	protected int puntos;
	
	public Enemigo( Point pos,int vida,int damage, int width, int height,float velocidadAtaque,Inteligencia IA,int velocidad,int puntos) {
		super(pos,vida,damage,width,height,velocidadAtaque,IA);
		this.velocidad=velocidad;
		this.puntos=puntos;
		imagen=new ImageIcon [1];
	}
	/*
	 * retorna una cantidad de oro segun enemigo
	 */
	protected abstract int getOro();
	protected  int getPuntos() {
		return puntos;
	}

}